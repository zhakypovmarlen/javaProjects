package practice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();

        if(num1 % num2 == 0){
            System.out.println("Divisible");
        } else {
            System.out.println("Not divisible");
        }
    }
}
