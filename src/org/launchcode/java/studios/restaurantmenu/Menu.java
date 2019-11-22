package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> appetizers = new ArrayList<>();
    ArrayList<MenuItem> mains = new ArrayList<>();
    ArrayList<MenuItem> desserts = new ArrayList<>();
    ArrayList<MenuItem> newItems = new ArrayList<>();
    ArrayList<MenuItem> extras = new ArrayList<>();
    public Date lastUpdated = new Date();

    public void addToListArray(MenuItem input) {
        if (input.newItem.equals(true)) {
            newItems.add(input);
        }
        if (input.category.equals("dessert")) {
            desserts.add(input);
        } else if (input.category.equals("mains")) {
            mains.add(input);
        } else if (input.category.equals("appetizer")) {
            appetizers.add(input);
        } else {
            extras.add(input);
        }
    }

    public void removeFromListArray(MenuItem input) {
        if (input.newItem.equals(true)) {
            newItems.remove(input);
        }
        if (input.category.equals("dessert")) {
            desserts.remove(input);
        } else if (input.category.equals("mains")) {
            mains.remove(input);
        } else if (input.category.equals("appetizer")) {
            appetizers.remove(input);
        } else {
            extras.remove(input);
        }
    }

    public void printWholeMenu() {
        if (newItems.size() != 0) {System.out.println("NEW!" + newItems);}
        if (appetizers.size() != 0) {System.out.println("Appetizers: " + appetizers);}
        if (mains.size() != 0) {System.out.println("Mains: " + mains);}
        if (desserts.size() != 0) {System.out.println("Desserts: " + desserts);}
        if (extras.size() != 0) {System.out.println("Also try: " + extras);}
        System.out.println("Menu updated on " + lastUpdated);
    }

    public void printOneItem(MenuItem input) {
        System.out.println(input);
    }
}
