package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class AreaBonus {
    public static void main(String[] args) {
        //double radius;
        String radius;
        double area;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        //radius = input.nextDouble();
        radius = input.nextLine();
        //area = pi * (radius * radius);

        if (radius == null ){
            System.out.println("ERROR");
        } else
            System.out.println("The area of a circle with a radius of " + radius + " is: ");

    }
}