package inheritance.transportation;

public class MotorizedTransport extends Transport{

    String engine_type;

    int max_speed;

    public MotorizedTransport(){
        System.out.println("this is MotorizedTransport default constructor");
    }

    public MotorizedTransport(String type){
        super("motorized");
        System.out.println("this is MotorizedTransport constructor " + type);
    }
    static {
        System.out.println("this is MotorizedTransport first static block");
    }

    static {
        System.out.println("this is MotorizedTransport second static block");
    }

    {
        System.out.println("this is MotorizedTransport first instance block");
    }

    {
        System.out.println("this is MotorizedTransport second instance block");
    }



    public void drive(){
        System.out.println(engine_type);
        System.out.println(num_of_seats);
    }

    public void signal(){

    }

    public static void main(String[] args) {
       MotorizedTransport automobile = new MotorizedTransport();

    }
}
