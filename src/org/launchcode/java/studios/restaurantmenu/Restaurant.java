package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu restMenu = new Menu();

        restMenu.addToListArray(new MenuItem("dessert", "Apple Pie", 3.99, true ));
        restMenu.addToListArray(new MenuItem("mains", "Tomato Soup", 5.55));


        restMenu.printWholeMenu();

//        System.out.println("NEW!" + restMenu.newItems);
//        System.out.println("Appetizers: " + restMenu.appetizers);
//        System.out.println("Mains: " + restMenu.mains);
//        System.out.println("Desserts: " + restMenu.desserts);
//        System.out.println("Also try: " + restMenu.extras);
//        System.out.println("Menu updated on " + restMenu.lastUpdated);
    }
}
