package basics;

import java.util.Scanner;

import static java.lang.Math.PI;

class AreaCercle2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT DIÀMETRE
        System.out.print("Enter Diameter: ");
        double d = input.nextFloat();

        // AREA = PI * D*D / 4
        double area = PI * Math.pow(d, 2) / 4;

        // OUTPUT AREA
        System.out.println("AREA: "+area);
    }

}