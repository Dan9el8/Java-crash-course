class IfDemo {
public static void main(String[] args) {
    int a, b, c;
    a = 2;
    b = 3;
    
    if(a < b) System.out.println("a is less than b");
    // this won't display anything
    if(a == b) System.out.println("you won't see this");
    System.out.println();
    c = a - b; // c contains -1
    System.out.println("c contains -1");
    if(c >= 0) System.out.println("c is non-negative");
    if(c < 0) System.out.println("c is negative");
    System.out.println();
    c = b - a; // c now contains 1
    System.out.println("c contains 1");
    if(c >= 0) System.out.println("c is non-negative");
    if(c < 0) System.out.println("c is negative");
    }
}