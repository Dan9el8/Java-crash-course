class guess {
    public static void main(String[] args)
        throws.java.io.IOException{
            char ch, answer = 'K';

            System.out.print("I'm thinking of a letter between A and z.")
            System.out.print("Can you guess it : ");

            ch = (char) System.in.read();
            if (ch == answer) System.out.print("Right");
            else System.out.print("Sorry you're wrong");
        }
}