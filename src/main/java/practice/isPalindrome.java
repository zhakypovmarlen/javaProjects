package practice;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i-- ){
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }

}
