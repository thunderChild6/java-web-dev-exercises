package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {

//        HouseCat garfield = new HouseCat("Garfield", 12);
//        garfield.eat();
//        System.out.println("Cat is tired? " + garfield.isTired());

//        HouseCat spike = new HouseCat("Spike");
//        System.out.println(spike.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Chesire", 12);
        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

    }
}
