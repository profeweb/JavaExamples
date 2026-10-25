package funcions;

import java.util.Scanner;

public class Maxim2NumerosFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        System.out.printf("El màxim de %d i %d és %d. ", a, b, maxim(a, b));

    }
    public static int maxim(int a, int b){
        return (a>b) ? a : b;
    }

    public static int maxim2(int a, int b){
        int m;
        if(a>b){
            m = a;
        }
        else {
            m = b;
        }
        return m;
    }
}
