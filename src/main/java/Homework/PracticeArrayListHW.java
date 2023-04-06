package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeArrayListHW {
    public static void main(String[] args) {
//1
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("mercedes");
        cars.add("lexus");
        cars.add("toyota");
        cars.add("buick");
//2
        cars.remove(0);
        cars.remove(2);
//3
        cars.add("bmw");
        cars.add("subaru");
        cars.add("hyundai");
//4
        System.out.println("The number of cars is: " + cars.size());
//5
        int i = 0;
        while(i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
//6
        for(int k = 0; k < cars.size(); k++){
            for(int a = 0; a < cars.size(); a++){
                if(cars.get(a).length() < 7){
                    cars.remove(cars.get(a));
                }
            }
        }
//7
        System.out.println(cars.size());
//8
        int p = 0;
        while (p < cars.size()){
            System.out.println(cars.get(p));
            p++;
        }

////////////////////////////////////////////////////////////////////

        ArrayList<Integer> year = new ArrayList<>();
        year.add(1977);
        year.add(1980);
        year.add(2004);
        year.add(2006);
        year.add(2012);

//2

        year.remove((0));
        year.remove((year.size()-1));
//3
        year.add(1949);
        year.add(1952);
        year.add(2014);
        year.add(2019);
        year.add(2023);
//4
        System.out.println("The number of years is: " + year.size());
//5
        int m = 0;
        while(m < year.size()){
            System.out.println(year.get(m));
            m++;
        }
//6
        for(int a = 0; a < year.size(); a++){
            if(isPrime(year.get(a))){
                year.remove(a);
            }
        }

//7
        System.out.println("The number of years is: " + year.size());
//8
        int i1 = 0;
        while(i1 < year.size()){
            System.out.println(year.get(i1));
            i1++;
        }
    }
    public static boolean isPrime(long a){
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
