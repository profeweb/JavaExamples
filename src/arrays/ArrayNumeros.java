package arrays;

public class ArrayNumeros {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 1, 0};
        int[] notes = {8, 10, 9};

        imprimirArray(numeros);
        System.out.println();
        imprimirArrayInv(notes);
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }

    public static void imprimirArrayInv(int[] a){
        for(int i=a.length-1; i>=0; i--) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
