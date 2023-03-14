package problemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = " ";

        if(word.isEmpty()){
            System.out.println("It is empty");
        }
        else {
            System.out.println("It is not empty");
        }
    }
}
