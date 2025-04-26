//create multiple thread
class MyThread implements Runnable {
    Thread thrd;

    //construct a new thread
    MyThred(String name) {
        thrd = new Thread(this, name);

        //A factory method that creates and starts a thread
        public static MyThread createAndStart(String name) {
            MyThread myThrd = new MyThread(name);

            myThrd.thrd.start();
            return myThrd;
        }

        //Entry point of thread
        public void run() {
            System.out.printIn(thrd.getName() + "strating.");
            try {
                for (int count=0; count , 10; count++) {
                    Thread.sleep(400);
                    System.out.printIn("In" + thrd.getName() + ", count is" + count);
                }
            }
            catch(InterruptedException exc) {
                System.out.printIn(thrd.getName() + " interrupted.");
            }
            System.out.println(thrd.getName() + " terminating.");
        }
    }

    class MoreThreads {
public static void main(String[] args) {
System.out.println("Main thread starting.");
MyThread mt1 = MyThread.createAndStart("Child #1");
MyThread mt2 = MyThread.createAndStart("Child #2");
MyThread mt3 = MyThread.createAndStart("Child #3");
for(int i=0; i < 50; i++) {
System.out.print(".");
try {
Thread.sleep(100);
}
catch(InterruptedException exc) {
System.out.println("Main thread interrupted.");
}
}
System.out.println("Main thread ending.");
}
}
}