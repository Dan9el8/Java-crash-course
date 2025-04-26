class input {
    public static void main(String[] args)
        throws java.io.IOException{
            char ch;
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
            System.out.print("Your key is: " + ch);
        }
}

//throws.java.io.IOException(Necessary to handle input errors)