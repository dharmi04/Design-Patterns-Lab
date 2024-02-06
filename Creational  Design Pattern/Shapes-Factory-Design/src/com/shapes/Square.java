package com.shapes;

import java.util.Scanner;

public class Square implements Area {
    public void spec() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Side of Square");
            double b = scan.nextDouble();
            double areaofS= b*b;
            System.out.println("The area of the square is:"+areaofS);
        }
    }
}
