package practice;

import java.util.Scanner;

public class XandY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer x: ");
        int x = sc.nextInt();
        System.out.println("Enter integer y: ");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Both x and y positive");
        } else if (x == 0 || y == 0){
            System.out.println("Either x or y is zero");
        } else if (x < 0 && y < 0){
            System.out.println("Both x and y are negative");
        } else {
            System.out.println("Invalid input");
        }
    }
}
