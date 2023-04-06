package Arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class IntroToArrays {
    /*
    Array - is a collection of values with the similar types of data
    Array can store as many elements as you need, but all the values must be of similar type
    Arrays can store duplicate values
    Every element inside the array has its index.
    Index - is position of element in the array.
    Array is a non-primitive data type.
    Array is a fixed size collection. When you first create an array, you must tell how many elements you want to
        put inside. Adn that number of elements cannot be changed.
     */
    static String[] fruits = {"apple", "banana", "orange", "kiwi"};
    static int[] numbers = {1, 2, 3, 4, 5};

    byte[] byteNums = {12, 3, 4, 2, 123, 4, 5};
    double[] doubleNums = {1, 5, 6, 23.4, 52.3, 646, 345.3, 12.32};
    boolean[] booleans = {true, false, true, false};
    char[] chars = {'h', 'e', 'l', 'l', 'o'};

    /*
    There are to ways to create array. Below is the second option:
     */

        public void Arrays() {
            String[] names = new String[3];        // we created array of Strings for 3 elements. Means, we cannot store more than 3 elements.
            // to put elements:
            names[0] = "John";

            int[] ages = new int[5];
            ages[1] = 43;
            ages[2] = 12;
        }

    public static void main(String[] args) {

            String [] fruits1 = {"watermelon", "melon", "strawberry"};
            String [] vegetables = {"tomato", "lemon", "onion"};
            String [] fruits2 = new String[3];
            fruits2 [0] = "watermelon";
            fruits2 [1] = "melon";
            fruits2 [2] = "strawberry";
            String [] vegetables2 = new String[3];
            vegetables2 [0] = "tomato";
            vegetables2 [1] = "lemon";
            vegetables2 [2] = "onion";

        System.out.println(Arrays.toString(fruits1));
        System.out.println(Arrays.toString(vegetables));
        for (int i = 0; i < fruits2.length; i++){
            System.out.println(fruits2[i]);
        }
        for (int i = 0; i < vegetables2.length; i++){
            System.out.println(vegetables2[i]);
        }

            int [] int1 = {1,2,3};
            int [] nums1 = {123,213,321};
            int [] int2 = new int[3];
            int2 [0] = 1;
            int2 [1] = 2;
            int2 [2] = 3;
            int [] nums2 = new int[3];
            nums2 [0] = 123;
            nums2 [1] = 321;
            nums2 [2] = 412;

        System.out.println(Arrays.toString(int1));
        System.out.println(Arrays.toString(nums1));
        for(int i = 0; i < int2.length; i++){
            System.out.println(int2[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            System.out.println(nums2[i]);
        }

            double [] double1 = {4,5,6};
            double [] double3 = {53,23.4,523.34};
            double [] doubles2 = new double[3];
            doubles2 [0] = 4;
            doubles2 [1] = 5;
            doubles2 [2] = 6;
            double [] double4 = new double[3];
            double4 [0] = 123.4;
            double4 [1] = 12342.22;
            double4 [2] = 13241.22134;

        System.out.println(Arrays.toString(double1));
        System.out.println(Arrays.toString(double3));
        for(int i = 0; i < doubles2.length; i++){
            System.out.println(doubles2[i]);
        }
        for (int i = 0; i < double4.length; i++){
            System.out.println(double4[i]);
        }


            char [] char1 = {'q','w','e'};
            char [] char3 = {'r', 't', 'y'};
            char [] char2 = new char[3];
            char2 [0] = 'q';
            char2 [1] = 'w';
            char2 [2] = 'e';
        System.out.println(Arrays.toString(char1));
        System.out.println(Arrays.toString(char3));
        for(int i = 0; i < char2.length; i++){
            System.out.println(char2[i]);
        }

            boolean [] boolean1 = {true,false,true,false};
            boolean [] boolean2 = new boolean[3];
            boolean2 [0] = true;
            boolean2 [1] = false;
            boolean2 [2] = true;

            String[] fruits = {"apple", "banana", "orange", "kiwi"};
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(fruits));

        System.out.println(fruits[1]);
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

            byte[] byteNums = {12, 3, 4, 2, 123, 4, 5};
            double[] doubleNums = {1, 5, 6, 23.4, 52.3, 646, 345.3, 12.32};
            boolean[] booleans = {true, false, true, false};
            char[] chars = {'h', 'e', 'l', 'l', 'o'};





        }
}