package exercises;

import java.util.Scanner;
//calculate area of a rectangle length + width * 2

public class NumericTypes {
    public static void main(String[] args) {
        //declare variable types
        int length;
        int height;
        int area;

        //declare new scanner object named input to take user input
        //print that input and store response as variable value
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?: ");
        length = input.nextInt();
        System.out.println("What is the height of the rectangle?: ");
        height = input.nextInt();

        //calculate area, close scanner, print result
        area = (length + height) * 2;
        input.close();
        System.out.println("The area of your rectangle is " + area +".");
    }
}
