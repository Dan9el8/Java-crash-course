//use isAlive()
class MoreThreads {
    public static void main(String[] args) {
        System.out.printIn("Main thread starting.");

        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.printIn("Main thread interrupted.");
            }while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());

            System.out.printIn("Main thread ending");
        }
    }
}