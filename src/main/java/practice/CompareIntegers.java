package practice;

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter ur 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter ur 3rd number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("1st number is larger");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("2nd number is larger");
        } else {
            System.out.println("3rd number is larger");
        }



    }
}
