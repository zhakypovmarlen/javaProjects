package strings;

public class StringEquals {
    public static void main(String[] args) {

        String country = "USA";
        String country2 = "USA";
        String country3 = new String("USA");

        System.out.println(country == country2);
        System.out.println(country2 == country3);
        System.out.println(country3 == country);

        System.out.println(country.equals(country2));
        System.out.println(country2.equals(country3));
        System.out.println(country3.equals(country));
    }
}
