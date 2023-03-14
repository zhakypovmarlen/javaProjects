package strings;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you so cold and windy?";
        String city = message.substring(6, 13);
        System.out.println(city);
        String question = message.substring(15);
        System.out.println(question);


        String welcomeSign = "Welcome to USA, our population is 140 million people," +
                " our average salary is 90k dollars, and our president is Joe Biden";


        String country = welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf(","));
        String population = welcomeSign.substring(welcomeSign.indexOf("1"), welcomeSign.indexOf(" people"));
        String salary = welcomeSign.substring(welcomeSign.indexOf("90k"), welcomeSign.indexOf(", and"));
        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));

        System.out.println(country);
        System.out.println(population);
        System.out.println(salary);
        System.out.println(president);

////////////////////////////////////////////////////////////////////////////////////

        String phrase = "Just one positive thought in the morning can change your whole day.";

        String first = phrase.substring(0, 4);
        String secondWord = phrase.substring(phrase.indexOf("th"), phrase.indexOf(" in"));
        System.out.println(first + " a " + secondWord);

        String firstOne = phrase.substring(phrase.indexOf("pos"), phrase.indexOf(" tho"));
        String secondOne = phrase.substring(phrase.indexOf("mor"), phrase.indexOf(" can"));
        System.out.println(firstOne + " " + secondOne);

        String first1 = phrase.substring(phrase.indexOf("wh"), phrase.indexOf(" day"));
        String second1 = phrase.substring(phrase.indexOf("mor"), phrase.indexOf(" can"));
        System.out.println(first1 + " " + second1);

        String first2 = phrase.substring(phrase.indexOf("ch"), phrase.indexOf(" your"));   // change one day
        String second2 = phrase.substring(phrase.indexOf("on"), phrase.indexOf(" pos"));
        String third = phrase.substring(phrase.indexOf("day"), phrase.indexOf("."));
        System.out.println(first2 + " " + second2 + " " + third);

        String first3 = phrase.substring(phrase.indexOf("ch"), phrase.indexOf(" your"));
        String second3 = phrase.substring(phrase.indexOf("yo"), phrase.indexOf(" whole"));
        String third3 = phrase.substring(phrase.indexOf("th"), phrase.indexOf(" in"));
        System.out.println(first3 + " " + second3 + " " + third3);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String str1 = "hi";
        String str2 = "bye";
        System.out.println(str1 + str2 + str2 + str1);

        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " "
        + str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str1);

        System.out.println(str2.substring(0,1) + str1.substring(1));

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String see = "see";
        String hear = "hear";

        System.out.println(see.substring(0,2) + hear.substring(2,4));

        System.out.println(hear.replace('h','s'));

        System.out.println(see.charAt(0) + hear.substring(1,4));








    }
}
