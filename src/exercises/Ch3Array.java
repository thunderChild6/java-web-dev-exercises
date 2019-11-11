package exercises;

import java.util.Arrays;

public class Ch3Array {
    public static void main(String[] args) {
        int[] myValues = new int[]{1, 1, 2, 3, 5, 8};
        for (int value : myValues) {
            if (value % 2 == 1) {
                System.out.println(value);
            }
        }

        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] myArray = new String[100];
        myArray = myString.split("\\.");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Array length: " + myArray.length);
    }
}
