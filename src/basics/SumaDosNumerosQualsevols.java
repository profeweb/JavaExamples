package basics;

import java.util.Scanner;

public class SumaDosNumerosQualsevols {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A:");
        int a = input.nextInt();

        System.out.print("B:");
        int b = input.nextInt();

        int d = a + b;
        System.out.println("SUMA de " + a + " i " + b + " és " + d);
    }
}