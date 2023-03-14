package problemSolving;

import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.next();
        for(int i = 0; i < word.length(); i++){
            int counter = 0;
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    counter++;
                }
            }
            System.out.println(word.charAt(i) + ": " + counter);
        }

    }
}



