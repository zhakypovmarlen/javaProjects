package practice;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any words: ");
        String user = sc.nextLine();

        System.out.println(user.toUpperCase());


    }
}
