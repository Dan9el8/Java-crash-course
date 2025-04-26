## Multithreading Programming
# Objectives
Know the thread class and the runnable interface
Create thread
Create multiple threads
Determine when a thread ends
Use thread priorities
Understand thread synchronization
Use synchronized methods
Use synchronized blocks
Communicate between threads
Suspend, resume, and stop threads

A multithreaded program contains two or more parts that can run concurrently, each part of such a program is called a thread, and each thread defines a separate path of execution
There are two distinct types of multitasking: process-based and thread-based 

# The thread class and runnable interface
Java's multithreading system is built upon the thread class and its companion interface, runnable
Both are packaged in java.lang, Thread encapsulates a thread of execution
To creare a new thread you program will either extend thread or implement runnable interface

# Thread methods
final String getName( ) Obtains a thread’s name.
final int getPriority( ) Obtains a thread’s priority.
final boolean isAlive( ) Determines whether a thread is still running.
final void join( ) Waits for a thread to terminate.
void run( ) Entry point for the thread.
static void sleep(long milliseconds) Suspends a thread for a specified period of milliseconds.
void start( ) Starts a thread by calling its run( ) method.

# Creating a thread
You create a thread by instantiating an object of type Thread
Java defines two ways in which you can create a runnable object:
You can implement the runnable interface
You can extend the thread class
Runnable interface abstract a unit of executable code, you can construct a thread on any object that implements the runnable interface.
Runnable defines only one methods called run()

public void run()

Inside run() you will define the code that constitutes the new thread, the thread will end when run() returns

After you have created a class that implements Runnable, you will instantiate an object of type Thread on an object of that class. Thread defines several constructors. The one that we will use first is shown here:

Thread(Runnable threadOb)

# Determine when a thread ends
It is often useful to know when a thread has ended
Thread provides two means bywhich you can determine if a thread has ended, first you can call isAlive() on the thread

final boolean isAlive()

Additional forms of join() allow you to specify a maximum amount of time that yu want to wait for the specified thread to terminate

# Service ans Service provider basics
In java service is a program unit whose functiionality is defined by an interface or an abstract class, Thus a service in general way some form of program activity
A service defines the form of some action and a service provider supplies that action

Service providers are supported by the ServiceLoader which is a generic class packaged in java.util
It is declared like this:
class ServiceLoader<S>
S - specifies the service type