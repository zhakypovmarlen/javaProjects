package Homework;

public class Calculator {

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
//        if(x >= y){
//            return x - y;
//        }
//        return y - x;
  }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double division(int x, int y){
        if(y == 0) {
            return 0;
        }
//        if(x >= y){
//            return x / y;
//        }
//        return y / x;
        return x / y;
    }

    public static int modulus(int x, int y){
        return x % y;
    }

    public static int factorial(int x){
        int num1 = 1;
        for(int i = 1; i <= x; i++){
            num1 *= i;
        }
        return num1;
    }

    public static double squareRoot(int x){
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(add(12,13));
        System.out.println(division(5,45));
        System.out.println(factorial(4));
        System.out.println(squareRoot(49));
    }

}
