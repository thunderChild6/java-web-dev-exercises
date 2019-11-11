package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch3ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("Array List: "+ numbers);

//        SumEvenNums.sumEvenNums(numbers);
        System.out.println("Sum of evens: " + SumEvenNums.sumEvenNums(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("cow");
        words.add("goose");
        words.add("duck");
        words.add("seven");
        words.add("lizard");
        words.add("Groot");
        words.add("Marzipan");
        System.out.println("Words: " + words);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        Integer numberOfLetters = input.nextInt();
        System.out.println(Ch3PrintFiveLetterWords.printFiveLetterWords(words, numberOfLetters));
    }
}
