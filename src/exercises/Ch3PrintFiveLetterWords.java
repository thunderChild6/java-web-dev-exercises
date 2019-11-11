package exercises;

import java.util.ArrayList;

public class Ch3PrintFiveLetterWords {
    public static String printFiveLetterWords(ArrayList<String> input, Integer number) {
        String fiveLetterWord = "";
        for (String word : input) {
            if (word.length() == number) {
                fiveLetterWord = word;
                System.out.println(fiveLetterWord);
            }
        }
        String string = "";
        return string;
    }
}
