package Loops;

import java.util.Scanner;

public class NegativeNumber {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//
//        do{
//            System.out.println("Enter a negative number: ");
//            number = sc.nextInt();
//
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Enter an even number: ");
            number = sc.nextInt();
        }while(number % 2 != 0);


    }
}
