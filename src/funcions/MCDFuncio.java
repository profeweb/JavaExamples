package funcions;

import java.util.Scanner;

public class MCDFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        System.out.printf("El MCD de %d i %d és %d. ", a, b, mcd(a, b));

    }
    public static int minim(int a, int b){
        return (a<b) ? a : b;
    }

    public static int mcd(int a, int b){
        int m = minim(a, b);
        while(a%m!=0 || b%m!=0){
            m--;
        }
        return m;
    }
}
