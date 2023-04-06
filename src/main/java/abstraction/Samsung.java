package abstraction;

public class Samsung extends MobilePhone {

    public void call() {
        System.out.println(model + " is calling");

    }


    public void ring() {
        System.out.println(model + " is ringing");

    }

    public void text() {
        System.out.println(model + " is texting");
    }

    @Override
    public void turnOn() {
        System.out.println(model + " is ON");

    }

    @Override
    public void turnOff() {
        System.out.println(model + " is OFF");

    }

    public static void main(String[] args) {
        Samsung sm = new Samsung();
        sm.memory = 42;
        sm.model = "Samsung";
        sm.color = "Red";
        sm.call();
        sm.ring();
        sm.text();

    }
}
