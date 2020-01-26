package org.launchcode.java.livecodingclass3;

public class Book {

        //typically always set fields as private
        private String title;
        private String author;
        private int numberOfPages;

        //getter and setter must be public or theyre useless

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book (String title, String author, int numberOfPages){
        this(title, author);
        //this calls ut from the first constructor
        this.numberOfPages = numberOfPages;
    }


    public String getTitle() {
        return this.title;
    }

    //would probably never need a setter on a book title author or numbr of
    //pages bc we wont have to set it ever again it wont change
    public void setTitle(String title) {
        //by using this. were avoiding shadowing. this. refers to the field in class
        //not the paramater in the settitle thing this instead of the aTitle we did
        //in the exercise
        this.title = title;
    }
}
