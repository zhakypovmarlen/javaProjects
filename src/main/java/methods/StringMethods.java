package methods;

public class StringMethods {

    static boolean word (String str1, String str2){
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(word("maraket","maraket"));

        System.out.println(concatenate("hello","everyone"));

        System.out.println(length("hello","everyone"));

        System.out.println(evenOrNot(4));

        calculator(5);

        System.out.println(sumOfNumbers(5));
    }


    static String concatenate(String str1, String str2){
        return str1.toUpperCase() + str2.toUpperCase();
    }


    static int length(String str1, String str2){
        return (str1 + str2).length();
    }

    public static boolean evenOrNot(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isDivisible(int a){
        return a % 10 == 0;
    }

    public static void calculator(int num){

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " +  (num * i));
        }
    }

    public static int largestOne(int a, int b){

        if(a > b){
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return b;
    }

    public static int average(int a, int b, int c, int d){
        int sum = a+b+c+d;
        return sum / 4;
    }


    public static int sumOfNumbers(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }


}





