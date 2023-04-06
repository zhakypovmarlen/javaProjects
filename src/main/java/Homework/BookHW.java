package Homework;

public class BookHW {
    String title;
    String author;
    String ISBN;
    double price;

    public BookHW(String title, String author, String ISBN, double price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
    public BookHW(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        price = 0.0;
    }
    public BookHW(String title, String author){
        this.title = title;
        this.author = author;
        ISBN = "Unknown";
        price = 0.0;
    }
    public void displayBookInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Price: " + this.price);
    }
    public static void main(String[] args) {
        BookHW book1 = new BookHW("Harry Potter", "J.K.Rowling", "1234121231-12", 40.3);
        BookHW book2 = new BookHW("When the mountains fall", "Chingiz Torekulovich Aytmatov",
                "4213123123-22");
        BookHW book3 = new BookHW("Kite Runner", "Khaled Hosseini");

        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
        System.out.println();
        book3.displayBookInfo();
    }

}
