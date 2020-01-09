package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        radius = input.nextDouble();
        //area = pi * (radius * radius);
        area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

    }
}
