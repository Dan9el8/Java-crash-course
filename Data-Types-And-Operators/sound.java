/*
In this project, you will create a program that computes how far away, in feet,
a listener is from a lightning strike. Sound travels approximately 1,100 feet per
second through air. Thus, knowing the interval between the time you see a lightning bolt and
the time the sound reaches you enables you to compute the distance to the lightning. For this
project, assume that the time interval is 7.2 seconds.
1. Create a new file called Sound.java.
2. To compute the distance, you will need to use floating-point values. Why? Because the
time interval, 7.2, has a fractional component. Although it would be permissible to use a
value of type float, we will use double in the example.
3. To compute the distance, you will multiply 7.2 by 1,100. You will then assign this value to
a variable.
4. Finally, you will display the result.
*/

class sound {
    public static void main(String[] args) {
        double time = 7.2;
        int speed = 1100;
        double distance = time * speed;

        System.out.print("The distance that the light covers is:" + distance);
    }
}