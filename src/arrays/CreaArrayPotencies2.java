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

        for(int i=0; i<numeros.length; i++){
            numeros[i] = potencia2(i);
        }
        return numeros;
    }

    public static int potencia2(int n){
        int p=1;
        for(int i=1; i<=n; i++){
            p*=2;
        }
        return p;
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
