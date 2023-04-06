package Homework;

public class Calculator1 {

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        return a / b;
    }
    public boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();
        int a = 5, b = 2;
        int sum = calculator.add(a,b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        int subtraction = calculator.subtract(a,b);
        System.out.println("Difference of " + a + " and " + b + " is: " + subtraction);

        int multiplication = calculator.multiply(a,b);
        System.out.println("Product of " + a + " and " + b + " is: " + multiplication);

        double division = calculator.divide(a,b);
        System.out.println("Quotient of " + a + " and " + b + " is: " + division);

        b = 10;
        boolean isEven = calculator.isEven(a);
        boolean isEven1 = calculator.isEven(b);

        System.out.println("Is " + a + " even: " + isEven);
        System.out.println("Is " + b + " even: " + isEven1);


    }
}
