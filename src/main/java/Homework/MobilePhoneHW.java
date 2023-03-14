package Homework;

public class MobilePhoneHW {
    String model;
    int price;
    int memory;

    public void ring(){
        System.out.println(price + " dollars " + model + " rings when someone calls");
    }
    public void turnOn(){
        System.out.println(price + " dollars " + model + " turns on when the battery is full of charge");
    }
    public void turnOff(){
        System.out.println(price + " dollars " + model + " got " + memory + " gb of memory, and it turns off when the battery dies");
    }

    public static void main(String[] args) {
        MobilePhoneHW phone = new MobilePhoneHW();
        phone.model = "Iphone";
        phone.price = 1000;
        phone.memory = 256;

        phone.ring();
        phone.turnOn();
        phone.turnOff();
    }
}
