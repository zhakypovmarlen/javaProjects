package strings;

public class StringCharAt {
    public static void main(String[] args) {

        String city = "Chicago !";
        System.out.println(city.charAt(4));
        System.out.println(city.charAt(0));
        System.out.println(city.charAt(7));
        System.out.println(city.charAt(8));

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(16);
        System.out.println(c);

        System.out.println(welcomeSign.charAt(0));

        int length = welcomeSign.length();
        System.out.println(length);

        char lastChar = welcomeSign.charAt(33);
        System.out.println(lastChar);

        System.out.println(welcomeSign.charAt(welcomeSign.length() - 1));
        System.out.println(welcomeSign.charAt(welcomeSign.length() / 2));







    }
}
