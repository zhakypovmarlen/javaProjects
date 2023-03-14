package problemSolving;

import java.util.Scanner;

public class Concatination {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur 1st string: ");
        String word = sc.next().toLowerCase();
        System.out.println("Enter ur 2nd string in uppercase: ");
        String word1 = sc.next().toLowerCase();
        char word2 = word1.toUpperCase().charAt(0);
        System.out.println(word + word2 + word1.substring(1));

        System.out.println(word.toUpperCase().charAt(0) + word.substring(1) + word2 + word1.substring(1));
        System.out.println(word.toUpperCase() + " " +  word1.toLowerCase() + " " +  word1.toLowerCase() + " " + word.toUpperCase());
        System.out.println(word.replace("a", "").toUpperCase() + " " + word1.replace("a","").toUpperCase());
        System.out.println(word.toUpperCase().charAt(0) + word.substring(1,2) + word1.toUpperCase().charAt(0) + word1.substring(1,2));
        System.out.println((word.charAt(word.length() - 3)) + (word.charAt(word1.length() - 3)) + word1.toUpperCase().charAt(4) + word1.substring(5).toLowerCase());
        System.out.println(word.toUpperCase().substring(0,1) + word1.toUpperCase().substring(0,1));
    }
}