package basics;

import java.util.Scanner;
import java.lang.Math.*;

class AreaCercle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT RADIUS
        System.out.print("Enter Radius: ");
        double r = input.nextFloat();

        // AREA = 2*PI*R*R
        double area = 2*Math.PI*r*r;

        // OUTPUT AREA
        System.out.println("AREA: "+area);
    }

}