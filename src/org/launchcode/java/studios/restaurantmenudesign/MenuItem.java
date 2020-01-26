package org.launchcode.java.studios.restaurantmenudesign;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuItem {
    //set and initialize fields
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean newItem;
    //private ArrayList<String> category = new ArrayList<>(Arrays.asList("Appetizer", "Main Course", "Dessert"));
    //could also use an array (but that is fixed size and content so usually use araylist)
    // or use category.add("dessert") but this initializes all in one

    //set constructor
    public MenuItem(String name, double price, String description, String category, boolean newItem){
        this.name = name;
        this.price = price;
        this.description = description;
        this.newItem = newItem;
        this.category = category;
    }

    //set getters no real need for setters?
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory(){
        return this.category;
    }

    public String getNewItem(){
        if (newItem == true){
            return " (NEW)";
        } return "";
    }

    //this is how i pulled a single string from an array or strings using an index number
//    public String getCategory(int i) {
//        return category.get(i);
//    }
    //didnt use this its just for future reference


}
