package forEach;

import java.util.Arrays;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println(getAverageOfEvenNumbers());
        System.out.println(getAverageOfEvenNumbers(20l));
        System.out.println(getAverageOfEvenNumbers(20.1d));
        System.out.println(getAverageOfEvenNumbers(20));


        int [] integers = {1,3,4,5,78,56,7,54,34,345,3,45};
        System.out.println(getAverageOfEvenNumbers(integers));

    }

    public static double getAverageOfEvenNumbers(){
        int count = 0;
        int sum = 0;
        int i = 0;
        while(count < 10){
            if(i % 2 == 0){
                sum += i;
                count++;
            }
            i++;
        }

        return sum / count;
    }

    public static double getAverageOfEvenNumbers(int limit){
        int i = 0;
        int count = 0;
        int sum = 0;
        while (count < limit){
            if(i % 2 == 0){
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum / count);
        return sum / count;
    }

    public static double getAverageOfEvenNumbers(int [] numbers) {
        int sum = 0;
        int count = 0;
        for (int numbers1 : numbers) {
                if (numbers1 % 2 == 0) {
                    sum += numbers1;
                    count++;
                }
        }
        return sum / count;
    }

    public static double getAverageOfEvenNumbers(double limit){
        int i = 0;
        int sum = 0;
        int count = 0;
        do{
            if(i % 2 == 0){
                sum += i;
                count++;
            }
            i++;
        }while(count < limit);

        return sum / count;
    }

    public static double getAverageOfEvenNumbers(long limit){
        double sum = 0;
        int count = 0;
        for(int i = 0; i < limit; i++){
            if(i % 2 == 0){
                sum += i;
                count++;
            }
        }
        return sum / count;
    }

}
