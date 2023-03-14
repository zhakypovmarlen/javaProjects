package Homework;

public class HWPracticeStringManipulation21 {
    public static void main(String[] args) {

//1
        String myValue = "Learn as if you will forever, live like you die tomorrow";
        System.out.println(myValue.endsWith("orrow"));

//2

        System.out.println(myValue.substring(6,20));

//3

        System.out.println(myValue.replace('i','a'));

//4

        System.out.println(myValue.substring(30,56));

//5

        System.out.println(myValue.charAt(myValue.length() - 1));

//6

        System.out.println(myValue.startsWith("live like"));

//7

        System.out.println(myValue.replaceFirst("e","a"));

//8

        System.out.println(myValue.indexOf('e',40));

//9

        System.out.println(myValue.replace(" ", ""));

//10

        System.out.println(myValue.toUpperCase());





    }
}
