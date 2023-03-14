package practice;

import java.util.Scanner;

public class MonthIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur month in integer: ");
        int month = sc.nextInt();

        if(month == 2){
            System.out.println("It is 28 days in this month");
        } else if (month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month == 12){
            System.out.println("Is is 31 days in this month");
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Given month has 30 days");
        } else {
            System.out.println("Invalid month given");
        }

    }
}
