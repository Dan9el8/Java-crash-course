## More data types and operators
Key Skills & Concepts
● Understand and create arrays
● Create multidimensional arrays
● Create irregular arrays
● Know the alternative array declaration syntax
● Assign array references
● Use the length array member
● Use the for-each style for loop
● Work with strings
● Apply command-line arguments
● Use type inference with local variables
● Use the bitwise operators
● Apply the ? operator

# Arrays
An array isa collection of variables of the same type, referred to by a common name

To declare a one-dimensional array, you can use this general form

type[] array-name = new type[size];
The following creates an int array of 10 elements and links it to an array reference variable named sample
int[] sample = new int[10]; 

In the preceding program, the nums array was given values by hand, using 10 separate
assignment statements. Although perfectly correct, there is an easier way to accomplish this.
Arrays can be initialized when they are created. The general form for initializing a onedimensional
array is shown here:
type[ ] array-name = { val1, val2, val3, ... , valN };
Here, the initial values are specified by val1 through valN. They are assigned in sequence,
left to right, in index order. Java automatically allocates an array large enough to hold the
initializers that you specify. There is no need to explicitly use the new operator. For example,
here is a better way to write the MinMax program:
// Use array initializers.
class MinMax2 {
public static void main(String[] args) {
int[] nums = { 99, -10, 100123, 18, -978,
5623, 463, -9, 287, 49 };
int min, max;
min = max = nums[0];
for(int i=1; i < 10; i++) {
if(nums[i] < min) min = nums[i];
if(nums[i] > max) max = nums[i];
}
System.out.println("Min and max: " + min + " " + max);
}
}

# Two dimensional array
To declare a two dimensional arraytable of size 10, 20 you would write
int [] [] table = new int[10] [20];

# Irregular arrays
Irregular Arrays
When you allocate memory for a multidimensional array, you need to specify only the memory
for the first (leftmost) dimension. You can allocate the remaining dimensions separately. For
example, the following code allocates memory for the first dimension of table when it is
declared. It allocates the second dimension manually.
int[][] table = new int[3][];
table[0] = new int[4];
table[1] = new int[4];
table[2] = new int[4];
Although there is no advantage to individually allocating the second dimension arrays
in this situation, there may be in others. For example, when you allocate dimensions
separately, you do not need to allocate the same number of elements for each index. Since
multidimensional arrays are implemented as arrays of arrays, the length of each array is
under your control. For example, assume you are writing a program that stores the number of
passengers that ride an airport shuttle. If the shuttle runs 10 times a day during the week and
twice a day on Saturday and Sunday, you could use the riders array shown in the following
program to store the information. Notice that the length of the second dimension for the first
five indices is 10 and the length of the second dimension for the last two indices is 2.
// Manually allocate differing size second dimensions.
class Ragged {
public static void main(String[] args) {
int[][] riders = new int[7][];
riders[0] = new int[10];
riders[1] = new int[10];
riders[2] = new int[10];
riders[3] = new int[10];
riders[4] = new int[10];
riders[5] = new int[2];
riders[6] = new int[2];
int i, j;
// fabricate some fake data
for(i=0; i < 5; i++)
for(j=0; j < 10; j++)
riders[i][j] = i + j + 10;
for(i=5; i < 7; i++)
for(j=0; j < 2; j++)
riders[i][j] = i + j + 10;
System.out.println("Riders per trip during the week:");
for(i=0; i < 5; i++) {
for(j=0; j < 10; j++)
System.out.print(riders[i][j] + " ");
System.out.println();
}
Here, the second dimensions
are 10 elements long.
But here, they are
2 elements long.
System.out.println();
System.out.println("Riders per trip on the weekend:");
for(i=5; i < 7; i++) {
for(j=0; j < 2; j++)
System.out.print(riders[i][j] + " ");
System.out.println();
}
}
}

# The for-each style for loop
When working with arrays, it is common to encounter situations in which each element in an
array must be examined, from start to finish. For example, to compute the sum of the values
held in an array, each element in the array must be examined. The same situation occurs when
computing an average, searching for a value, copying an array, and so on. Because such “start
to finish” operations are so common, Java defines a second form of the for loop that streamlines
this operation.
The second form of the for implements a “for-each” style loop. A for-each loop cycles
through a collection of objects, such as an array, in strictly sequential fashion, from start to
finish. For reasons that will become clear, for-each style loops have become quite popular
among both computer language designers and programmers. Interestingly, Java did not
originally offer a for-each style loop. However, several years ago (beginning with JDK 5),
the for loop was enhanced to provide this option. The for-each style of for is also referred
to as the enhanced for loop. Both terms are used in this book.
The general form of the for-each style for is shown here.
for(type itr-var : collection) statement-or-block
Here, type specifies the type, and itr-var specifies the name of an iteration variable that will
receive the elements from a collection, one at a time, from beginning to end. The collection
being cycled through is specified by collection. There are various types of collections that can
be used with the for, but the only type used in this book is the array. With each iteration of the
loop, the next element in the collection is retrieved and stored in itr-var. The loop repeats until
all elements in the collection have been obtained. Thus, when iterating over an array of size N,
the enhanced for obtains the elements in the array in index order, from 0 to N–1.

# Strings
Strings defines and supports character strings. in some other programming languages, a string is an array of characters.

# Constructing a string
You can construct a string just like any other type of object: by using new and calling the string constructor

string str = new String("Hello");

# Operating on Strings
The String class contains several methods that operate on strings. Here are the general forms
for a few:
boolean equals(str) Returns true if the invoking string contains the same character
sequence as str.
int length( ) Obtains the length of a string.
char charAt(index) Obtains the character at the index specified by index.
int compareTo(str) Returns less than zero if the invoking string is less than str, greater
than zero if the invoking string is greater than str, and zero if the
strings are equal.
int indexOf(str) Searches the invoking string for the substring specified by str. Returns
the index of the first match or –1 on failure.
int lastIndexOf(str) Searches the invoking string for the substring specified by str. Returns
the index of the last match or –1 on failure.