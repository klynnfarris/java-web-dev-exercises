package org.launchcode.java.studios.restaurantmenudesign;

public class Main {
    public static void main(String[] args) {
        //instantiate a menu item
        Menu menu = new Menu();
        MenuItem lobsterRisotto = new MenuItem("Lobster Risotto", 14.99, "Lobster pasta in buttery red sauce", "Entree", false);
        MenuItem beerimissu = new MenuItem("Beerimissu", 7.99, "Terrimissu made with stout beer", "Dessert", true);

        //print the category of lobster risotto using an idex
       // System.out.println(lobsterRisotto.getCategory(0));
        //System.out.println(lobsterRisotto.getNewItem());

        //add items to menu
        menu.addMenuItem(lobsterRisotto);
        menu.addMenuItem(beerimissu);

        //display the menu
        menu.getMenu();

    }
}
