package arithmeticOperators;

public class ComparisonOperators {

    public static void main (String [] args){

        /*
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */

        byte potato = 5;
        byte fries = 10;

        System.out.println(potato >= fries);
        System.out.println(potato <= fries);
        System.out.println(potato > fries);
        System.out.println(potato < fries);
        System.out.println(potato == fries);
        System.out.println(potato != fries);


        byte byte1 = 10;
        byte byte2 = 5;
        int int1 = 1000;
        int int2 = 1500;
        short short1 = 100;
        short short2 = 150;
        long long1 = 1800;
        long long2 = 2000;


        System.out.println(byte1 == short1);
        System.out.println(byte2 != short2);
        System.out.println(byte1 <= int1);
        System.out.println(byte2 >= int2);

        boolean isEqual;
        isEqual = byte1 == short1;
        System.out.println(isEqual);

        boolean isNotEqual;
        isNotEqual = byte2 != short2;
        System.out.println(isNotEqual);

        boolean isMore;
        isMore = byte1 <= int1;
        System.out.println(isMore);

        boolean isLess;
        isLess = byte2 >= int2;
        System.out.println(isLess);

        System.out.println(long1 == int1);
        System.out.println(long2 != int2);
        System.out.println(long1 >= byte1);
        System.out.println(long2 <= byte2);

        boolean isLongEqual;
        isLongEqual = long1 == int1;
        System.out.println(isLongEqual);

        boolean isLongNotEqual;
        isLongNotEqual = long2 != int2;
        System.out.println(isLongNotEqual);

        boolean isLongMoreOrEqual;
        isLongMoreOrEqual = long1 >= byte1;
        System.out.println(isLongMoreOrEqual);

        boolean isLongLessOrEqual;
        isLongLessOrEqual = long2 <= byte2;
        System.out.println(isLongLessOrEqual);

        System.out.println(1 + 2 + " hello");
        System.out.println("hello " + 1+2);












    }
}
