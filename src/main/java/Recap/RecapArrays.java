package Recap;

public class RecapArrays {
    public static void main(String[] args) {

        // 1. create array, no elements
        int [] arrInt = new int [5];

        // 2.create array with elements
        int [] arrInt2 = {1,2,3,4};

        // 3. create array with elements
        int [] arrInt3 = new int[] {23,4,5,6};

///////////////////////////////////////////////////////////

        returnInt(arrInt);
        returnInt(arrInt2);
        returnInt(new int[] {23,4,5,6});

////////////////////////////////////////////////////////////

        byte [] arrByte = {1,2,3,4};
        byte [] arrByte2 = new byte [4];
        byte [] arrByte3 = new byte[] {1,2,3,4};
        double [] arrDouble = {1.3,1.2,1.4,1.5};
        double [] arrDouble2 = new double[4];
        double [] arrDouble3 = new double[] {1.3,1.2,1.4,1.5};
        boolean [] arrBoolean = {true,false,true,false};
        boolean [] arrBoolean2 = new boolean[4];
        boolean [] arrBoolean3 = new boolean[] {true,false,true,false};

        String str = "Hiasd";
        String str1 = "";
        System.out.println(str.charAt(0));

    }

    public static int returnInt(int [] array){
        return array.length;
    }
}
