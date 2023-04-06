package Homework;

public class Motorcycle {
    String make;
    String model;
    int year;
    boolean isRunning;

    public Motorcycle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void startEngine(){
        isRunning = true;

    }
    public void stopEngine(){
        isRunning = false;

    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void isRunning1() {
        if (isRunning) {
            System.out.println("It is running");
        } else if (!isRunning) {
            System.out.println("It is not running");
        }
    }

    public static void main(String[] args) {
        Motorcycle moto1 = new Motorcycle("Kawasaki", "Ninja", 2015);
        moto1.startEngine();
        moto1.isRunning1();
        moto1.stopEngine();
        moto1.isRunning1();
    }
}
