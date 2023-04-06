package Constructors;

public class Product {

    String name;
    double price;
    int quantity;
    String manufacturer;

    public Product(){
        name = "unknown";
        price = 0.0;
        quantity = 0;
        manufacturer = "unknown";
    }
    public Product(String name, double price, int quantity, String manufacturer){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;

    }


    public void getDetails(){
        System.out.println("The product name: " + name);
        System.out.println("The price of the product: " + price);
        System.out.println("The quantity is: " + quantity);
        System.out.println("The manufacturer is: " + manufacturer);
    }

    public void getTotalPrice(){
        System.out.println("The total price is: " + (price * quantity));
    }

    public static void main(String[] args) {
        Product one = new Product();
        Product two = new Product();

        one.name = "Ice Cream";
        one.price = 15;
        one.quantity = 100;
        one.manufacturer = "AK";
        one.getDetails();
        one.getTotalPrice();

        two.name = "Tires";
        two.price = 100;
        two.quantity = 140;
        two.manufacturer = "Michelin";
        two.getDetails();
        two.getTotalPrice();


    }
}
