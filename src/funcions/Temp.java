package funcions;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        int[] numeros = { 3, 6, 8, 2};
        System.out.printf("La suma de l'array és: %d.", sumaArray(numeros));

    }

    public static int sumaArray(int[] array){
        int s = 0;
        for(int i=0; i<array.length; i++){
            s = s + array[i];
        }
        return s;
    }

    public static float mitjanaArray(int[] array){

        return sumaArray(array) / (float)array.length;
    }



}
