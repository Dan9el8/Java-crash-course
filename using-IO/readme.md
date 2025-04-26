## Using  I/O
# Objectives
Understand the stream
 Know the difference between byte and character streams
 Know Java’s byte stream classes
 Know Java’s character stream classes
 Know the predefined streams
 Use byte streams
 Use byte streams for file I/O
 Automatically close a file by using try-with-resources
 Read and write binary data
 Use random-access files
 Use character streams
 Use character streams for file I/O
 Apply Java’s type wrappers to convert numeric strings

 # Java's I/O Is built streams
 Java programs perform I/O through streams.
 An I/O stream is an abstraction that either produces or consumes information.
 A stream is linked to a physical device by the java I/O system
 Mordern versions of Java define two types of I/O streams byte and character

 # Byte streams classes
 Byte streams are defined by using two class hierachies. At the top of these two abstract classes: InputStream and OutputStream
 InputStream defines the characteristics common to byte input streams.
 OutputStreams describes the behaviour of bytes output streams

 BufferedInputStream Buffered input stream
BufferedOutputStream Buffered output stream
ByteArrayInputStream Input stream that reads from a byte array
ByteArrayOutputStream Output stream that writes to a byte array
DataInputStream An input stream that contains methods for reading the Java
standard data types
DataOutputStream An output stream that contains methods for writing the Java
standard data types
FileInputStream Input stream that reads from a file
FileOutputStream Output stream that writes to a file
FilterInputStream Implements InputStream
FilterOutputStream Implements OutputStream
InputStream Abstract class that describes stream input
ObjectInputStream Input stream for objects
ObjectOutputStream Output stream for objects
OutputStream Abstract class that describes stream output
PipedInputStream Input pipe
PipedOutputStream Output pipe
PrintStream Output stream that contains print( ) and println( )
PushbackInputStream Input stream that allows bytes to be returned to the stream
SequenceInputStream Input stream that is a combination of two or more input streams that
will be read sequentially, one after the other

# The Character Stream classes
Charecter streams are defined by using two class hierachies topped by these two abstract classes, Reader and Writer
Reader - Input
Writer - Output

BufferedReader Buffered input character stream
BufferedWriter Buffered output character stream
CharArrayReader Input stream that reads from a character array
CharArrayWriter Output stream that writes to a character array
FileReader Input stream that reads from a file
FileWriter Output stream that writes to a file
FilterReader Filtered reader
FilterWriter Filtered writer
InputStreamReader Input stream that translates bytes to characters
LineNumberReader Input stream that counts lines
OutputStreamWriter Output stream that translates characters to bytes
PipedReader Input pipe
PipedWriter Output pipe
PrintWriter Output stream that contains print( ) and println( )
PushbackReader Input stream that allows characters to be returned to the input stream
Reader Abstract class that describes character stream input
StringReader Input stream that reads from a string
StringWriter Output stream that writes to a string
Writer Abstract class that describes character stream output

# The predefined streams
int available( ) Returns the number of bytes of input currently available for reading.
void close( ) Closes the input source. Subsequent read attempts will generate
an IOException.
void mark(int numBytes) Places a mark at the current point in the input stream that will
remain valid until numBytes bytes are read.
boolean markSupported( ) Returns true if mark( )/reset( ) are supported by the invoking stream.
static InputStream nullInputStream( ) Returns an open, but null stream, which is a stream that contains
no data. Thus, the stream is always at the end of the stream and no
input can be obtained. The stream can, however, be closed.
int read( ) Returns an integer representation of the next available byte of input. –1
is returned when an attempt is made to read at the end of the stream.
int read(byte[ ] buffer) Attempts to read up to buffer.length bytes into buffer and returns the
actual number of bytes that were successfully read. –1 is returned
when an attempt is made to read at the end of the stream.
int read(byte[ ] buffer, int offset,
int numBytes)
Attempts to read up to numBytes bytes into buffer starting at
buffer[offset], returning the number of bytes successfully read. –1 is
returned when an attempt is made to read at the end of the stream.
byte[ ] readAllBytes( ) Reads and returns, in the form of an array of bytes, all bytes
available in the stream. An attempt to read at the end of the stream
results in an empty array.
byte[ ] readNBytes(int numBytes) Attempts to read numBytes bytes, returning the result in a byte
array. If the end of the stream is reached before numBytes bytes
have been read, then the returned array will contain less than
numBytes bytes.
int readNBytes(byte[ ] buffer, int offset,
int numBytes)
Attempts to read up to numBytes bytes into buffer starting at
buffer[offset], returning the number of bytes successfully read.
An attempt to read at the end of the stream results in zero bytes
being read.
void reset( ) Resets the input pointer to the previously set mark.
long skip(long numBytes) Ignores (that is, skips) numBytes bytes of input, returning the number
of bytes actually ignored.
void skipNBytes(long numBytes) Ignores (that is, skips) numBytes of input. Throws EOFException if
the end of the stream is reached before numBytes are skipped, or
IOException if an I/O error occurs.
long transferTo(OutputStream outStrm) Copies the contents of the invoking stream to outStrm, returning the number of bytes copied.

void close( ) Closes the output stream. Subsequent write attempts will generate
an IOException.
void flush( ) Causes any output that has been buffered to be sent to its
destination. That is, it flushes the output buffer.
static OutputStream
nullOutputStream( )
Returns an open, but null output stream, which is a stream to which
no output is written. The stream can, however, be closed.
void write(int b) Writes a single byte to an output stream. Note that the parameter
is an int, which allows you to call write( ) with expressions without
having to cast them back to byte.
void write(byte[ ] buffer) Writes a complete array of bytes to an output stream.
void write(byte[ ] buffer, int offset,
int numBytes)
Writes a subrange of numBytes bytes from the array buffer, beginning at buffer[offset].

# Reading console input
Because System.in is an instance of InputStream, you automatically have access to the methods defined by InputStream. This means that, for example, you can use the read( ) method to read bytes from System.in. There are three versions of read( ), which are shown here:

int read( ) throws IOException
int read(byte[ ] data) throws I/O exception
int read(byte[ ] data, int start, int max) throws IOException