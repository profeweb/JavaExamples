package basics;

import java.util.Scanner;

public class Divisio2NumerosQualsevols {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A:");
        float a = input.nextFloat();

        System.out.print("B:");
        float b = input.nextFloat();

        float q = a / b;
        float r = a % b;
        System.out.println("QUOCIENT de " + a + " entre " + b + " és " + q);
        System.out.println("RESTA de " + a + " entre " + b + " és " + r);
    }
}