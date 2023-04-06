package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTwo {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("watermelon");
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        shoppingList.add("melon");

        System.out.println("Shopping list: ");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ") " + shoppingList.get(i));
        }

        shoppingList.clear();
        System.out.println(shoppingList.size());

        String[] shoppingListArray = new String[5];
        shoppingListArray[0] = "watermelon";
        shoppingListArray[1] = "apple";
        shoppingListArray[2] = "banana";
        shoppingListArray[3] = "pear";
        shoppingListArray[4] = "melon";

        List<String> arrayListOfShopping = Arrays.asList(shoppingListArray);

        System.out.println("Shopping list: ");
        int i = 0;
        while (i < arrayListOfShopping.size()) {
            System.out.println((i + 1) + ") " + arrayListOfShopping.get(i));
            i++;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int a = 0; a < 100; a++){
            numbers.add(a);
        }
        System.out.println(primeNumber(numbers));

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(5);
        numbers1.add(10);

        System.out.println(getHighestNumber(numbers1));
        System.out.println(getLowestNumber(numbers1));


    }


        public static ArrayList<Integer> primeNumber (ArrayList<Integer> numbers ){
            ArrayList<Integer> primeNumbers = new ArrayList<>();

            for(int i = 0; i < numbers.size(); i++) {
                if (isItPrime(numbers.get(i))){
                    primeNumbers.add(numbers.get(i));
                }
            }
            return primeNumbers ;
    }
    public static boolean isItPrime(int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double getAverageOfDoubles(ArrayList<Double> list){

        int i = 0;
        double sum = 0;
        while (i < list.size()){
            sum += list.get(i);
            i++;
        }
        return sum / list.size();
    }

    public static int getHighestNumber(ArrayList<Integer> nums){

        int highestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > highestNumber){
                highestNumber = nums.get(i);
            }
        }
        return highestNumber;
    }

    public static int getLowestNumber(ArrayList<Integer> nums){
        int lowestNumber = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < lowestNumber){
                lowestNumber = nums.get(i);
            }
        }
        return lowestNumber;
    }



}
