package switchStatement;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 6: ");
        int month = sc.nextInt();

        if(month == 1){
            System.out.println("January");
        }
        else if (month == 2){
            System.out.println("February");
        }
        else if (month == 3){
            System.out.println("March");
        }
        else if (month == 4){
            System.out.println("April");
        }
        else if (month == 5){
            System.out.println("May");
        }
        else if (month == 6){
            System.out.println("June");
        }
        else {
            System.out.println("Invalid month input");
        }



        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("Invalid month input");
        }


    }
}
