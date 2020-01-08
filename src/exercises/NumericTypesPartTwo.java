package exercises;

import java.util.Scanner;
//ask user for miles they drove and gas in gallons they used and print MPG
//MPG = miles / gallons

public class NumericTypesPartTwo {
    public static void main(String[] args) {
        int miles;
        int gas;
        int milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        miles = input.nextInt();
        System.out.println("How many gallons of gas have you used?: ");
        gas = input.nextInt();
        input.close();

        milesPerGallon = miles / gas;
        System.out.println("Your vehicle gets " + milesPerGallon + " MPG.");

    }

}
