package Homework.vehicle;

public class Motorcycle extends Vehicle{

    int numOfWheels;

    public void rev(){
        System.out.println("Revving the engine");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.make = "Mazda";
        car.model = "CX-6";
        car.year = 2021;
        car.numDoors = 5;
        car.drive();

        motorcycle.make = "Kawasaki";
        motorcycle.model = "Ninja 300";
        motorcycle.year = 2020;
        motorcycle.numOfWheels = 2;
        motorcycle.rev();
        motorcycle.drive();

    }
}

