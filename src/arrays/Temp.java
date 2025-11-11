package arrays;

import diagrames.diagrama01.Material;

public class Temp {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        printArray(zipArrays(a, b));
    }

    public static void sumaUn(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = a[i] + 1;
        }
    }

    public static int[] zipArrays(int[] a, int[] b){
        int[] array = new int[a.length*2];
        for(int i=0; i<array.length; i++){
            if(i%2==0){
                array[i] = a[i/2];
            }
            else {
                array[i] = b[2*i-1];
            }
        }
        return array;
    }

    public static void invertArray2(int[] original){
        for(int i=0; i<original.length/2; i++){
            int temp = original[i];
            original[i] = original[original.length-1-i];
            original[original.length-1-i] = temp;
        }
    }

    public static int[] invertArray(int[] original){
        int[] array = new int[original.length];
        for(int i=0; i<array.length; i++){
            array[i] = original[original.length-i-1];
        }
        return array;
    }


    public static int[] arrayPotencies(int base, int n){
        int[] array = new int[n];
        for(int i=0; i<array.length; i++){
            array[i] = (int) Math.pow(base, i);
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }
}
