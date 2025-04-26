## Introducing Classes Obects and Methods
# The key concepts in this topic are:
Fundamental of classes, understand how objects are crected, understand how reference vavriablers are assigned, create method, return values and use parameters
User the return keyword, Return a value from a method, add parameter to a method, utilize costructors, create parameterized constructors, understand new, understand garbage collection use this keyword.

Classes is a template that defines the form of an object, it specifies both data and the code that will operate on that data.
Objects are instances of classes.

# General form of class
class className{
    //declare intance variables
    type var1;
    type var2;
    //...
    type varN;

    //declare methods
    type method(aramters) {
        //body ,method
    }
    //...
    type methodN(parameters) {
        //body of method
    }

}

# Defining a class
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}

To create a vehicle object, you will use the statement like the following
Vehicle minivan - bew vehicle();// Create a vehicle object clalled minivan
Vehicle minivan; // declare reference to object
minivan = new Vehicle(); 
// allocate a Vehicle object
//To access the variables, use the dot(.) operator
object.member
minivan.fuelcap = 16;

# Reference variables and assignment
The new operator dynamically allocates (that is, allocates at run time) memory for an object
and returns a reference to it.

# Methods
Methods are subroutines that manipulate the data defined by the class and in mant cases provides the access to that data.
main() is reserved for methods that begins execution of your program
General form of method
ret-type name(parameter-list) {
    //body of method
} 
if the method does not return a value it must be (void)

# Returning a method
There are two conditions that cause a method to return : when the method's curly brace is encountered, when the return statement is executed
One return void and another return values

# Parameters
The value that receives the argument is called a parameter
Parameters are declared inside the parantheses that follow the methods name

# Constructors
A constructors initializes an object when it is created, it has the name as its class and is syntactically similar to method.
Here is a simple example that uses a constructor:
// A simple constructor.
class MyClass {
int x;
MyClass() {
x = 10;
}
}
class ConsDemo {
public static void main(String[] args) {
MyClass t1 = new MyClass();
MyClass t2 = new MyClass();
System.out.println(t1.x + " " + t2.x);
}
}
In this example, the constructor for MyClass is
MyClass() {
x = 10;
}
This constructor assigns the instance variable x of MyClass the value 10. This constructor is
called by new when an object is created. For example, in the line
MyClass t1 = new MyClass();
the constructor MyClass( ) is called on the t1 object, giving t1.x the value 10. The same is true
for t2. After construction, t2.x has the value 10. Thus, the output from the program is
10 10

Parameterized Constructors
In the preceding example, a parameter-less constructor was used. Although this is fine for
some situations, most often you will need a constructor that accepts one or more parameters.
Parameters are added to a constructor in the same way that they are added to a method: just
declare them inside the parentheses after the constructor’s name. For example, here, MyClass
is given a parameterized constructor:
// A parameterized constructor.
class MyClass {
int x;
MyClass(int i) {
x = i;
}
}
class ParmConsDemo {
public static void main(String[] args) {
MyClass t1 = new MyClass(10);
MyClass t2 = new MyClass(88);
System.out.println(t1.x + " " + t2.x);
}
}
The output from this program is shown here:
10 88

# Garbage collection
When no references
to an object exist, that object is assumed to be no longer needed, and the memory occupied by
the object is released. This recycled memory can then be used for a subsequent allocation.