package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Apple");
        stringArrayList.add("Samsung");
        stringArrayList.add("Nokia");
        stringArrayList.add("Hewlett Packard");
        stringArrayList.add("MSI");
        System.out.println(stringArrayList);

        stringArrayList.remove(2);
        stringArrayList.remove(1);
        stringArrayList.add("Sun");
        stringArrayList.add("Moon");
        stringArrayList.add("Jupiter");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());

        stringArrayList.clear();
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());


        String [] stringArrayList1 = new String[5];
        stringArrayList1[0] = "HP";
        stringArrayList1[1] = "Lenovo";
        stringArrayList1[2] = "Panasonic";
        stringArrayList1[3] = "Nikon";
        stringArrayList1[4] = "Xiaomi";

        System.out.println(Arrays.toString(stringArrayList1));
        System.out.println(stringArrayList1.length);

        List<String> arrayListOfString = Arrays.asList(stringArrayList1);
        System.out.println(arrayListOfString.size());





        ArrayList<Integer> arrayListInts = new ArrayList<>();
        arrayListInts.add(1);
        arrayListInts.add(2);
        arrayListInts.add(3);
        arrayListInts.add(4);
        arrayListInts.add(5);
        System.out.println(arrayListInts);

        arrayListInts.remove(0);
        arrayListInts.remove(1);

        arrayListInts.add(6);
        arrayListInts.add(7);
        arrayListInts.add(8);

        System.out.println(arrayListInts.size());
        arrayListInts.clear();


        int [] intArray = new int[arrayListInts.size()];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        intArray[4] = 5;
        System.out.println(Arrays.toString(intArray));

        System.out.println(intArray.length);

//        List<Integer> arraysListOfIntArray = Arrays.asList(intArray);




    }
}
