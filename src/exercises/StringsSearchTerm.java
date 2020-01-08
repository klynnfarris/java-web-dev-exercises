package exercises;

import java.util.Scanner;

public class StringsSearchTerm {
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
    }
}
