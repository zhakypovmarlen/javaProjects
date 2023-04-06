package abstraction.productsAtAmazon;

public abstract class Product {

    String title;
    String description;
    double price;
    String seller;
    int reviews;
    double averageReview;
    int quantity;

    public abstract void review();



    public abstract void addToCart(String title);




}
