package practice;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = user.next();

        if(word.contains("Java")){
            System.out.println("YES, contains Java");
        } else {
            System.out.println("NO,does not contain Java");
        }







    }
}
