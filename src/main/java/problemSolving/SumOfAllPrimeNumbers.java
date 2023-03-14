package problemSolving;

import java.util.Scanner;

public class SumOfAllPrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sumOfPrime = 0;

        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                sumOfPrime += i;
            }
        }
        System.out.println(sumOfPrime);
    }
}
