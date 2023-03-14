package scannerClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        System.out.println("The multiplication is: " + (num1 * num2 * num3));

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc2.next();

        System.out.println("Enter your age: ");
        int age = sc2.nextInt();

        System.out.println("Enter your last name: ");
        String lastName = sc2.next();

        System.out.println("Your full name is " + name + " " + lastName + " and your age is " + age);











    }

}