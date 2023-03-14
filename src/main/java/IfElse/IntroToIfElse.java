package IfElse;

public class IntroToIfElse {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");
        if(a > b) {
            System.out.println("a is more than b");
        }else {
            System.out.println("a is les than b");
        }
        System.out.println("I already compared a and b");


        int number1 = 100;
        int number2 = 50;

        if(number1 / number2 == 2){
            System.out.println("YES,two!");
        }else{
            System.out.println("Not Two");
        }





        String elon = "Tesla SpaceX Paypal";
        if (elon.contains("Paypal")){
            System.out.println("It does");
        }else{
            System.out.println("It does not");
        }



        int one = 1;
        int two = 2;
        int three = 3;

        if (one < two){
            System.out.println("It's true");
        }else{
            System.out.println("It's wrong");
        }


        if (one + two == three){
            System.out.println("It's true");
        }else{
            System.out.println("It's wrong");
        }


        if (one + two / three * three == one){
            System.out.println("It's true");
        }else{
            System.out.println("It's wrong");
        }



        String word = "Houston is in Texas";

        if(word.endsWith("a")){
            System.out.println("It is");
        }else{
            System.out.println("It's not");
        }


        if (word.contains("Texas")){
            System.out.println("It does");
        }else{
            System.out.println("It does not");
        }


        if(word.equals(one)){
            System.out.println("It is");
        }else{
            System.out.println("It isn't");
        }


        if(word.isEmpty()){
            System.out.println("It is");
        }else{
            System.out.println("It isn't");
        }


        if(word.equalsIgnoreCase("houston is in texas")){
            System.out.println("It is");
        }














    }}
