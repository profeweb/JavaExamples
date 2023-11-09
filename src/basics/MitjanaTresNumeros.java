package basics;

import java.util.Scanner;

public class MitjanaTresNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A:");
        int a = input.nextInt();

        System.out.print("B:");
        int b = input.nextInt();

        System.out.print("C:");
        int c = input.nextInt();

        float m = (a + b + c) / 3f;
        System.out.println("MITJANA de " + a + ", " + b + " i "+ c +" és " + m);
    }
}
