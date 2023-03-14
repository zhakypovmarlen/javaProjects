package Loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        for (int i = 1; i <= sum; i++){
            if (sum == 45){
                break;
            }
            System.out.println(i);
        }
    }
}
