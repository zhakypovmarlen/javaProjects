package ArrayList;

import java.util.ArrayList;

public class IntroArrayList {

    /*
    ArrayList - is a resizable collection of similar types of data.

    It can only store objects, it cannot store primitives.

    It has indexes. As well as a lot of useful methods.
     */
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("watermelon");
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("carrot");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));

        /*
        int ==> Integer
        short ==> Short
        byte ==> Byte
        long ==> Long
        char ==> Character
        boolean ==> Boolean
        double ==> Double
        float ==> Float
         */
        ArrayList<Integer> zipcodes = new ArrayList<>();
        zipcodes.add(12345);
        zipcodes.add(23453);
        zipcodes.add(12331);
        zipcodes.set(0,54321);   // set(int index, new element). will change the existing element
        zipcodes.set(2, 34567);
        System.out.println(zipcodes);
        System.out.println(zipcodes.size());   // size() tells how many element array list has, instead of length

        zipcodes.remove(1);    // remove() method removes certain element in the arrayList
        System.out.println(zipcodes.size());

        zipcodes.clear();   // clear() method clears every single elements in the arrayList
        System.out.println(zipcodes.size());
        System.out.println();

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("cheese");
        shoppingList.add("apples");
        shoppingList.add("bread");

        System.out.println(shoppingList.size());
        System.out.println(shoppingList);
        shoppingList.remove(1);
        shoppingList.add("potato");
        System.out.println(shoppingList.size());

        boolean hasPotato = shoppingList.contains("potato");

        if(hasPotato){
            System.out.println("Yes, there is potato in the list");
        }
        else {
            System.out.println("No, there is no potato in the list");
        }

        System.out.println("Is my list empty? " + shoppingList.isEmpty());

        shoppingList.clear();
        System.out.println("Is my list empty? " + shoppingList.isEmpty());





    }
}
