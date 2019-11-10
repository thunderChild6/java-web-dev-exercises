package exercises;

import java.util.Scanner;

public class Milespergallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        input = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used?");
        Double gas = input.nextDouble();

        Double milesPerGallon = miles/gas;
        System.out.println("Your miles per gallon is " + milesPerGallon);
    }
}
