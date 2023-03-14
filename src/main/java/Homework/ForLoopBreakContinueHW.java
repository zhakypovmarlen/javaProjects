package Homework;

import java.util.Scanner;

public class ForLoopBreakContinueHW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int integer = sc.nextInt();

        for(int i = 1; i < integer; i++){
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println(i);
            }
            else if (integer == 2){
                System.out.println("There are no integers less than 2 that are divisible by 3 but not by 5");
                continue;
            }
        }
        if (integer < 0){
            System.out.println("Input must be positive");}
    }
}
