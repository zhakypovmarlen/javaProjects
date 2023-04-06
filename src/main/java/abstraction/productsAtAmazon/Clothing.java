package abstraction.productsAtAmazon;

public class Clothing extends Product {

    String fabric;
    double EU_size;
    String standard_size;
    String color;
    int quantity;

    @Override
    public void review() {
        System.out.println("reviewing the: " + title);
    }



    public void addToCart(String title) {
        System.out.println("adding " + title + " to the cart");
    }


    public void testTheSize(){

    }
}
