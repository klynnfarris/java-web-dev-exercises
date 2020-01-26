package org.launchcode.java.studios.restaurantmenudesign;

import org.launchcode.java.livecodingclass3.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menu = new ArrayList<>();

    //methods that use the menu instance i have created from menuitem class to add items to menu and get the menu array
    //those methods can be called in main to add items and then retrieve the full menu
    public void addMenuItem(MenuItem item){
        this.menu.add(item);
    }

    public void getMenu(){
        for(MenuItem entry: this.menu){
            System.out.println(entry.getName() + " " + entry.getPrice() + entry.getNewItem() +  "\n" + entry.getDescription() + "\n");
        }
    }
}
