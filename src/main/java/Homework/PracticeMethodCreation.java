package Homework;

public class PracticeMethodCreation {

    public static int multiplicationOfTwoIntegers(int a, int b){
        return a * b;
    }

    public String lowerCaseString(String str){
        String str1 = str.toLowerCase();
        return str1;
    }

    public double division(int a, int b){
        return a / b;
    }

    static boolean palindrome(String str) {
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            return true;
        }
        return false;
    }

    double multipliedBy100(double a){
        return a * 100;
    }

    boolean char1(char char2){
        if(char2 != 'a' || char2 != 'e' || char2 != 'u' || char2 != 'i' || char2 != 'o'){
            return true;
        }
        return false;
    }

    public boolean difference(int a, int b){
        if(a - b == 5 || a - b == -5){
            return true;
        }
        return false;
    }

    boolean isValid(String str){
        if(str.contains("@") && str.contains(".")){
            return true;
        }
        return false;
    }

    public boolean isPrime(int a){
        if(a % 2 != 0){
            return true;
        }
        return false;
    }

    static boolean parity(int a, int b){
        if((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)){
            return true;
        }
        return false;
    }




}
