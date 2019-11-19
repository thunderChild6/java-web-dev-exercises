package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> appetizers = new ArrayList<>();
    ArrayList<MenuItem> mains = new ArrayList<>();
    ArrayList<MenuItem> desserts = new ArrayList<>();
    ArrayList<MenuItem> newItems = new ArrayList<>();
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
        }
    }
}
