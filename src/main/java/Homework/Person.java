package Homework;

public class Person {
    String name;
    int age;
    String address;
    String phone;

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        address = "Unknown";
        phone = "N/A";
    }
    public Person(String name){
        this.name = name;
        age = 0;
        address = "Unknown";
        phone = "N/A";
    }
    public void displayPersonInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Phone number: " + this.phone);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Michael Jordan", 55, "2345 Beverly Hills", "734-734-1232");
        Person person2 = new Person("Sasha Simple", 25);
        Person person3 = new Person("Harry Maguire");

        person1.displayPersonInfo();
        System.out.println();
        person2.displayPersonInfo();
        System.out.println();
        person3.displayPersonInfo();
    }

}
