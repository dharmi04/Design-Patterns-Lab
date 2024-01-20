package com.shapes;
import java.util.Scanner;
public class Rectangle implements Area {
    public void spec() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the breadth of the Rectangle:");
            double b = scan.nextDouble();
            System.out.println("Enter the height of the Rectangle:");
            double h = scan.nextDouble();
            double areaofR= b*h;
            System.out.println("The area of the rectangle is:"+areaofR);
        }
    }
}
