package arrays;

public class MinimArrayFuncio {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 3, 0};

        System.out.printf("El mínim de l\'array números és %d.\n", minimArray(numeros));

    }

    public static int minimArray(int[] numeros){
        int min = numeros[0];
        for(int i=1; i<numeros.length; i++){
            if(numeros[i]<min){
                min = numeros[i];
            }
        }
        return min;
    }

}
