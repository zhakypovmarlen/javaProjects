package Homework;

public class HWPracticeStringManipulation2 {
    public static void main(String[] args) {

//1
    String str1 = "Hello, Universe!";
    char ch = 'o';

    System.out.println(str1.contains("o"));

//2

     String str2 = "Hello, World!";
     int start = 7;
     int end = 12;

     System.out.println(str2.substring(7,12));

//3

    String str3 = "Good morning World";
    System.out.println(str3.charAt(13));

//4

    String str4 = "             I Love Coding               ";
    System.out.println(str4.trim());

//5

    String str5 = "Learn as if you will live forever, live like you will die tomorrow.";
    System.out.println(str5.replace("o",""));



















    }
}
