package basics;

import java.util.Scanner;
import static java.lang.Math.PI;

class AreaCercle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT RADIUS
        System.out.print("Enter Radius: ");
        double r = input.nextFloat();

        // AREA = PI*R*R
        double area = PI*r*r;

        // OUTPUT AREA
        System.out.println("AREA: "+area);
    }

}