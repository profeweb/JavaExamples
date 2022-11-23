package arrays;

public class MaximArrayFuncio {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 3, 0};
        int[] notes = {3, 5, 2};

        System.out.printf("El màxim de l\'array números és %d.\n", maxArray(numeros));
        System.out.printf("El màxim de l\'array notes és %d.", maxArray(notes));

    }

    public static int maxArray(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

}
