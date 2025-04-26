## Exception Handling
# Objectives
Know the exception hierachy
Use try and catch
Understand the effects of an uncaught exception
Use multiple catch statements
Catch buclass exceptions
Throw an exception
Know the members of Throwable
Use funally
Use Throws
Know Java's built-in exceptions
Create custom exception classes

# Using try and catch
At the core of exception handling are try and catch, these two keywords work together, you can't have a catch without a try.
 Here is the general form of the try/catch exception handling blocks:

try {
// block of code to monitor for errors
}
catch (ExcepType1 exOb) {
// handler for ExcepType1
}
catch (ExcepType2 exOb) {
// handler for ExcepType2
}

# Using finally
Sometimes you will want to define a block of code that will execute when a try/catch block
is left. For example, an exception might cause an error that terminates the current method,
causing its premature return. However, that method may have opened a file or a network
connection that needs to be closed. Such types of circumstances are common in programming,
and Java provides a convenient way to handle them: finally.
To specify a block of code to execute when a try/catch block is exited, include a finally
block at the end of a try/catch sequence. The general form of a try/catch that includes finally
is shown here.

try {
// block of code to monitor for errors
}
catch (ExcepType1 exOb) {
// handler for ExcepType1
}
catch (ExcepType2 exOb) {
// handler for ExcepType2
}
//...
finally {
// finally code
}
