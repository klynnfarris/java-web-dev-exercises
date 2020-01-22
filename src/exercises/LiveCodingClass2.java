package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class LiveCodingClass2 {

    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        //could use hashmap for movie and genre

        Scanner keyboard = new Scanner (System.in);
        //use do while cause we know we want it to run at least once lol
        boolean keepGoing;
        do {
            System.out.println("Name a favorite movie: ");
            String movie = keyboard.nextLine();
            if (movie.length() < 1) {
                keepGoing = false;
            } else {
                movies.add(movie);
                keepGoing = true;
            }
        } while(keepGoing);

        for(int i = 0; i<movies.size(); i++){
            System.out.println(movies.get(i));
        }
        //can also do it this way but first way better
        //for(String mov: movies){
          //  System.out.println(mov);
        //}

    }
}
/* a method to make only certain words enterable
//could also create new scanner instead of making it a parameter
public static String getGenre(Scanner keyboard){
   String[] genres = {"Action", "Romance", "Comedy"};
   int index = 0;
   for (String genre: genres){
      System.out.prntln(index + ": " + genre);
      index++;}
      int choice = keyboard.nextInt();
      keyboard.nextLine();
      return genres[choice];
}
}
 */
