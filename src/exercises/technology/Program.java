package exercises.technology;

public class Program {
    public static void main(String[] args) {

        System.out.println("Initial tech:");
        Computer compyOne = new Computer("Dell", 75);
        System.out.println(compyOne);

        Laptop lappyOne = new Laptop("Dell", 42, 5, 60);
        System.out.println(lappyOne);

        SmartPhone smartyOne =  new SmartPhone("BLU", 30, 5);
        System.out.println(smartyOne);

        System.out.println("\nMethods:");
        compyOne.installGames();
        System.out.println(compyOne);

//        compyOne.printThePaper();

        lappyOne.useLappy(60);
        System.out.println(lappyOne);

        smartyOne.droppedIt();
        System.out.println(smartyOne);

    }
}
