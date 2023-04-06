package forEach;

public class CompareLoops {
    public static void main(String[] args) {

        int [] array = {6,3,2,4,6,7,8,9,0};
// for loop
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
// for each loop
        for(int element : array){
            System.out.println(element);
        }
// while loop
        int k = 0;
        while (k < array.length){
            System.out.println(array[k]);
            k++;
        }
// do while loop
        int a = 0;

        do{
            System.out.println(array[a]);
            a++;
        } while(a < array.length);


        int [] arrayOfInts = {34,655,34,7,8,9,3,3,5,6};
        int sum1 = 0;
        int average1;

        for(int i = 0; i < arrayOfInts.length; i++){
            sum1 += arrayOfInts[i];
        }
        average1 = sum1 / arrayOfInts.length;
        System.out.println(average1);


        int p = 0;
        int sum2 = 0;
        while(p < arrayOfInts.length){
            sum2 += arrayOfInts[p];
            p++;
        }
        System.out.println(sum2 / arrayOfInts.length);

        int q = 0;
        int sum3 = 0;
        do{
            sum3 += arrayOfInts[q];
            q++;
        }while(q < arrayOfInts.length);

        System.out.println(sum3 / arrayOfInts.length);


        int sum4 = 0;
        for(int numbers : arrayOfInts) {
            sum4 += numbers;
        }
        System.out.println(sum4 / arrayOfInts.length);







    }
}
