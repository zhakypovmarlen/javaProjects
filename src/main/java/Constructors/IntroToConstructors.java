package Constructors;

import java.util.Arrays;

public class IntroToConstructors {

    /*
    Constructor - is a special method that is used to initialize (create) object from the class.

    Constructor - does not have return type
    Constructor's name must match class name
    Constructor can have 0 or more arguments(elements or parameters)
     */

    /*
    default constructor, is empty constructor with no parameters which is hidden
     */

    public IntroToConstructors(String word){

    }
    public IntroToConstructors(int [] num){

    }
    public IntroToConstructors(String [] words){

    }

    public IntroToConstructors(int num){

    }
    public IntroToConstructors(double num){

    }
    public IntroToConstructors(double num, float num2){

    }
    public IntroToConstructors(boolean true1, boolean false1){

    }
    public IntroToConstructors(double [] num){

    }
    public static void main(String[] args) {

        IntroToConstructors intro = new IntroToConstructors("asdqwe");
        IntroToConstructors intro1 = new IntroToConstructors(new int [] {1,2,3,4,5});
        IntroToConstructors intro2 = new IntroToConstructors(new String [] {"school", "church"});
        IntroToConstructors intro3 = new IntroToConstructors(5);
        IntroToConstructors intro4 = new IntroToConstructors(1.2);
        IntroToConstructors intro5 = new IntroToConstructors(1.2,3.5f);
        IntroToConstructors intro6 = new IntroToConstructors(true, false);
        IntroToConstructors intro7 = new IntroToConstructors(new double[]{1.2,3.5,1.2,6.7,9.0});
        System.out.println(intro4);

    }
}
