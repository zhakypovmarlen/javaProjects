package objects;

public class Animal {

    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;

    public void eat(){
        System.out.println(type + " is our animal, which is " + age + " years old.");
        if(isMammal){
            System.out.println(type + " drinks milk or produce milk.");
        }
        else{
            System.out.println(type + " does not drink milk.");
        }
        if(isCarnivore){
            System.out.println(type + " is a predator which eats meat, or the flesh of animals");
        }
        else {
            System.out.println(type + " eats grass.");
        }
    }

    public void sleep(){
        System.out.println(type + " lives and sleeps in a " + habitat);
    }

    public void play(){
        if(isCarnivore){
            System.out.println(age + " years old " + type + " plays with his prey before eating it.");
        }
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.type = "Lion";
        animal1.isMammal = true;
        animal1.isCarnivore = true;
        animal1.age = 15;
        animal1.habitat = "sahara";

        Animal animal2 = new Animal();
        animal2.type = "Panda";
        animal2.isMammal = true;
        animal2.isCarnivore = false;
        animal2.age = 3;
        animal2.habitat = "rainforest";

        animal1.eat();
        animal1.sleep();
        animal1.play();

        animal2.eat();
        animal2.sleep();
        animal2.play();

    }
}
