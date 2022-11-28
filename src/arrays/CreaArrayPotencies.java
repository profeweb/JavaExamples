package arrays;

import java.util.Scanner;

public class CreaArrayPotencies {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base:");
        int b = input.nextInt();

        System.out.print("Enter Exponent:");
        int e = input.nextInt();

        int[] numeros = creaArrayPotencies(b, e);

        imprimirArray(numeros);

    }

    public static int[] creaArrayPotencies(int b, int n){
        int[] numeros = new int[n];

        for(int i=0; i<numeros.length; i++){
            numeros[i] = potencia(b, i);
        }
        return numeros;
    }

    public static int potencia(int b, int e){
        int p=1;
        for(int i=1; i<=e; i++){
            p*=b;
        }
        return p;
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
