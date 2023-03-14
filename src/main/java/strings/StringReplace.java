package strings;

public class StringReplace {
    public static void main(String[] args) {

        String word = "Apple banana strawberry";
        word = word.replace('a', 'e');
        System.out.println(word);

        System.out.println(word.replace('e', 'a'));

        String countries = "Italia Columbia Croatia ";
        System.out.println(countries.replace(" ", " republic. "));



        String foods = "hot lentil soup. hot plov, cold kompot, cold ice-cream, warm pasta, warm pizza";

        foods = foods.replace("hot", "tasty").replace("cold", "cool").replace("warm", "italian");
        System.out.println(foods);






        String letters = "hello everyone, hope you are doing good, i wish you good luck";

        letters = letters.replace("hello", "aaaaa");
        letters = letters.replace("everyone", "aaaaaaaaa");
        letters = letters.replace("hope", "aaaa");
        letters = letters.replace("you", "aaa");
        letters = letters.replace("are", "aaa");
        letters = letters.replace("doing", "aaaaa");
        letters = letters.replace("good", "aaaa");
        letters = letters.replace("i", "a");
        letters = letters.replace("wash", "aaaa");
        letters = letters.replace("luck", "aaaa");
        System.out.println(letters);







    }
}
