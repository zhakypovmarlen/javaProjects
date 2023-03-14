package IfElse;

import java.nio.file.LinkPermission;

public class EvenOrOdd {
    public static void main(String[] args) {

        int number = 9;

        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }


        int num1 = 10;
        int num2 = 15;

        if(num1 > num2){
            System.out.println(num1 + "is greater than " + num2);
        }else if(num1 < num2){
            System.out.println(num1 + " is less than " + num2);
        }else{
            System.out.println("Both numbers are equal");
        }






    }
}
