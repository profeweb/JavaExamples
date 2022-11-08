package basics;

import java.util.Scanner;

class AreaRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT A
        System.out.print("Enter side A: ");
        float a = input.nextFloat();

        // INPUT B
        System.out.print("Enter side B: ");
        float b = input.nextFloat();

        // Area = A x B
        float area = a*b;

        // OUTPUT Area
        System.out.println("Area: "+area);
    }
}