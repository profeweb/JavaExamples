package arrays;

import java.util.Scanner;

public class NumerosPrimersArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();

        int[] numeros = creaArrayPrimers(n);
        printArray(numeros);

    }

    public static int[] creaArrayPrimers(int n){
        int[] array = new int[n];

        int numPrimers =  0;
        int num = 2;
        while(numPrimers<n){

            int x = num - 1;
            while(num % x !=0){
                x = x -1;
            }

            if(x == 1){
                array[numPrimers] = num;
                numPrimers++;
            }
            num++;
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }
}
