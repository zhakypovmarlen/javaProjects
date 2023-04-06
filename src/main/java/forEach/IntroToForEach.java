package forEach;

import java.util.ArrayList;

public class IntroToForEach {
    public static void main(String[] args) {

        /*
        Collections: Array, ArrayList

        For each loop only works with collections

        for loop, while loop, do while loop work with boolean statements.

        for each loop does not need boolean statement, it needs only collection
         */

        String [] array = {"potato", "onion", "carrot", "pepper"};

        for ( String veggie : array){
            System.out.println(veggie);
        }

        int [] intArray = {1,2,5,6,8,9,23,4};

        for(int numbers : intArray){
            System.out.print(numbers);
            System.out.print(" ");
        }

        byte [] byteArray = {1,2,3,4,5};
        double [] doubleArray = {1.2,2.3,3.4,4.5,5.6};
        String [] stringArray = {"volvo", "mazda", "mercedes", "bmw", "toyota"};
        boolean [] booleanArray = {true, false, true, false, true};

        for(int i = 0; i < byteArray.length; i++){
            System.out.println(byteArray[i]);
        }
        for(byte arrayByte : byteArray){
            System.out.println(arrayByte);
        }


        for(int i = 0; i < doubleArray.length; i++){
            System.out.println(doubleArray[i]);
        }
        for(double arrayDouble : doubleArray){
            System.out.println(arrayDouble);
        }


        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
        for(String arrayString : stringArray){
            System.out.println(arrayString);
        }

        for(int i = 0; i < booleanArray.length; i++){
            System.out.println(booleanArray[i]);
        }
        for(boolean arrayBoolean : booleanArray){
            System.out.println(arrayBoolean);
        }


        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(1.2);
        doubleArrayList.add(3.5);
        doubleArrayList.add(6.5);
        doubleArrayList.add(9.8);
        doubleArrayList.add(10.2);

        for(int i = 0; i < doubleArrayList.size(); i++){
            System.out.println(doubleArrayList.get(i));
        }
        for(Double arrayListDouble : doubleArrayList){
            System.out.println(arrayListDouble);
        }
    }
}
