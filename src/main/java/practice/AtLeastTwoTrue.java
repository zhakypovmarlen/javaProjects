package practice;

import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Is A is true: ");
        boolean a = sc.nextBoolean();
        System.out.println("Is B is true: ");
        boolean b = sc.nextBoolean();
        System.out.println("Is C is true: ");
        boolean c = sc.nextBoolean();

        if(a && b && c){
            System.out.println("All true");
        } else if (a && b && !c){
            System.out.println("At least two are true");
        } else if (a && !b && c){
            System.out.println("At least two are true");
        } else if (!a && b && c){
            System.out.println("At least two are true");
        } else if (a && !b && !c){
            System.out.println("Less than two are true");
        } else if (!a && !b && c){
            System.out.println("At least two are true");
        } else if (!a && b && !c){
            System.out.println("At least two are true");
        }
    }
}
