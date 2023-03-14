package IfElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String user = sc.next();
        user = user.toLowerCase();

        if(user.contains("e")){
            System.out.println(user.indexOf('e'));
        } else {
            System.out.println("The word does not contain the letter 'e'");
        }



    }
}
