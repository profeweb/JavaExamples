package arrays;

public class ArrayNumeros {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 1, 0};
        int[] notes = {9, 10, 9};

        imprimirArray(numeros);
        imprimirArray(notes);
    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
