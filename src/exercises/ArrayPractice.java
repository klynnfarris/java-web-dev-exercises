package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //declare and initialize array and other variables 
        int[] myArray = {1,1,2,3,5,8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        /*loop through array and print each value using a for reach loop
        for (int number: myArray) {
            System.out.println(number);
            }
         */

        //modify for each loop to only print the odd numbers
        for (int number: myArray) {
            if(number % 2 != 0)
            System.out.println(number);
        }

        //use split method to divide string at each space and store individual
        //words in array we define here
        String[] emptyArray = new String[45];
        emptyArray = sentence.split("\\.");
        // period has different meaning in split so use backslash first
        System.out.println(Arrays.toString(emptyArray));
        //Is there a way to do this but keep the delimiter aka the period in this case?
        System.out.println(emptyArray[1]);
    }
}
