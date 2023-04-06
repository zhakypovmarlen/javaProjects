package Arrays;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ArraysDay2 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int k = 2;
        for(int i = 0; i < arr.length; i++){
            arr[i] = k;
            k += 2;
        }
        System.out.println(Arrays.toString(arr));

        int [] arr1 = new int[100];
        int a = 1;
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = a;
            a += 2;
        }
        System.out.println(Arrays.toString(arr1));




        BigDecimal[] doubleArr = new BigDecimal[10];
        DecimalFormat df = new DecimalFormat("#.0");
        for (int i = 0; i < doubleArr.length; i++){
            doubleArr[i] = new BigDecimal(String.valueOf(i * 0.1 + 0.1));

        }
        System.out.println(Arrays.toString(doubleArr));


        int [] int1 = new int[7];
        int p = 0;

        for (int i = 0; i < Integer.MAX_VALUE && p < 7; i++){
            if(isItPrime(i)){
                int1[p] = i;
                p++;
            }
        }
        System.out.println(Arrays.toString(int1));
    }

    public static boolean isItPrime(long a){
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
    }

