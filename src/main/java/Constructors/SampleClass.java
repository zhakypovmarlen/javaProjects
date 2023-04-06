package Constructors;

public class SampleClass {

    static {
        System.out.println("instance static block");
    }
    // static block will rin the very first just once, even if no one is calling it
    // instance block will run after static block whenever new object get created

    {
        System.out.println("inside instance block");
    }

    public SampleClass(){
        System.out.println("I am a constructor");
    }

    public void instanceMethod(){
        System.out.println("This is instance method");
    }

    public static void staticMethod(){
        System.out.println("THis is static method");
    }
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        staticMethod();
        sc.instanceMethod();
    }
}
