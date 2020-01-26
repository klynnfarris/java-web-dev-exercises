package org.launchcode.java.livecodingclass3;

public class Main {
    public static void main(String[] args) {
        Book newBook = new Book("War and peace", "tolstoy");
        Book bookOne = new Book("HP", "JKR", 300);
        Library library = new Library("CWE");

        library.addBook(newBook);
        library.addBook(bookOne);
        library.getBooks();

        //System.out.println(newBook.getTitle());
        //System.out.println(bookOne.getTitle());
    }
}
