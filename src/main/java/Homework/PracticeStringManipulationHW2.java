package Homework;

public class PracticeStringManipulationHW2 {
    public static void main(String[] args) {

        //1
        String word = "Hello World";
        System.out.println(word.indexOf("World"));

        //2

        System.out.println(word.charAt(0));

        //3

        System.out.println(word.toLowerCase().substring(0,6));

        //4

        System.out.println(word.toUpperCase().substring(0,6));

        //5

        String one = "hello";
        String two = "Hello";
        System.out.println(one.equals(two));

        //6

        String word1 = "the quick brown fox";
        String result = word1.substring(0,1).toUpperCase() + word1.substring(4,5).toUpperCase()
                + word1.substring(10,11).toUpperCase() + word1.substring(16,17).toUpperCase();
        System.out.println(result);

        //7

        System.out.println(one.charAt(4)+ "" + one.charAt(3) + "" + one.charAt(2) + "" + one.charAt(1) + "" + one.charAt(0));

        //8

        String vowels = (word.charAt(1) + "" + word.charAt(4) + "" + word.charAt(7));
        System.out.println(vowels.length());

        //9

        String wordOne = "Hello ";
        String wordTwo = "World";
        System.out.println(wordOne.concat(wordTwo));

        //10

        wordOne = "Hello";
        wordTwo = "HELLO";
        System.out.println(wordOne.equalsIgnoreCase(wordTwo));

        //11

        word = "Hello World";
        System.out.println(word.length());

        //12

        word = "Hello";
        System.out.println(word.charAt(2));

        //13

        word = "Hello World";
        System.out.println(word.indexOf('l'));

        //14

        word1 = "hello";
        String word2 = "hello";
        System.out.println(word1 == word2);
        System.out.println(word1.equals(word2));

        //15

        word1 = "hello";
        word2 = "HELLO";
        System.out.println(word1 == word2);
        System.out.println(word1.equals(word2));

        //16

        word = "HELLO WORLD";
        System.out.println(word.toLowerCase());

        //17

        word = "hello world";
        System.out.println(word.toUpperCase());

        //18

        word = "Hello World";
        System.out.println(word.replace('l','r'));

        //19






    }
}
