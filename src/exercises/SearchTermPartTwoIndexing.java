package exercises;

import java.util.Scanner;

public class SearchTermPartTwoIndexing {
    public static void main(String[] args){
        String quote = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a search term: ");
        searchTerm = input.next();

        if(quote.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println("Search term found");
        }else {
            System.out.println("Search term not found");
        }
        // change them both to lowercase to get rid of case sensitivity
        int searchTermIndex = quote.indexOf(searchTerm);
        int searchTermLength = searchTerm.length();

        System.out.println("Search term has an index of " + searchTermIndex + " and a length of " + searchTermLength );

        //create new sentence ex: beginning index 10 length 9
        int secondInt = searchTermIndex + searchTermLength + 1;
        String firstHalf = quote.substring(0,searchTermIndex);
        String secondHalf= quote.substring(secondInt);
        String newSentence = firstHalf.concat(secondHalf);

        System.out.println(newSentence);


    }
}