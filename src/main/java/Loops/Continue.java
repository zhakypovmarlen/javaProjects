package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st negative number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd positive number: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++ ){
            if(i % 2 == 0 && i < 0) {
                continue;
            }
            else if(i % 2 != 0 && i > 0){
                continue;
            }
            System.out.println(i);
            }








    }
}
