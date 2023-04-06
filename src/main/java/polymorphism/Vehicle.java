package polymorphism;

public interface Vehicle extends Machines {
    final static String type = "vehicle";
    // ^ constant variable, final and static are redundant
    void drive();
    void signal();

    public static void sayHello(){
        System.out.println("hello");
    }
    public default void sayHelloDefault(){
        System.out.println("hello");
    }

    /*
    default in INTERFACES, it is a method that has body
     */
}
