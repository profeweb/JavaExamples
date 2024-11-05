package basics;

import java.util.Scanner;

import static java.lang.Math.PI;

class PerimetreCercle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT RADIUS
        System.out.print("Enter Radius: ");
        double r = input.nextFloat();

        // PERIMETER = 2*PI*R
        double perimeter = 2*PI*r;

        // OUTPUT AREA
        System.out.println("PERIMETER: "+perimeter);
    }

}