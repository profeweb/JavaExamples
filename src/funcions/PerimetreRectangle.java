package funcions;

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

        // PERIMETER
        float p = perimetre(a, b);

        // OUTPUT P
        System.out.printf("Perimeter: %f.", p);
    }

    public static float perimetre(float a, float b){
        return 2*a + 2*b;
    }
}