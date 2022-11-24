package arrays;

public class CopiaArray {

    public static void main(String[] args){

        int[] numeros = {2, 6, 8, 10, 9, 3};

        int[] copia = copiaArray(numeros);

        imprimirArray(copia);
    }

    public static int[] copiaArray(int[] a){
        int[] c = new int[a.length];
        for(int i=0; i<c.length; i++){
            c[i] = a[i];
        }
        return c;
    }



    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
