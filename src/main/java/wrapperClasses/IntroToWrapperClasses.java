package wrapperClasses;

import Constructors.Book;

public class IntroToWrapperClasses {
    public static void main(String[] args) {

        /*
        primitive to object = autoboxing
        object to primitive = unboxing
         */

        int a = 10;
        Integer aa = 10;
        System.out.println(aa.compareTo(a));

        a = aa; // unboxing
        aa = a; // autoboxing


        byte b = 1;
        Byte bb = 1;

        short c = 8;
        Short cc = 8;

        long d = 232;
        Long dd = 232l;

        float f = 12.4f;
        Float ff = 12.4f;

        double e = 12.1;
        Double ee = 12.1;

        char g = 'c';
        Character gg = 'c';

        boolean h = true;
        Boolean hh = true;



    }
}
