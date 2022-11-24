package arrays;

import java.util.Scanner;

public class CreaArrayPotencies2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N:");
        int n = input.nextInt();

        int[] numeros = creaArrayPotencies2(n);

        imprimirArray(numeros);

    }

    public static int[] creaArrayPotencies2(int n){
        int[] numeros = new int[n];

        int p = 2;
        for(int i=0; i<numeros.length; i++){
            numeros[i] = p;
            p*=2;
        }
        return numeros;
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
