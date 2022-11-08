package basics;

import java.util.Scanner;

public class Divisio2Numeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A:");
        int a = input.nextInt();

        System.out.print("B:");
        int b = input.nextInt();

        int d = a / b;
        System.out.println("DIVISIÓ de " + a + " entre " + b + " és " + d);
    }
}