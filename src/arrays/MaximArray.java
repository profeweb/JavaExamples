package arrays;

public class MaximArray {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 3, 0};

        int max = numeros[0];
        for(int i=1; i<numeros.length; i++){
            if(numeros[i]>max){
                max = numeros[i];
            }
        }

        System.out.printf("El màxim de l\'array números és %d.\n", max);

    }

}
