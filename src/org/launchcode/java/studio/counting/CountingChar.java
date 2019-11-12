package org.launchcode.java.studio.counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {
//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Enter a phrase:");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        char[] charactersInString = text.toCharArray();
        HashMap<Character, Integer> occurences = new HashMap<>();

        for (Character chrctr : charactersInString){
            if (!occurences.containsKey(chrctr)) {
                occurences.put(chrctr, 1);
            } else {
                Integer sum = occurences.get(chrctr);
                sum += 1;
                occurences.put(chrctr, sum);
            }
        }
        System.out.println("Result:");
        for (Map.Entry<Character, Integer> occurence : occurences.entrySet()) {
            System.out.println(occurence.getKey() + ": " + occurence.getValue());
        }
    }
}
