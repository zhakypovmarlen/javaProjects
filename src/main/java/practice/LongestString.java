package practice;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur 1st string: ");
        String str1 = sc.next();
        System.out.println("Enter ur 2nd string: ");
        String str2 = sc.next();


        if(str1.length() > str2.length()){
            System.out.println(str1 + " :" + (str1.length()));
        } else if (str2.length() > str1.length()){
            System.out.println(str2 + " :" + (str2.length()));
        } else {
            System.out.println(str1 + ": " + str1.length());
            System.out.println(str2 + ": " + str2.length());
        }

    }
}
