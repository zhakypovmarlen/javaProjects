package practice;

import java.util.Scanner;

public class AscendingOrderOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1st number: ");
        int a = sc.nextInt();
        System.out.println("2nd number: ");
        int b = sc.nextInt();
        System.out.println("3rd number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c){
                System.out.println("Ascending order: " + c + ", " + b + ", " + a);
                System.out.println("Descending order: " + a + ", " + b + ", " + c);
            }
            else {
                System.out.println("Ascending order: " + b + ", " + c + ", " + a);
                System.out.println("Descending order: " + a + ", " + c + ", " + b);
            }
        }

        else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Ascending order: " + c + ", " + a + ", " + b);
                System.out.println("Descending order: " + b + ", " + a + ", " + c);            }
            else {
                System.out.println("Ascending order: " + a + ", " + c + ", " + b);
                System.out.println("Descending order: " + b + ", " + c + ", " + a);            }
        }

        else {
            if (b > a) {
                System.out.println("Ascending order: " + a + ", " + b + ", " + c);
                System.out.println("Descending order: " + c + ", " + b + ", " + a);            }
            else {
                System.out.println("Ascending order: " + b + ", " + a + ", " + c);
                System.out.println("Descending order: " + c + ", " + a + ", " + b);            }
        }
    }
}

