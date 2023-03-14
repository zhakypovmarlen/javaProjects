package objects;

public class Car {
    String model;
    int year;
    String color;
    int price;

    public void drive(){
        System.out.println(model + " drives smooth");
        System.out.println("The year of " + model + " is " + year);
    }
    public void stop(){
        System.out.println(color + " " + model + " stops at the traffic light");
    }
    public void playMusic(){
        System.out.println(price + " dollars " + model + " plays all kinds of music");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Audi";
        car1.year = 2022;
        car1.price = 20000;
        car1.color = "Purple";

        Car car2 = new Car();
        car2.model = "BMW";
        car2.year = 2019;
        car2.price = 15000;
        car2.color = "Blue";

        car1.drive();
        car1.stop();
        car1.playMusic();

        car2.drive();
        car2.stop();
        car2.playMusic();
    }














}
