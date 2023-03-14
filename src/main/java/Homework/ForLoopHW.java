package Homework;

import java.util.Scanner;

public class ForLoopHW {
    public static void main(String[] args) {

        System.out.println("Assignment #1");

        for (int i = 1; i <= 50; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }

/////////////////////////////////////////////////////
        System.out.println("Assignment #2");
        for (int i = 2; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

/////////////////////////////////////////////////////

        System.out.println("Assignment #3");

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

//////////////////////////////////////////////////////

        System.out.println("Assignment #4");

        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

///////////////////////////////////////////////////////

        System.out.println("Assignment #5");


        for (int i = 1; i <= 41; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

////////////////////////////////////////////////////////////////

        System.out.println("Assignment #6");
         int sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum is: " + sum);

////////////////////////////////////////////////////////////////

        System.out.println("Assignment #7");

        int num1 = 1234;
        int sum1 = 0;
        for (int i = num1; i > 0; i = i / 10) {
            sum1 += i % 10;
        }
        System.out.println(sum1);


/////////////////////////////////////////////////////////////////

        System.out.println("Assignment #8");

        for(int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

///////////////////////////////////////////////////////////////////

        System.out.println("Assignment #9");

        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }




    }
}
