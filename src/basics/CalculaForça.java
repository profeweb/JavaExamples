package basics;

import java.util.Scanner;

class CalculaForça {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT MASA
        System.out.print("Enter mass: ");
        float m = input.nextFloat();

        // INPUT ACCELERACIÓ
        System.out.print("Enter acceleration: ");
        float a = input.nextFloat();

        // F = m * a
        float força = m * a;

        // OUTPUT Força
        System.out.println("Força: "+força);
    }
}