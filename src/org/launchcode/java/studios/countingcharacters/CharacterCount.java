package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//program to count number of times each character occurs
public class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String letters = input.nextLine();
        /*String letters = "If the product of two terms is zero then common sense says at least one of the" +
                " two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        */
        //could also use char[] textInString = letters.toCharArray()
        HashMap<Character, Integer> emptyHash = new HashMap<>();

        int count = 1;
        //cleaer way is to use for each
        for (int i=0; i<letters.length(); i++) {
            char lowerCaseChar = letters.toLowerCase().charAt(i);
            if (emptyHash.containsKey(lowerCaseChar)) {
                count = emptyHash.get(lowerCaseChar) + 1;
                //use get not getvalue to access value at key in HM
                emptyHash.put(lowerCaseChar, count);
            } else {
                emptyHash.put(lowerCaseChar, 1);
            }
        }

        System.out.println("How many times a character appears in the string:");
        //iterate through a hasmap and this map.entry thing is the type we use
        for (Map.Entry<Character, Integer> letter : emptyHash.entrySet()) {
            System.out.println(letter.getKey() + ":" + letter.getValue());
        }
    }




    }
