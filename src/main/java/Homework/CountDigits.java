package Homework;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;
        int digitCount = 0;
        int count = 0;

        do {
            System.out.print("Enter a string: ");
            input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count + " digits");
        } while (digitCount != 3);

        System.out.println("You entered a word with 3 digits!");
    }
        }

