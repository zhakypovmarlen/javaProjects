package switchStatement;

import java.util.Scanner;

public class IntroToSwitch {
    public static void main(String[] args) {

        int number = 3;

        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid value");
        }



        String digit = "three";

        switch(digit){
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
        }



        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number");
        String str = user.next();


        if(str.equalsIgnoreCase("One")){
            System.out.println(1);
        } else if (str.equalsIgnoreCase("Two")){
            System.out.println(2);
        } else if (str.equalsIgnoreCase("three")){
            System.out.println(3);
        } else if (str.equalsIgnoreCase("four")){
            System.out.println(4);
        } else if (str.equalsIgnoreCase("five")){
            System.out.println(5);
        } else {
            System.out.println("Invalid number");
        }





    }
}
