package forEach;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

    static String[] topics = {"animals", "cities", "vegetables"};

    static String[] animals = {"cow", "cat", "dog", "chicken", "horse"};   // give values
    static String[] cities = {"Bishkek", "Santo Domingo", "Chicago", "Milan", "Honolulu"};  // give values
    static String[] vegetables = {"potato", "onion", "carrot", "tomato", "cucumber"};  // give values
    static int easyLevel = 6;
    static int mediumLevel = 3;
    static int difficultLevel = 1;
    static String topic = "";
    static String word = "";
    static int randomTopicNum;

    public static String getWordFromGivenTopic() {
        /*
        if topic == animal,cities and vegetables you return random word from animals, cities and vegetables array
         */
        Scanner scanner = new Scanner(System.in);
        String topicInput = scanner.next();
        topic = topicInput;
        Random random = new Random();
        randomTopicNum = random.nextInt(5);
        if (topic.equals(topics[0])) {
            return animals[randomTopicNum];
        }
        if (topic.equals(topics[1])) {
            return cities[randomTopicNum];
        }
        if (topic.equals(topics[2])) {
            return vegetables[randomTopicNum];
        }
        return " ";

    }

    public static boolean checkLetter(String word, char letter) {
        /*
        check if letter exists in the word
        return true
        dog
        if letter == d{
           true}
         */


        word = getWordFromGivenTopic().toLowerCase();
        letter = Character.toLowerCase(letter);
        int easyLevel = 6;
        int mediumLevel = 3;
        int difficultLevel = 1;
        for (int i = 0; i < 6; i++) {
            if (word.charAt(i) == letter) {
                System.out.println("Correct, enter ur next letter or whole word.");
                return true;
            }
            if (word.equals(topics[randomTopicNum])) {
                System.out.println("You have guessed the correct word!");
                break;
            }
            return false;

        }

        return true;

    }

    public static String displayLetter(String word, char letter) {
        // elephant
        // e_ _ _ e p _ _ _ _ if user


        return " ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game. Please choose the level: ");
        System.out.println("Easy, Medium or Difficult");
        String level = scanner.next().toLowerCase();
        String newWord = "";
        getWordFromGivenTopic();


        if (level.equals("easy")) {
            int i = 0;
            while (i < easyLevel) {
                Scanner scanner1 = new Scanner(System.in);
                for (int k = 0; k < 6; k++) {
                    if (word.charAt(k) == i) {
                        System.out.println("Correct, enter ur next letter or whole word.");
                    }
                    if (word.equals(topics[randomTopicNum])) {
                        System.out.println("You have guessed the correct word!");
                        break;
                    }


                    i++;
                }
            }
        /*
        check level if
        and then ask user to select topic
        and then create while loop, while loop should be running until the word is guessed
        boolean isWordGuessed = false;
        crate while (!isWordGuessed)
         */
            System.out.println(getWordFromGivenTopic());


        }


    }
}
