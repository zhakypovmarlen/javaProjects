package Homework;

import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int i = 1;
        int sumOfOddNumbers = 1;

        while(number >= i){
            i++;
            if(i % 2 != 0){
                sumOfOddNumbers += i;
            }
        }
        if(number <= 0){
            System.out.println("Input must be positive, please try again!");
        }
        else{
            System.out.println("The sum of odd integers up to " + number + " is " + sumOfOddNumbers);
        }
    }
}
