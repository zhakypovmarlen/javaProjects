package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToFromArray {
    public static void main(String[] args) {

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("cabbage");
        vegetables.add("pepper");
        vegetables.add("onion");
        vegetables.add("lettuce");

/*
CONVERTING ARRAYLIST TO ARRAY
 */
        String [] arrayOfVeggies = new String[vegetables.size()];
        vegetables.toArray(arrayOfVeggies);
        System.out.println(Arrays.toString(arrayOfVeggies));

        /*
        CONVERT ARRAY TO ARRAYLIST
         */

        Integer [] arrayOfInts = {1,2,3,4,5,6};
        List<Integer> arrayListOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayListOfInts.size());
        System.out.println(arrayListOfInts);



    }
}
