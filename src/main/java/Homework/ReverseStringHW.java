package Homework;

import java.util.Scanner;

public class ReverseStringHW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.next();
        int wordLength = word.length();


        for(int i = wordLength-1; i >= 0; i--){
            System.out.print(word.charAt(i));

        }


        System.out.println("Enter any string: ");
        String word1 = sc.next();
        String reversed = "";

        for(int i = word1.length()-1; i >= 0; i--){
            reversed += word1.charAt(i);
        }
        System.out.println(reversed);

    }
    }

