package Constructors;

public class Book {

    String title;
    String author;
    String category;



    public Book(String titleOfTheBook, String authorOfTheBook, String categoryOfTheBook){
        title = titleOfTheBook;
        author = authorOfTheBook;
        category = categoryOfTheBook;

    }

    public Book(){
        // this is default constructor
    }


    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Harry Potter";
        book1.author = "Rowling";
        book1.category = "fiction";
        System.out.println(book1.category);

        Book book2 = new Book("1984", "Orwell", "anti-utopia");
        System.out.println(book2.category);

        Book book3 = new Book();
        book3.title = "First Teacher";
        book3.author = "Chyngyz Torekulovic Aytmatov";
        book3.category = "history";
        System.out.println(book3.author);

        Book book4 = new Book("Running After the Wind", "Khaled Hosseini", "history");
        System.out.println(book4.author);

    }
}
