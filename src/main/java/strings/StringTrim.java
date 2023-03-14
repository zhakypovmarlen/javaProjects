package strings;

public class StringTrim {
    public static void main(String[] args) {

        /*
        trim() method removes empty space from both ends of the String
         */
        String batch = "            Batch 2 is cool            ";
        System.out.println(batch);
        System.out.println(batch.trim());

        System.out.println(batch.contains("cool"));
        System.out.println(batch.contains("lazy"));
        System.out.println(batch.contains("B"));

        System.out.println(batch.trim().concat(" Bena"));

        System.out.println(batch.strip());     // removes space in the beginning
        System.out.println(batch);


    }
}
