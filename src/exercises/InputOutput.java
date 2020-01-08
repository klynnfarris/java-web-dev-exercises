package exercises;

import java.util.Scanner;
//2.4.2 exercises

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?:");
        String userName = input.nextLine();
        input.close();
        System.out.println("Hello " + userName);
    }
}
