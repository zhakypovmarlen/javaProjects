package Homework;

import java.sql.SQLOutput;

public class PracticeIfElseHW2 {
    public static void main(String[] args) {

//1

        int num1 = 81;
        int num2 = 7;
        int num3 = 5;

        if (num1 == num2 || num1 == num3) {
            System.out.println("Two numbers are equal");
        } else if (num2 == num1 || num2 == num3) {
            System.out.println("Two number are equal");
        } else {
            System.out.println("None of the numbers are equal");
        }

//2

        if (num1 % 3 == 0) {
            System.out.println("Multiple of " + 3);
        } else if (num1 % 9 == 0) {
            System.out.println("Multiple of " + 9);
        } else {
            System.out.println("Not multiple of both numbers");
        }

//3

        num1 = 4;
        num2 = 3;

        if ((num1 + num2) % 2 == 0) {
            System.out.println("The sum is " + (num1 + num2) + " and it is even");
        } else {
            System.out.println("The sum is " + (num1 + num2) + " and it is odd");
        }


//4

        num1 = 58;

        boolean isPrime = true;

        for (int i = 0; i <= num1; i++){
            if(num1 % 2 == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It's prime");
        }
        else {
            System.out.println("It's not prime");
        }
    }
}

