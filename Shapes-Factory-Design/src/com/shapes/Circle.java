package com.shapes;

import java.util.Scanner;

public class Circle implements Area {
    public void spec() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Radius of Circle");
            double r = scan.nextDouble();
            double areaofC= 3.14*r*r;
            System.out.println("The area of the circle is:"+areaofC);
        }
    }
}
