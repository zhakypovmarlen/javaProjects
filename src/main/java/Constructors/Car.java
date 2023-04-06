package Constructors;

public class Car {

    String make, model;
    int year;

    public Car(){
        make = "Unknown";
        model = make;
        year = 0;
    }

    public Car(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public Car(String model, String make){
        year = 0;
        this.make = make;
        this.model = model;
    }
    public void printInfo(){
        System.out.println("The car's make: " + make);
        System.out.println("The car's model: " + model);
        System.out.println("The car's year: " + year);
    }



}
