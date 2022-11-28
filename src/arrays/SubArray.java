package arrays;

public class SubArray {
    public static void main(String[] args){

        int[] numeros = {2, 7, 8, 4, 1, 0, 6, 8, 9};

        int[] tros = subArray(numeros, 5, 8);
        imprimirArray(tros);
    }

    public static int[] subArray(int[] a, int first, int last){
        int[] t = new int[last-first+1];
        for(int i=0; i<t.length; i++){
            t[i] = a[first+i];
        }
        return t;
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }

}
