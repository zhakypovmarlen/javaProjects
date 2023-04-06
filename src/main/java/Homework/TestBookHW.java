package Homework;

import Constructors.Book;

public class TestBookHW {
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
