## More Classes and Methods
# Objectives
Control access to members
Pass objects to a method
Return object to a method
Overload methods
Overload constructors
use recursion
Apply static
Use inner classes
Use varargs

# Coontrolling Access to class members
There are two basic types of class members: public and private
A public member can be freely accessed by code defined outside of its class.
A private member can be aCCESSED only by by other methods defined by it's class
Member access control is achieved through the use of three access modifiers: public, private, protected
Access modifier precedes the rest of a member's type specification, that is it must begin a member's declaration statement, Here is an example:
public String errMsg;
private accountBalance bal;

private boolean isError(byte status) {

}

# Pass objects to methods
For example,
the following program defines a class called Block that stores the dimensions of a three dimensional block:
// Objects can be passed to methods.
class Block {
int a, b, c;
int volume;

Block(int i, int j, int k) {
a = i;
b = j;
c = k;
volume = a * b * c;
}
// Return true if ob defines same block.
boolean sameBlock(Block ob) {
if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
else return false;
}
// Return true if ob has same volume.
boolean sameVolume(Block ob) {
if(ob.volume == volume) return true;
else return false;
}
}
class PassOb {
public static void main(String[] args) {
Block ob1 = new Block(10, 2, 5);
Block ob2 = new Block(10, 2, 5);
Block ob3 = new Block(4, 5, 5);
System.out.println("ob1 same dimensions as ob2: " +
ob1.sameBlock(ob2));
System.out.println("ob1 same dimensions as ob3: " +
ob1.sameBlock(ob3));
System.out.println("ob1 same volume as ob3: " +
ob1.sameVolume(ob3));
}
}

# Return objects
A method can return any type of data including class types, for example, th clss ErrotMsg shown here could not be used to report errors

# Method Overloading
In java two or more methods within the same class can share the name as long as their parameter declaration are different.
When this ia the case the methods are said to be overload(polymorphism)

# Overloading Constructors
Like methods, constructors can also be overloaded, doing so allows tou to construct objects in a variety of ways for example

# recurssion
Its the process where a method calls itself