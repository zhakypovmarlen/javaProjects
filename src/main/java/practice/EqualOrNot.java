package practice;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur 1st string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter ur 2nd string: ");
        String str2 = sc.nextLine();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }
}
