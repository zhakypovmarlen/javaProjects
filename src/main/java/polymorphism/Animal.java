package polymorphism;

public abstract class Animal {
    String type;
    int maxAge;
    String habitat;

    public abstract void printDescription();
    public abstract void displayPictures();
    public abstract void displayFoodInfo();
    public abstract void makeSound();

    public void playAnimalsMusic(){
        System.out.println("Playing funny music");
    }

}
