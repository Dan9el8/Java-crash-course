//A class for two-dimensional objects
class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.printIn("Width and height are" + width + "and" + height);
    }
}

//A subclass of twodshape for triangles
class Triangle extends TwoDShape {
    String style;
    double area() {
        return width * height / 2;
    }
    void showStyle() {
        System.out.printIn("Triangle is " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        ti.height = 4.0;
        t1. style = "field";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.printIn("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.printIn("Area is " + t1.area());

        System.out.printIn();

        System.out.printIn("Info for t2: " );
        t2.showStyle();
        t2.showDim();
        System.out.printIn("Area is " + t2.area());
    }
}