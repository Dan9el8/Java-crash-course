## Inheritance
# Objectives
Understand inheritance basics
Call superclass constructors
Use super to access superclass members
Create multi level class hierachy
Know when constructors are called
Understand superclass references to subclass objects
Override methods
Use overrriden methods to achieve dynamic method dispatch
Use abstract classes
Use final
Know the Object class

Inheritance allows one to create a general class that defines traits common to a set of related items.
This class can then be inherited by other, more specific classes, each adding those things that are unique to it.
In java a class that is inherited is called superclass
The class that does the inheriting is called subclass, it inherits all of the variables and methods defined by the superclass and adds its own unique elements

# Inheritance basics
Java supports inheritance by allowing one class to incorporate another class into its declaration.
This is done using the extend keyword

Here is an illustration of inheritance in file inheritance.java

# Member Access and Inheritance
Although a subclass includes all of the members of its superclass, it cannot access those members of the superclass that have been declared private.
// Private members are not inherited.
// This example will not compile.
// A class for two-dimensional objects.
class TwoDShape {
    private double width; // these are
private double height; // now private
void showDim() {
System.out.println("Width and height are " +
width + " and " + height);
}
}
// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
String style;
double area() {
return width * height / 2; // Error! can't access
}
void showStyle() {
System.out.println("Triangle is " + style);
}
}

# Constructors and Inheritance
The constructor for the superclass constructs the superclass portion of the object and the constructor of the subclass construct the subclass part

# using super to call superclass constructors
A sbuclass can call a constructor defined by its superclass by use of the following form of super.
super(parameter-list);
Parameter list specifies any parameter needed by the constructor in the superclass 

# using super to access superclass members
There is a second form of super that acts somewhat like this, except that it always refer to the superclass in which it is used
This usage has the following general form:
super.member

# Creating a mutilevel Hierachy
You can build hierarchies thatcontain as many layers of inheritance as you like,
It is possible to use a subclass as a superclass of another
Example given three classes A,B andC, C can be a subclass of B which is a subclass of A
In this case C inherits all the aspects of B and A 

# The object class
Java defines one special class called object that is an implicit superclass of all other classes

Object clone( ) Creates a new object that is the same as the object being cloned.
boolean equals(Object object) Determines whether one object is equal to another.
void finalize( ) Called before an unused object is recycled. (Deprecated by JDK 9.)
Class<?> getClass( ) Obtains the class of an object at run time.
int hashCode( ) Returns the hash code associated with the invoking object.
void notify( ) Resumes execution of a thread waiting on the invoking object.
void notifyAll( ) Resumes execution of all threads waiting on the invoking object.
String toString( ) Returns a string that describes the object.
void wait( )
void wait(long milliseconds)
void wait(long milliseconds,
int nanoseconds)