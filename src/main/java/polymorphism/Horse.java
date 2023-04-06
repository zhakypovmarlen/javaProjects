package polymorphism;

public class Horse extends Animal{
    @Override
    public void printDescription() {
        System.out.println("Horses are beautiful and can run " +
                "and can travel long distances.");
    }

    @Override
    public void displayPictures() {
        System.out.println("Here is the horse");
    }

    @Override
    public void displayFoodInfo() {
        System.out.println("Horses eat veggies only");
    }

    @Override
    public void makeSound() {
        System.out.println("Eeeho");
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        Dog dog = new Dog();

        Animal aniHorse = new Horse();
        Animal aniDog = new Dog();
    }
}
