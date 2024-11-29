package arrays;

public class MitjanaArray {

    public static void main(String[] args){

        int[] a = {2, 6, 8, 2, 0};
        int[] b = {0, 3, 1, 5, 4};

        float mA = mitjanaArray(a);
        System.out.printf("La mitjana de l'array A és %f\n.", mA);

        float mB = mitjanaArray(b);
        System.out.printf("La mitjana de l'array B és %f\n.", mB);
        
    }

    public static float mitjanaArray(int[] a){
        return sumaArray(a) / a.length;
    }


    public static int sumaArray(int[] a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s = s + a[i];
        }
        return s;
    }
}
