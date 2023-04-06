package Homework;

import java.util.Arrays;

public class HWArrays {

    public static int [] sortedArray(int [] nums){
        Arrays.sort(nums);
       return nums;
    }

    public static String [] sortedString(String [] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static boolean twoSpecifiedElements(int [] nums1){
        for(int i = 0; i < nums1.length; i++){
            for (int k = nums1.length - 1; k > 0; k--){
                if(nums1[i] == 54){
                    if(nums1[k] == 90){
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static int AverageValue(int [] nums2){
        int largest = nums2[0];
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] > largest){
                largest = nums2[i];
            }
        }
        int smallest = nums2[0];
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] < smallest){
                smallest = nums2[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == smallest){
                continue;
            }
            if(nums2[i] == largest){
                continue;
            }
            sum += nums2[i];
        }
        return (sum) / (nums2.length - 2);
    }

}


