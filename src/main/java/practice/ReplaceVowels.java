package practice;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String user = sc.nextLine();

        user = user.replaceAll("[aieuyoAIEUYO]", "x");
        System.out.println(user);



    }
}
