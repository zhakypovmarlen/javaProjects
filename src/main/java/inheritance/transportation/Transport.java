package inheritance.transportation;

public class Transport {

    int number_Of_Wheels;
    boolean has_SteeringWheel;

    int num_of_seats;
    String type;


    public Transport(){
        System.out.println("This is a Transport constructor");
    }
    public Transport(String type){
        System.out.println("This is transport constructor " + type);
    }

    static {
        System.out.println("This is static block of Transport class");
    }

    {
        System.out.println("Instance block of Transport class");
    }



    public void start(){

    }

    public void accelerate(int speed){

    }
    public void stop(){

    }



}
