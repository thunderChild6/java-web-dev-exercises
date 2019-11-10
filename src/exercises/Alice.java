package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String opening = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term: ");
        String searchTerm = input.nextLine();
        Boolean result = opening.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println("Word present? " + result);
        
        Integer indexNum = Integer.valueOf(opening.indexOf(searchTerm));
        Integer wordLength = Integer.valueOf(searchTerm.length());
        System.out.println("Index: " + indexNum + "\nLength: " + wordLength);

        String newOpeningFirst = opening.substring(0, indexNum);

        String newOpeningSecond = opening.substring(indexNum + wordLength);
        System.out.println(newOpeningFirst + newOpeningSecond);
//        String newOpening = newOpening.concat(newOpeningFirst).concat(newOpeningSecond);
    }
}
