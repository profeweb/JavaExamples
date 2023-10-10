package repas;

import java.util.Scanner;

public class Primer {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();

        if(esPrimer(n)){
            System.out.printf("%d és Primer.\n", n);
        }
        else {
            System.out.printf("%d no és Primer.\n", n);
        }

        //System.out.printf("%d-èssima potencia de 2 és %d.\n", n, potenciaDe2(n));

        int[] numeros = {3, 8, 5, 7, 1};
        //printArray(numeros);

        //invertirArray(numeros);
        //printArray(numeros);

        ordenaArray(numeros);
        printArray(numeros);

    }

    public static boolean esPrimer(int n){
        int x = n-1;
        while(n % x !=0){
            x--;
        }
        return (x==1);
    }

    public static int potenciaDe2(int n){
        int x = 1;
        int i = 1;
        while(i <= n){
            x = x * 2;
            i++;
        }
        return x;
    }

    public static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void invertirArray(int[] a){
        int l = 0;
        int r = a.length-1;
        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void ordenaArray(int[] a){
        boolean ordenat = false;
        while(!ordenat){
            ordenat = true;
            for(int i=0; i<=a.length-2; i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    ordenat = false;
                }
            }
        }
    }

    public static  float mitjanaArray(int[] a){
        float sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum / a.length;
    }

}
