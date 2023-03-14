package strings;

public class StringIndexOf {
    public static void main(String[] args) {

        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('o');
        System.out.println(index);
        System.out.println(ad.indexOf('e'));
        System.out.println(ad.indexOf('t'));
        System.out.println(ad.indexOf('e', 11) );


    }
}
