package arrays;

public class DiferenciaMaximMinimArray {

    public static void main(String[] args){

        int[] numeros = {7, 9, 2, 5, 8, 3, 6};

        int e = distanciaMaxMinArray(numeros);

        System.out.printf("La distància entre el màxim i el mínim de l\'array és %d.\n", e);

    }

    public static int distanciaMaxMinArray(int[] a){
        int max = a[0];
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        return max - min;
    }
}
