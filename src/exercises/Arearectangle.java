package exercises;

import java.util.Scanner;

public class Arearectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length:");
        Double length = input.nextDouble();

        input = new Scanner(System.in);
        System.out.println("Enter the rectangle width:");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("The area of a rectangle with a length of " + length + " and a width of " + width + " is " + area);
    }
}
