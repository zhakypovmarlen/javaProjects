package Loops;

public class PracticeLoops {
    public static void main(String[] args) {

        for(int i = 10; i >= 1; i--){
            System.out.println("The value of x is: " + i);
        }

////////////////////////////////////////////////////////////////////////////////

        for (int num = 10; num >= 0; num -= 2){
            System.out.println("The value of y is: " + num);
        }

        for (int num1 = 1; num1 <= 15; num1 += 2){
            System.out.println("The value of num is " + num1);
        }

/////////////////////////////////////////////////////////////////////

        int sum = 0;
        for (int num2 = 1; num2 <= 10; num2++){
            System.out.println("The value of i is: " + num2);
            sum = sum + num2;
        }

///////////////////////////////////////////////////////////////////

        int sum1 = 0;
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
            sum1 = sum1 + i;
        }
        System.out.println("Their sum is " + sum1);

/////////////////////////////////////////////////////////////////////


        for(int i = 7; i <= 100; i ++){
            System.out.println(i);
        }

    }
}
