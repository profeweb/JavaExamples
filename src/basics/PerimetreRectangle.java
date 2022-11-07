package basics;

import java.util.Scanner;

class PerimetreRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT A
        System.out.print("Enter side A: ");
        float a = input.nextFloat();

        // INPUT B
        System.out.print("Enter side B: ");
        float b = input.nextFloat();

        // P = 2xA + 2xB
        float p = 2*a + 2*b;

        // OUTPUT P
        System.out.println("Perimeter: "+p);
    }
}