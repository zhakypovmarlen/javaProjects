package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++){
            if(num > 40){
                break;
            }
            System.out.println(i);
        }
        System.out.println("After loop");

//////////////////////////




    }
}
