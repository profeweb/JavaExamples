package arrays;

public class ZipArrays {

    public static int[] a = {1, 3, 5, 7};
    public static int[] b = {2, 4, 6, 8};

    public static void main(String[] args){
        int[] ab = zipArrays(a, b);
        imprimirArray(ab);
    }

    public static int[] zipArrays(int[] a, int[] b){
        int[] z = new int[a.length+b.length];
        for(int i=0, j=0; j<a.length; i+=2, j++){
            z[i] = a[j];
            z[i+1] = b[j];
        }
        return z;
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d : %d\n", i, a[i]);
        }
    }
}
