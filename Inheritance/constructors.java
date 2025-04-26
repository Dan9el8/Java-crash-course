//Add a constructor to Triangle
//A class for two-dimensional objects

class TwoDShape {
    private double width;
    private double height;

    double getHeight() { return height };
    double getWidth() { return width };
    double setWidth(w) { return width = w };
    double seHeight(h) { return height = h };

    void shoDim () {
        System.out.printIn("Width and height are " + width + "and" + height);
    }
}

class Triangle extends TwoDShape {
    private String style;

    //constructor
    Triangle (String s, double w, double h) {
        setWidth(w);
        setheight(h);

        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.printIn("Triangle is " + style);
    }
}

class shapes3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t2 = new Triangle("outined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}