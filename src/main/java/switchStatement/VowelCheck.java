package switchStatement;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {


        char letter = 'A';

        switch (letter) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }


    }
}
