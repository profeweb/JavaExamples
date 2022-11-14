package condicionals;

import java.util.Scanner;

public class Maxim2Numeros {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int maxim = (a>b) ? a : b;
        System.out.println("Minim: "+maxim);

    }
}
