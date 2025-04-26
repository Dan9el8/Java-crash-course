## Packages and Interface
Use packages
Understand how package affect access
Apply the protected access modifier
Import packages
Know Java's standard packages
Understand interface fundamentals
Implement an interface
Apply interface references
Understand interface variables
Extend interface
Create default, static and private interface methods

Packages are groups of related classes, they help organize your code and provide another layer of encapsulation.
An interface defines a set of methods that will be implemented by a class.

# Packages
First, it provides a
mechanism by which related pieces of a program can be organized as a unit. Classes defined within a package must be accessed through their package name.
Classes defined within a package can be made private to that package and not accessible by code outside the package.
All classes in java belong to some package, when no package statement is specified, the default packagew transparent
To create a package, put a package command at the top of a java source file.
The general form of the package statement:
package pkg;
This means that the directory in
which a package is stored must be precisely the same as the package name.

# Importing packages
When you use a class from another package, you can fully qualify the name of its package, as the proceeding examples

If ypu want to import the entire contents of a package, use an asterisk(*) for the class name.

Here is the general form of the import statement
import pkg.classname;

import mypack.MyClass;
import mypack *;

# java class library is contained in packages
This class library is often referred to as the Java API (Application Programming Interface). The Java API is stored in packages. At the top of the package hierarchy is java. Descending from java are several subpackages. Here are a few examples:

java.lang Contains a large number of general-purpose classes
java.io Contains I/O classes
java.net Contains classes that support networking
java.util Contains a large number of utility classes, including the Collections Framework
java.awt Contains classes that support the Abstract Window Toolkit

# Interfaces
An interfaceis syntactically similar to an abstract class, in that you can specify one or more methods that hve no body.
Those methods must be implemented by a class in order for their actions to be defined

Here is the simplified general form of a traditional interface

access interface name {
ret-type method-name1(param-list);
ret-type method-name2(param-list);
type var1 = value;
type var2 = value;
// ...
ret-type method-nameN(param-list);
type varN = value;
}

public interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}

# Implementing Interfaces
Once an interface has been defined, one or more classes can implement that interface
To implement an interface, include the implements clause in a class definition and then create the method reqired by the interface
The general form of a class that includes the implements clause looks like this.

class classname extends superclass implements interface {
// class-body
}