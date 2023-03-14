package Loops;

public class WhileLoop {
    public static void main(String[] args) {

//        int i = 0;
//
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }

        int i = 0;
        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        int i1 = 1;

        while (i1 <= 10){
            System.out.println("good morning everyone!");
            i1++;
        }


        for(int i2 = 1; i2 <= 10; i2++){
            System.out.println("Good morning everyone");
        }

        i = 100;
        while (i >= 0){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i--;
            }

        i = 1;
        while(i <= 31){
            System.out.println(i + " January");
            i++;
        }


        int num1 = 128;
        boolean isPrime = true;
        i = 2;

            while (i < num1){
                if(num1 % i == 0){
                    isPrime = false;
                }
                i++;
            }
            if(isPrime){
                System.out.println("It's prime");
            }
            else {
                System.out.println("It's not prime");
            }



        }
    }

