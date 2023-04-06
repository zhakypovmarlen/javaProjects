package forEach;

public class PracticeForEach {
    public static void main(String[] args) {
        System.out.println(countOfCharsInString("Banana", 'a'));
        System.out.println(getOccurrenceOfLetters("Apple",'P'));

    }

    public static int countOfCharsInString(String word, char ch) {
        int count = 0;
        word = word.toLowerCase();
        ch = Character.toLowerCase(ch);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static int getOccurrenceOfLetters(String word, char letter){
        word = word.toLowerCase();
        letter = Character.toLowerCase(letter);
        int count = 0;
        for(char c : word.toCharArray()){
            if(c == letter){
                count++;

            }
        }
        return count;
    }
}
