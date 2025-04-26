## Program Control Statements
# Input Characters from the keyboard
To read a character from the keyboard, we will use System.in.read(),
Because System.in.read( ) is being used, the program must specify the throws
java.io.IOException clause. This line is necessary to handle input errors. It is part of
Java’s exception handling mechanism

# If Statement
The complete form of the if statement is 
* if(condition) statement;
else statement; 

if(condition)
{
statement sequence
}
else
{
statement sequence
}

# nested ifs
if (i == 10) {
    if (j < 20) a = b;
    if (k > 100) c = d;
    else a = c;
}
else a = d;

# The if-else-if ladder
if(condition)
statement;
else if(condition)
statement;
else if(condition)
statement;
.
.
.
else
statement;

# Traditional switch statement
switch(expression) {
case constant1:
statement sequence
break;
case constant2:
statement sequence
break;
case constant3:
statement sequence
break;
.
.
.
default:
statement sequence
}
