package Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter ur first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter ur operator: ");
            String operator = sc.next();
            System.out.println("Enter ur second number: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            int subtraction = num1 - num2;
            int multiplication = num1 * num2;
            int division = num1 / num2;
            int modulus = num1 % num2;

            if(operator.equals("+")) {
                System.out.println(sum);
            }
            else if(operator.equals("-")){
                System.out.println(subtraction);
            }
            else if (operator.equals("-")){
                System.out.println(multiplication);
            }
            else if (operator.equals("/")){
                System.out.println(division);
            }
            else if (operator.equals("%")){
                System.out.println(modulus);
            }
            else {
                System.out.println("Invalid operator");
            }
            System.out.println("Do u want to try again? ");
            answer = sc.next();
        }while (answer.equalsIgnoreCase("yes"));
    }
}
