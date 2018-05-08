package org.launchcode.java.demos.java4python;
//use alt enter to import Scanner in

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        //declare variables 
        double radius;
        double circle_area;
        do {
            //creates a new scanner obj that reads input from System.in
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();
        }
            while(radius<0);
            circle_area = 3.14 * (radius*2);
            System.out.println("The area is: " + circle_area);
        }
    }