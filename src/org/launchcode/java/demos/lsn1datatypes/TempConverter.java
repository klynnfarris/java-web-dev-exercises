package org.launchcode.java.demos.lsn1datatypes;

//import java.util.Scanner;
//we can do it this way or we can leave the import out and change
//each scanner to java.util.Scanner and they both work

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        java.util.Scanner input;
        //this says input variable will be of the java.util package and class scanner data type

        input = new java.util.Scanner(System.in);
        //creates an instance of scanner thats what new means idk lol
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
