package switchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the grade? ");
        String grade = sc.nextLine();

        switch(grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good Job");
                break;
            case "C":
                System.out.println("Satisfactory");
                break;
            case "D":
                System.out.println("Bad");
                break;
            case "F":
                System.out.println("Horrible");
                break;
            default:
                System.out.println("Invalid grade");
        }




    }
}
