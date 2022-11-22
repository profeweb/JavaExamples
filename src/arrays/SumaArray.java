package arrays;

public class SumaArray {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 3, 0};
        System.out.printf("La suma és %d.\n", sumaArray(numeros));
        System.out.printf("La mitjana és %f.\n", mitjanaArray(numeros));

    }

    public static int sumaArray(int[] a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s += a[i];
        }
        return s;
    }

    public static float mitjanaArray(int[] a){
        return sumaArray(a) / (float)a.length;
    }

}
