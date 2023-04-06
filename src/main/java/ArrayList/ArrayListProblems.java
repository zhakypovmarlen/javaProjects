package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProblems {

    public static int returnSumOfEvens(ArrayList<Integer> numbers){

        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                sum += numbers.get(i);
            }
        }
        return sum;
    }

    public static int returnSumOfOdds(ArrayList<Integer> numbers1){

        int sum = 0;
        for(int i = 0; i < numbers1.size(); i++){
            if(numbers1.get(i) % 2 != 0){
                continue;
            }
            sum += numbers1.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            numbers.add(i);
        }
        System.out.println(returnSumOfEvens(numbers));
        System.out.println(returnSumOfOdds(numbers));

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("cheese");
        shoppingList.add("apples");
        shoppingList.add("bread");

        System.out.println(reverseString(shoppingList));
    }

    public static boolean doesWordExist (ArrayList<String> list, String word){
        return list.contains(word);
    }

    public static ArrayList<String> reverseString(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            reverseStr(list.set(i,reverseStr(list.get(i))));
        }
        return list;
    }

    public static String reverseStr(String str){
        String str2 = "";
        for(int i = str.length() - 1; i >= 0; i--){
            str2 += str.charAt(i);
        }
        return str2;
    }
}
