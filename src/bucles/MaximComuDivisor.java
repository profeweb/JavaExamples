package bucles;

import java.util.Scanner;

public class MaximComuDivisor {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int m =  minim(a, b);
        while(a%m!=0 || b%m!=0){
            m--;
        }

        System.out.printf("MCD de %d i %d és %d.", a, b, m);

    }

    public static int minim(int a, int b){
        return (a<b) ? a : b;
    }
}
