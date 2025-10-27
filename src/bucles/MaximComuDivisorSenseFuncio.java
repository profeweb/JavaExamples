package bucles;

import java.util.Scanner;

public class MaximComuDivisorSenseFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int m =  (a<b) ? a : b;
        while(a%m != 0 || b%m!=0){
            m--;
        }

        System.out.printf("MCD de %d i %d és %d.", a, b, m);

    }
}
