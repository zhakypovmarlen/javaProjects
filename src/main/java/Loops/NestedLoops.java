package Loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int j = 1; j <= row; j++){
                System.out.print("");
                if(row == 5){
                    System.out.print("\t\t  ");
                } else if(row == 4){
                    System.out.print("  \t     ");
                } else if(row ==3){
                    System.out.print("\t\t\t ");
                } else if(row == 2){
                    System.out.print("\t\t\t\t");
                } else if(row == 1){
                    System.out.print("\t\t\t\t\t\t");
                }
                System.out.print("*");
            }
            System.out.println();
        }



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(!isPrime){
            System.out.println("It's not a prime number");
        }
        else {
            System.out.println("It is a prime number");
        }



    }
}
