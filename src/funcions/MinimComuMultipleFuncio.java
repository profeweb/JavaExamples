package funcions;

import java.util.Scanner;

public class MinimComuMultipleFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int m = mcm(a, b);

        System.out.printf("MCM de %d i %d és %d.", a, b, m);

    }

    public static int mcm(int a, int b){
        int m =  maxim(a, b);
        while(m%a!=0 || m%b!=0){
            m++;
        }
        return m;
    }
    public static int maxim(int a, int b){
        return (a>b) ? a : b;
    }
}
