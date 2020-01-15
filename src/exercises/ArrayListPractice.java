package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //can also use .add() method to populate list but this does it all in one line must import arrays and rraylist
        //classes though
        ArrayList<String> words = new ArrayList<>(Arrays.asList("fiver", "hi", "friend", "world"));

        System.out.println(numbers);
        System.out.println(sumNumbers(numbers));
        System.out.println(wordMethod(words));
    }

    //static method that takes in arraylist of integers and returns int
    //adds even numbers from list and returns a total
    public static int sumNumbers(ArrayList<Integer> numbers){
        //static method to find sum of all even numbers
        int total = 0;
        for (int item : numbers) {
            if (item % 2 == 0) {
                total += item;
            }
        }
        return total;
    }

    //method to print each word in an array that has 5 letters
    public static ArrayList<String> wordMethod (ArrayList<String> words){
        ArrayList<String> emptyArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int userNumber;

        System.out.println("Enter word length: ");
        userNumber = input.nextInt();

        for(String listedWord : words){
            if(listedWord.length() == userNumber){
                emptyArray.add(listedWord);
            }
        } return emptyArray;
    }
    /* really watch out for types and what each can do, i was trying to
    use .size on listedWord but it is a String not an arraylist
     */
}
