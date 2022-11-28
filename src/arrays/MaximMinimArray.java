package arrays;

public class MaximMinimArray {

    public static void main(String[] args){

        int[] numeros = {7, 9, 2, 5, 8, 3, 6};

        int[] e = extentArray(numeros);

        System.out.printf("El mínim de l\'array és %d.\n", e[0]);
        System.out.printf("El màxim de l\'array és %d.\n", e[1]);

    }

    public static int[] extentArray(int[] a){
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
        int[] extend = {min, max};
        return extend;
    }
}
