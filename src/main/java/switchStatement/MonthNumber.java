package switchStatement;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month's number: ");
        int month = sc.nextInt();

        if(month == 12 || month == 1 || month == 2){
            System.out.println("Winter time");
        }
        else if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring time");
        }
        else if (month == 6 || month == 7 || month == 8){
            System.out.println("Summer time");
        }
        else if (month == 9 || month == 10 || month == 11){
            System.out.println("Fall time");
        }
        else {
            System.out.println("Invalid month number");
        }


        switch (month){
            case 12, 1, 2:
                System.out.println("Winter time");
                break;
            case 3, 4, 5:
                System.out.println("Spring time");
                break;
            case 6, 7, 8:
                System.out.println("Summer time");
                break;
            case 9, 10, 11:
                System.out.println("Fall time");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
