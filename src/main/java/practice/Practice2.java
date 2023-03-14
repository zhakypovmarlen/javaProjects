package practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Is it true or false: ");
        boolean a = sc.nextBoolean();
        System.out.println("Is it true or false");
        boolean b = sc.nextBoolean();

        if (a == true && !b) {
            System.out.println("A is true and B is false");
        } else if (a == false && b == true) {
            System.out.println("A is false and b is true");
        } else if (a && b) {
            System.out.println("Both A and B are true");
        } else if (a == true || b == true) {
            System.out.println("Either A or B is true");
        } else if (!a && !b) {
            System.out.println("Both A and B are false");
        } else {
            System.out.println("Wrong input");
        }





    }
}
