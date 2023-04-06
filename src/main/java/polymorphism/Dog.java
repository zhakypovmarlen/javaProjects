package polymorphism;

public class Dog extends Animal{
    @Override
    public void printDescription() {
        System.out.println("Dogs are pets. There are many breeds of dogs.");
    }

    @Override
    public void displayPictures() {
        System.out.println("Here are the cute pictures dogs");
    }

    @Override
    public void displayFoodInfo() {
        System.out.println("Dogs eat everything");
    }

    @Override
    public void makeSound() {
        System.out.println("Whoof");
    }
}
