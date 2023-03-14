package scannerClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

       /* System.out.println("Enter first number: ");
        double num1 = user.nextDouble();

        System.out.println("Enter arithmetic operator:  / * + - % ");
        String arithmeticOperator = user.next();

        System.out.println("Enter second number");
        double num2 = user.nextDouble();


       /* if (arithmeticOperator.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (arithmeticOperator.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (arithmeticOperator.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (arithmeticOperator.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }else if(arithmeticOperator.equals("%")){
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }else{
            System.out.println("Invalid input");
        }
        */


        Scanner user2 = new Scanner(System.in);

        System.out.println("Enter your integer");
        int int1 = user.nextInt();

        if(int1 >= 1 && int1 <= 10){
            System.out.println("Entered integer is: " + int1);
        } else {
            System.out.println("Invalid integer");
        }




        Scanner user3 = new Scanner(System.in);

        System.out.println("Enter your month");
        String str = user3.next();

        if(str.equalsIgnoreCase("January")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("February")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("March")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("April")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("May")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("June")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("July")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("August")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("September")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("October")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("November")){
            System.out.println("It is " + str);
        } else if (str.equalsIgnoreCase("December")){
            System.out.println("It is " + str);
        } else {
            System.out.println("Invalid input");
        }

        if(str.equalsIgnoreCase("December") || str.equalsIgnoreCase("January") || str.equalsIgnoreCase("February")){
            System.out.println("It is Winter");
        } else if (str.equalsIgnoreCase("March") || str.equalsIgnoreCase("April") || str.equalsIgnoreCase("May")){
            System.out.println("It is Spring");
        } else if (str.equalsIgnoreCase("June") || str.equalsIgnoreCase("July") || str.equalsIgnoreCase("August")){
            System.out.println("It is Summer");
        } else if (str.equalsIgnoreCase("September") || str.equalsIgnoreCase("October") || str.equalsIgnoreCase("November")){
            System.out.println("It is Fall");
        } else {
        }



    }
}
