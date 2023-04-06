package inheritance;

public class Feline extends Animal{

    String specie;
    double lengthOfTail;

    boolean singleLiving;

    public void hunt(){

    }

    @Override
    public void eat() {
        super.eat();
    }

    public static void main(String[] args) {

        Feline felineObject = new Feline();
        System.out.println(felineObject.age);

    }
}
