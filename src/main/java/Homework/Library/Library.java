package Homework.Library;

import java.util.ArrayList;

public class Library{

    ArrayList<String> catalog = new ArrayList<>();
    ArrayList<String> users = new ArrayList<>();

    ArrayList<String> borrowedBook = new ArrayList<>();

    public void addUser(User user){
        users.add(user.name);
    }

    public void addBook(Book book){
        catalog.add(book.title);
    }

    public void borrowBook(User user, Book book){
        if(user.maxBooks <= 3){
            catalog.remove(book.title);
            borrowedBook.add(book.title);
        }
//        if(user.maxBooks <= 6){
//            Faculty fc = new Faculty(user.name, user.id);
//            catalog.remove(book);
//            borrowedBook.add(book.title);
//        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The great Gatsby", "Scott Fitzgerald");
        Book book2 = new Book("Harry Potter", "J.K.Rowling");

        Student student1 = new Student("John", 1);
        Student student2 = new Student("Wick", 2);

        Faculty fc1 = new Faculty("Sam", 3);
        Faculty fc2 = new Faculty("Norton", 4);

        Library library = new Library();

        library.addUser(student1);
        library.addUser(student2);

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook(student1,book1);
        library.borrowBook(student2,book2);

        System.out.println(library.catalog);
        System.out.println(library.users);
        System.out.println(library.borrowedBook);
        System.out.println(library.catalog);
    }
}
