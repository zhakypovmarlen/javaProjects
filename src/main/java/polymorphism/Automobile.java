package polymorphism;

public class Automobile implements Vehicle, Machines {


    public void drive() {
        System.out.println("Auto is driving");
    }

    public void signal() {
        System.out.println("Auto is signaling");
    }

    public boolean needService() {
        return false;
    }

    public boolean isBroken() {
        return false;
    }

    public void helpPeople() {

    }

    public void work() {

    }
    @Override
    public void sayHelloDefault(){
        System.out.println("hello12");
    }

    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        Vehicle vehicle = new Automobile();
        Machines machines = new Automobile();

        System.out.println(type);

        Vehicle.sayHello();
        automobile.sayHelloDefault();
    }
}
