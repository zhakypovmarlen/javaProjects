package Arrays;

import java.util.Scanner;

public class WordJumbleGame {
    public static void main(String[] args) {

        String[] cars = {"Lexus", "Mazda", "Toyota", "Mercedes", "Subaru"};
        Scanner user1 = new Scanner(System.in);

    }

    public static class Print2DArrays {
        public static void main(String[] args) {

            String [] [] foods = {
                    {"pasta", "lasagna", "pizza"},
                    {"rice", "wok", "mongolian beef"},
                    {"borsch", "pelmeni", "vareniki"},
                    {"plov", "samsy", "oromo",}
            };
            System.out.println(foods[0][1]);
            System.out.println(foods[1][2]);
            System.out.println(foods[2][1]);
            System.out.println(foods[3][0]);

            for(int i = 0; i < foods.length; i++){
                for(int j = 0; j < foods[i].length; j++){
                    System.out.print(foods[i][j] + "\t\t");
                }
                System.out.println();
            }


        }
    }
}
