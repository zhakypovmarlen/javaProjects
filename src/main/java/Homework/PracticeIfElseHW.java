package Homework;

public class PracticeIfElseHW {
    public static void main(String[] args) {


        //1
        int number = -1;
        if (number > 0){
            System.out.println("Positive");
        } else if(number < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


//2

        int year = 2004;
        if(year % 4 == 0  || year % 400 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }

//3

        int num1 = 3;
        int num2 = 123;
        if(num1 < num2){
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " is larger than " + num2);
        }

//4

        double tempInFahrenheit = 77.3;

        if(tempInFahrenheit <= 32){
            System.out.println("32 degrees or lower");
        } else if (tempInFahrenheit >= 212){
            System.out.println("212 degrees or higher");
        } else {
            System.out.println("temperature is " + tempInFahrenheit);
        }

//5

        byte month = 6;
        if(month <= 2 && month > 0 || month == 12){
            System.out.println("Winter");
        } else if (month <= 5 && month >= 3){
            System.out.println("Spring");
        } else if (month <= 8 && month >= 4){
            System.out.println("Summer");
        } else if (month <= 11 && month >= 9){
            System.out.println("Fall");
        } else {
            System.out.println("Invalid month input");
        }
    }
}
