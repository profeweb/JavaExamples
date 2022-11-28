package arrays;

public class Suma2Arrays {
    public static void main(String[] args){

        int[] a = {2, 6, 8, 2, 0};
        int[] b = {0, 3, 1, 5, 4};

        int[] c = sumaArrays(a, b);

        for(int i=0; i<c.length; i++){
            System.out.printf("%d\n", c[i]);
        }
    }

    public static int[] sumaArrays(int[] a, int[] b){
        int[] s = new int[a.length];
        for(int i=0; i<a.length; i++){
            s[i] = a[i] + b[i];
        }
        return s;
    }
}
