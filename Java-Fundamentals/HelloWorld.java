     class HelloWorld {
          // A java program begins with a call to main().
          public static void main (String args[]) {
               System.out.println("Hello World");
          }
     }

     /*
     Entering Program - writting the program into your computer using a JDK Command Line Interface or a Intergrated Development Enviroment
     (name with extenstion .java)
     Compiling the Program - To compile the program, execute javac, specifying the name of the source file on the command line, as shown: javac example.java
     The Javac compiler creates a file called Example.class that contain the bytecode version of the code

     Program explanation line by line
       public static void main(String[] args) {
       }
       In general java programs begins execution by calling main()
       The public keyword is an access modifier. An access modifier determines how other parts of
the program can access the members of the class. When a class member is preceded by public,
then that member can be accessed by code outside the class in which it is declared. (The opposite
of public is private, which prevents a member from being used by code defined outside of its
class.)
The keyword static allows main( ) to be called before
an object of the class has been created.
The keyword void simply tells the compiler that main( ) does not
return a value.
String[ ] args, which declares a parameter named args.
This is an array of objects of type String. (Arrays are collections of similar objects.) Objects
of type String store sequences of characters. In this case, args receives any command-line
arguments present when the program is executed.
     */