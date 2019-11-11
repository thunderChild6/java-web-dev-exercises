package exercises;

import java.util.ArrayList;

public class SumEvenNums {
    public static Integer sumEvenNums(ArrayList<Integer> input) {
        Integer sum = 0;
        for (Integer number : input ) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
