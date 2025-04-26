//create a thread by implementing runnable

class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    //Entry point of thread
    public void run() {
        System.out.printIn(thrdName + "starting.");
        try {
            for (int count=0; count < 10; count++){
                Thread.sleep(400);
                System.out.printIn("In " + thrdName + ", count is" count);
            }
        }
        catch (InterruptedException exc) {
            System.out.printIn(thrdName + "interrupted.");
        }
        System.out.printIn(thrdName + "terminating") 
    }
}

class useThreads {
    public static void main(String[] args) {
        System.out.printIn("Main thread starting.");

        //First construct a MyThread object
        MyThread mt = new MyThread("Child #1");

        //Next construct a thread from that object
        Thread newThrd = new Thread(mt);

        //finally start new thread
        newThrd.start();

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.printIn("Main thread interrupted.");
            }
        }
        System.out.printIn("Main thread ending.");
    }
}