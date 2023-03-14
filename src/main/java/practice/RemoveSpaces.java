package practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any sentence: ");
        String str = sc.nextLine();

        System.out.println(str.replace(" ","").trim());
    }
}
