package Homework;

public class PracticeOperatorsHW2 {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println(sum);

///////////////////////////////////////////////

        int q = 5;
        int w = 9;
        int e = 10;
        int sum2 = q + w + e;
        System.out.println(sum2);

////////////////////////////////////////////////

        byte first = 1 + 2;
        byte second = 3 - 1;
        byte third = 2 * 2;
        byte fourth = 4 / 2;
        byte fifth = 2 + 8;
        byte sixth = 10 % 7;
        System.out.println("1 + 2 = " + first);
        System.out.println("3 - 1 = " + second);
        System.out.println("2 * 2 = " + third);
        System.out.println("4 / 2 = " + fourth);
        System.out.println("2 + 8 = " + fifth);
        System.out.println("10 % 7 = " + sixth);

///////////////////////////////////////////////////

        byte length = 9;
        byte width = 5;
        int areaOfRectangle = length * width;
        int perOfRectangle = 2 * (length + width);
        System.out.println("The area of a rectangle is: " + areaOfRectangle);
        System.out.println("The perimeter of rectangle is: " + perOfRectangle);

/////////////////////////////////////////////////////

        int eq1 = (((8 + 2345) / 3) % 5) * 5;
        System.out.println(eq1);

/////////////////////////////////////////////////////

        int eq2 = 8;
        eq2 += 2345;
        eq2 /= 3;
        eq2 %= 5;
        eq2 *= 5;
        System.out.println(eq2);

/////////////////////////////////////////////////////

        boolean isEqual = 23 == 45;
        System.out.println(isEqual);

/////////////////////////////////////////////////////

        boolean isEqual1 = -10 == 10;
        System.out.println(isEqual1);
    }
}
