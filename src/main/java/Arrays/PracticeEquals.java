package Arrays;

import java.util.Arrays;

public class PracticeEquals {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,4};
        int [] arr3 = {1,2,3};

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));

        String [] colors = new String[20];
        Arrays.fill(colors,"red");
        colors[0] = "green";
        System.out.println(Arrays.toString(colors));

        boolean [] b1 = {true,true,false};
        boolean [] b2 = Arrays.copyOf(b1,5);
        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));



    }
}
