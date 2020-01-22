package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        // could also use Math.pow(radius , 2) for the area equation
        double area;
        double pi = 3.14;
        //could also use Math.PI;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        radius = input.nextDouble();
        //area = pi * (radius * radius);
        area = Circle.getArea(radius);
        if (radius < 0 ){
            System.out.println("ERROR");
        } else
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
        // could also just call the circle.getarea in prntln instead of storing it to varible
    }
}

//Bonus hints what data type will accept anything, casting etc accept is he asid reassign as a string then check to see
//maybe try an else if statement and parsing