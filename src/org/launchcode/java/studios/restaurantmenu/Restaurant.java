package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu restMenu = new Menu();

        restMenu.addToListArray(new MenuItem("dessert", "Apple Pie", 3.99, true ));
        restMenu.addToListArray(new MenuItem("mains", "Tomato Soup", 5.55));
        restMenu.addToListArray(new MenuItem("appetizer", "Artichoke Dip", 3.33));
        restMenu.addToListArray(new MenuItem("mains", "Grilled Cheese Sandwich", 4.50));


        restMenu.printWholeMenu();

        System.out.println("\n Just one menu item:");
        restMenu.printOneItem(restMenu.newItems.get(0));

        restMenu.removeFromListArray(restMenu.appetizers.get(0));

        restMenu.printWholeMenu();



    }
}
