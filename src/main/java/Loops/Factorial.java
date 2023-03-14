package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur integer: ");
        int number = sc.nextInt();

        int i = 1;
        int factorial = 1;

        while (i < number) {
            i++;
            factorial *= i;
        }
        if (number <= 0) {
            System.out.println("Enter a positive integer!");}
        else{
                System.out.println("Factorial of " + number + " is " + factorial);
            }
        }
    }

