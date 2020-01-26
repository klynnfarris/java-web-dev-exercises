package org.launchcode.java.livecodingclass3;
import java.util.ArrayList;

public class Library {

    private String location;
    private ArrayList<Book> books;
    // you dont want to create the books here you want to create them somewhere else
    //then put them here so dont instatiate books in this class

    public Library (String location){
        this.location = location;
        this.books = new ArrayList<>();
    }

    //were pretending this library could maybe not have books for some reason
    //how do i get individual books into the aray list up there. use instance method
    //cant just use setter bc it would override it so make this method

    public void addBook(Book book){
        this.books.add(book);
    }

    public void getBooks(){
        for (Book book: this.books ){
            System.out.println(book.getTitle());
        }
    }


    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }

    //static method belongs to class library so you can call Library.getDewey() in main
    //VS an instance of the class like getter setter where we have to create new
    //Library libray = new Library(); object and call it on that. like library.getlocation
    public static double getDewey (){
        return 432.43;
    }
}
