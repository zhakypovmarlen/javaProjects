package strings;

public class StringToLowerCase {
    public static void main(String[] args) {

        String word = "Hello EveryONE! HOW Yall Doing";
        System.out.println(word);
        System.out.println(word.toLowerCase());// converts everything to lower case

        String word2 = "Hello guys, I'm aight, AND u?";
        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "hello everyone";
        String word4 = "Hello EveRyOne";
        word4 = word4.toUpperCase();
        System.out.println(word3.toUpperCase().equals(word4));
        System.out.println(word3.equalsIgnoreCase(word4));


    }
}
