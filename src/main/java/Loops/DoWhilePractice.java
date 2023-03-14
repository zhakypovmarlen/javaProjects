package Loops;

import java.util.Locale;
import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word;
        int vowels = 0;



        do{
            System.out.print("Enter a word: ");
            word = sc.next();
            word = word.toLowerCase();

            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'i' ||
                word.charAt(i) == 'u'){
                    vowels++;
                }
            }
            System.out.println("The entered word's vowel count: " + vowels);
        } while(vowels <= 10);
    }
}
