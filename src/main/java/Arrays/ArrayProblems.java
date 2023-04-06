package Arrays;

import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {
        System.out.println(sum(new int [] {1,2,3,4}));
        System.out.println(getLargest(new int [] {1,2,3,7}));
        System.out.println(getSmallest(new int [] {10,2,3,4,5,6}));
        System.out.println(secondLargest(new int [] {5,4,3,2,1}));
        System.out.println(secondSmallest(new int [] {1,2,3,4,5}));



        int a = 5;
        int b = 10;
        int temp1 = a;
        a = b;
        b = temp1;
        System.out.println(a);
        System.out.println(b);
    }

    public static int sum(int[]array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int getLargest (int [] array){
        int largestElement = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > largestElement){
                largestElement = array[i];
            }
        }
        return largestElement;
    }

    public static int getSmallest(int [] array){
        int smallestElement = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < smallestElement){
                smallestElement = array[i];
            }
        }
        return smallestElement;
    }
    // array {1 ,2 , 3, 4, 5};
    public static int secondLargest(int [] array){
        int largest = getLargest(array);
        int secondL = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
           if(array[i] > secondL && array[i] < largest){
               secondL = array[i];
           }
        }
        return secondL;
    }

    public static int secondSmallest(int [] array){
        int smallest = getSmallest(array);
        int secondS = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++ ){
            if(array[i] < secondS && array[i] > smallest);
            secondS = array[i];
        }
        return secondS;
    }



    public static int [] sortInAscOrder2(int [] array){

    int length = array.length;
    /*

    1) 5, 3, 68, 2, 5, 7  ==> 2, 3, 68, 5, 5, 7
    2) 2, 3, 68, 5, 5, 7  ==> 2, 3, 68, 5, 5, 7
    3) 2, 3, 68, 5, 5, 7  ==> 2, 3, 5, 68, 5, 7

    1)  5, 3, 68, 2, 5, 7 ==> 3, 5, 68, 2, 5, 7
    2)  3, 5, 68, 2, 5, 7 ==> 3, 5, 68, 2, 5, 7
    3)  3, 5, 68, 2, 5, 7 ==> 3, 5, 2, 68, 5, 7
    4)  3, 5, 2, 68, 5, 7 ==> 3, 5, 2, 5, 68, 7
    5)  3, 5, 2, 5, 68, 7 ==> 3, 5, 2, 5, 7, 68

    1)  3, 5, 2, 5, 7, 68 ==> 3, 5, 2, 5, 7, 68
    2)  3, 5, 2, 5, 7, 68 ==> 3, 2, 5, 5, 7, 68
    3)  3, 2, 5, 5, 7, 68 ==> 3, 2, 5, 5, 7, 68
    4)  3, 2, 5, 5, 7, 68 ==> 3, 2, 5, 5, 7, 68
    5)  3, 2, 5, 5, 7, 68 ==> 3, 2, 5, 5, 7, 68

    1.  3, 2, 5, 5, 7, 68 ==> 2, 3, 5, 5, 7, 68
    2.  2, 3, 5, 5, 7, 68 ==> 2, 3, 5, 5, 7, 68
    2.  2, 3, 5, 5, 7, 68 ==> 2, 3, 5, 5, 7, 68
    2.  2, 3, 5, 5, 7, 68 ==> 2, 3, 5, 5, 7, 68
    2.  2, 3, 5, 5, 7, 68 ==> 2, 3, 5, 5, 7, 68
    2.  2, 3, 5, 5, 7, 68 ==> 2, 3, 5, 5, 7, 68

    */

    for (int i = 0; i < length - 1; i++){

        int minIndex = i;
        //5, 3, 68, 2, 5, 7
        for (int j = i + 1; j < length; j++){
            // 3 < 5
            // minIndex = 1
            if (array[j] < array[minIndex]){
                minIndex = j;
            }
        }
        //swapping
        int temp = array[i]; //5
        //{2,
        //{2, 3, 5, 5, 7, 68
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }

    return  array;
}
public static int [] sortInAscOrderBubbleSort(int [] array){
        int temp = 0;

        for (int i = 0; i < array.length; i++) {

        for (int k = 1; k < (array.length - i); k++){
        if(array[k - 1] > array[k]){
        temp = array[k - 1];
        array[k - 1] = array[k];
        array[k] = temp;
        }
        }
        }
        return array;
        }






}
