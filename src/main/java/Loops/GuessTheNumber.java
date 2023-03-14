package Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        int randomNumber = new Random().nextInt(1,100);

        do{
            System.out.println("Enter your number: ");
            num = sc.nextInt();
            System.out.println("The random number is: " + randomNumber);
            if(num < randomNumber){
                System.out.println("Too low");
            }
            else if (num > randomNumber){
                System.out.println("Too high");
            }
            else {
                break;
            }
            if(num > 100 || num < 1){
                System.out.println("Enter number in range 1-100");
            }
        }while(num != randomNumber);
    }
}
