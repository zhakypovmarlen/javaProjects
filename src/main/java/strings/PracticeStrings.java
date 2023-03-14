package strings;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Michael Jackson";
        System.out.println(singerName.length());  // the amount of chars in the variable

        System.out.println(singerName.endsWith("son")); // true
        System.out.println(singerName.startsWith("Misha"));   // false

        System.out.println(!singerName.isEmpty());
        System.out.println(singerName.toLowerCase());
        System.out.println(singerName.toUpperCase());
        System.out.println("" + singerName.charAt(0) + singerName.charAt(3));

        System.out.println(singerName.indexOf("c"));

        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName.equals(singerName2);
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2));

    }
}
