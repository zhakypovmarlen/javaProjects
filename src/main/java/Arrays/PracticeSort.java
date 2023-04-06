package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PracticeSort {
    public static void main(String[] args) {

        Integer [] numbers = {1,2,3,4,5,6123,1234,1,54,124,1,2,4,142,412,};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());

    }
}
