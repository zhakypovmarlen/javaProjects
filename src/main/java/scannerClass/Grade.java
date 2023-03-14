package scannerClass;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter the grade of a student: ");
        int grade = user.nextInt();

        if(grade >=  0 && grade <= 20){
            System.out.println("Bad study, study everything again");
        } else if (grade >= 21 && grade <=40){
            System.out.println("Ok, study more");
        } else if (grade >= 41 && grade <= 60){
            System.out.println("good, study more");
        } else if (grade >= 61 && grade <= 80){
            System.out.println("very good, keep up");
        } else if (grade >= 81 && grade <= 95){
            System.out.println("perfect, good job");
        } else if (grade >= 96 || grade == 10){
            System.out.println("Exceptional, proud of you");
        } else {
            System.out.println("Invalid input");
        }
    }
}
