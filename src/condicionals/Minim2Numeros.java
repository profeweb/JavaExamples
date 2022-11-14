package condicionals;

import java.util.Scanner;

public class Minim2Numeros {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int minim = (a<b) ? a : b;
        System.out.println("Minim: "+minim);

    }
}
