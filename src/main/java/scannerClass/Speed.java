package scannerClass;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter the speed");
        int speed = user.nextInt();
        System.out.println("Is it your birthday today");
        boolean isBirthday = user.nextBoolean();


        if (speed <= 60) {
            System.out.println("No ticket");
            if (isBirthday == true) {
                System.out.println("Happy birthday");
            }
        } else if (speed > 60 && speed <= 80) {
            System.out.println("Small ticket");
            if (isBirthday == true) {
                System.out.println("But instead of small ticket, you will get no ticket. Because it is your birthday.");
            }
        } else if (speed > 80 && speed <= 100) {
            System.out.println("Medium ticket");
            if (isBirthday == true) {
                System.out.println("But instead  of medium ticket, you will get small ticket. Because it is your birthday.");
            }
        } else if (speed > 100) {
            System.out.println("Large ticket");
            if (isBirthday == true) {
                System.out.println("But instead  of large ticket, you will get medium ticket. Because it is your birthday.");
            }
        } else {
            System.out.println("Invalid speed input.");
        }







    }
}
