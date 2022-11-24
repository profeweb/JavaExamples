package arrays;

import java.util.Scanner;

public class CreaArrayNumerosEntreAiB {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        int[] numeros = creaArray(a, b);

        imprimirArray(numeros);

    }

    public static int[] creaArray(int a, int b){
        int n = b - a + 1;
        int[] numeros = new int[n];

        for(int i=0; i<numeros.length; i++){
            numeros[i] = a + i;
        }
        return numeros;
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
