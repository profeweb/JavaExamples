package arrays;

public class SumaArray2 {

    public static void main(String[] args){

        int[] a = {3, 5, 2, 8, 9, 3, 0};
        int[] b = {3, 5, 2, 8, 9, 3, 0};
        System.out.printf("La suma és %d.\n", suma2Arrays(a, b));

    }

    public static int suma2Arrays(int[] a, int[] b){
        return sumaArray(a) + sumaArray(b);
    }

    public static int sumaArray(int[] a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s += a[i];
        }
        return s;
    }


}
