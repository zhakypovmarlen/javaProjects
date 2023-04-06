package Arrays;

import java.util.Arrays;

public class IntroTo2DArrays {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};  //one dimensional array
        System.out.println(Arrays.toString(numbers));

        String [] words = {"city", "town", "region", "state"};  //one dimensional array
        System.out.println(Arrays.toString(words));
        System.out.println(numbers[2]);

        int [] [] twoDimArrays = {{1,2,3},{3,4},{5,78},{9,0,1,-1,2}}; //two dimensional array
        System.out.println(twoDimArrays[1][1]);

        String [][] twoDimArrays1 = {{"apple","banana"}, {"kiwi", "passion fruit", "strawberry"}, {"melon", "watermelon",
        "peach", "mulberry"}};
        System.out.println(twoDimArrays1[0][0]);
        System.out.println(twoDimArrays1[0][1]);
        System.out.println(twoDimArrays1[1][0]);
        System.out.println(twoDimArrays1[1][1]);
        System.out.println(twoDimArrays1[1][2]);
        System.out.println(twoDimArrays1[2][0]);
        System.out.println(twoDimArrays1[2][1]);
        System.out.println(twoDimArrays1[2][2]);
        System.out.println(twoDimArrays1[2][3]);
        System.out.println(Arrays.toString(twoDimArrays1[0]));
        System.out.println(Arrays.toString(twoDimArrays1[1]));
        System.out.println(Arrays.toString(twoDimArrays1[2]));





    }
}
