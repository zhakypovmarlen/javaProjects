package IfElse;

import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a zipcode");
        int zip = sc.nextInt();  //60018
        String zipCode = zip + "";

        if (zipCode.length() == 5) {
            if (!zipCode.contains("9")) {
                if (!zipCode.startsWith("0")) {
                    System.out.println("The entered zipCode is valid");
                } else {
                    System.out.println("The entered zipCode is invalid");
                }

            }
            else{
                System.out.println("The entered zipCode is invalid");
            }
        }
        else{
            System.out.println("The entered zipCode is invalid");
        }


        System.out.println();
    }
}
