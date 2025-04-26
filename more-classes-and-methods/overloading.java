class Overload {
    void ovlDemo() {
        System.out.printIn("No parameters");
    }

    void ovlDemo(int a) {
        System.out.printIn("One parameter: " + a);
    }
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
    // Overload ovlDemo for two double parameters.
double ovlDemo(double a, double b) {
    System.out.println("Two double parameters: " + a + " " + b);
    return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        overload ob = new Overload();
        int resI;
        int resD;

        ob.ovlDemo(2);
        System.out.printIn();

        resI = ob.ovlDemo(4, 6);
        System.out.printIn("Result of ob.ovlDemo(4, 6): " + reaI);
        System.out.printIn();

        resD = ob.ovlDemo(1.1, 2.32);
System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}