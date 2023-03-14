package strings;

public class PracticeSubstring {
    public static void main(String[] args) {

        String first_name = "Jacob";
        String last_name = "Coffee";

        /*
        String name1 = "Jee";
        String name2 = "Cee";
        String name3 = "Jacee";
        String name4 = "Cob";
        String name5 = "Feeco";
        String name6 = "Ofja";
        */

        System.out.println(first_name.charAt(0) + (last_name.substring(4,6)));
        System.out.println(last_name.charAt(0) + (last_name.substring(4,6)));
        System.out.println(first_name.substring(0,3) + last_name.substring(4,6));
        System.out.println(last_name.charAt(0) + first_name.substring(3,5));
        System.out.println(last_name.toUpperCase().charAt(2) + last_name.substring(4,6) + first_name.substring(2,4));
        System.out.println(last_name.toUpperCase().charAt(1) + "" + last_name.charAt(2) + first_name.toLowerCase().substring(0,2));




    }
}
