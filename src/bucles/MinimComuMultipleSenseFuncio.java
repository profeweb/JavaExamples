package bucles;

import java.util.Scanner;

public class MinimComuMultipleSenseFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int m =  (a>b) ? a : b;
        while(m%a!=0 || m%b!=0){
            m++;
        }

        System.out.printf("MCM de %d i %d és %d.", a, b, m);

    }
}
