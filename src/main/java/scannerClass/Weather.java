package scannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weather in Celsius");
        double temp = sc.nextDouble();

        System.out.println("Is it raining?");
        boolean isRaining = sc.nextBoolean();

        if(isRaining){
            if(temp < 0){
                System.out.println("It's freezing outside! Wear a heavy coat, gloves, and a hat.");
            }
            else if (temp >= 0 && temp <= 10){
                System.out.println("It's chilly and rainy! Wear a raincoat, boots, and a scarf.");
            }
            else if (temp >= 11 && temp <= 20){
                System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf.");
            }
            else if (temp > 20){
                System.out.println("It's warm and rainy! Wear a light jacket, shorts, and sandals.");
            }
        }
        if (!isRaining){
            if(temp < 0){
                System.out.println("It's freezing outside! Wear a heavy coat, gloves, and a hat.");
            }
            else if (temp >= 0 && temp <= 10){
                System.out.println("It's chilly outside! Wear a jacket, gloves, and a hat.");
            }
            else if (temp >= 11 && temp <= 20){
                System.out.println("It's cool outside! Wear a light jacket and comfortable shoes.");
            }
            else if (temp > 20){
                System.out.println("It's warm outside! Wear a t-shirt, shorts, and comfortable shoes.");
            }

        }

    }
}
