## Data types and Operators
# Data types
Boolean - Represent true/false values
Byte - 8-bit integer
char - Charactor
Double - Double-precision floating point
Float - Single-precision floating point
int - Integer
long - Long integer
short - Short integer

# Integers
byte - 8 -128 to 127
short - 16 -32768 to 32767
int 32 -2147,483,648 to 2,147,483,647
long 64 –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

# Literals
In java literls refer to fixed values that are represented in their human readable form
They are also called constants
All primitives are literals

# Hexadecimal., octal and binary literals
octal - 8
binary - 10
Hexadecimal - 16

# Character escape sequence
\' - Single quote
\" - Double quote
\\ - Backslash
\r - Carriage return
\n - new Line
\f - form feed
\t - Horizontal tab
b\ - Backspace
\ddd - Octal constant
\uxxxx - Hexadecimal constant
\s - Space
\endofline - Continue line 
" " - String

# Scoop and lifetime of Variables
Java allows variables to be declared within any block you are creating a new scope(block defines a scope)

# Operators
Java provides a rich operator enviroment
An operator is a sysmbol that tells the computer to perform a specific mathematical or logical manipulation

* Arithmetic Operators *
+ - Addition
- - Subtraction
* - Multiplication
/ - Division
% - Modulus/Remainder
++ - Increament
-- - Decreament 

When an increment or decrement operator precedes its operand,
Java will perform the corresponding operation prior to obtaining the operand’s value for use
by the rest of the expression. If the operator follows its operand, Java will obtain the operand’s
value before incrementing or decrementing it.

# Relational and Logical Operators
== Equal to
!= Not equal to
> Greater than
< less than
>= Greater than or equal to
<= Less than or equal to
& AND
| OR
^ XOR(exclusive OR)
|| Short-circuit AND
! NOT 

# Assignment Operator
int x, y, z;
x = y =z = 100 //set x, y,z to 100

# Short hand assignment
x = x + 10;
can be written using java shorthand as 
x += 10; //Tell compiler to assign x to the value of x plus 10

x -= 100;
//assign x to the value of x minus 100

