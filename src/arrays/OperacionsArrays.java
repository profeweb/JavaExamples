package arrays;

import static java.lang.Math.min;

public class OperacionsArrays {


    public static void main(String[] args) {

        int[] A = {2, 5, 7, 9};
        int[] B = {3, 7, 4, 8};
        int[] C;

        // Unió
        System.out.println("Unió: ");
        printArray(unioArrays(A, B));

        // Unió sense repetits
        System.out.println("Unió Sense Repetits: ");
        printArray(unioArrays2(A, B));

        // Intersecció
        System.out.println("Intersecció: ");
        printArray(intereseccioArrays(A, B));

        // Diferència
        System.out.println("Diferència: ");
        printArray(diferenciaArrays(A, B));


    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    public static int[] unioArrays(int[] A, int[] B){
        int[] C = new int[A.length +  B.length];
        for(int i=0; i<A.length; i++){
            C[i] = A[i];
        }
        for(int i=0; i<B.length; i++){
            C[A.length + i] = B[i];
        }
        return C;
    }

    public static int[] unioArrays2(int[] A, int[] B){
        int[] C = new int[A.length +  B.length];

        for(int i=0; i<A.length; i++){
            C[i] = A[i];
        }

        int n = 0;
        for(int j=0; j<B.length; j++) {
            boolean repetit = false;
            int k = 0;
            while (k < A.length && !repetit) {
                if (A[k]==B[j]){
                    repetit = true;
                }
                k++;
            }
            if(!repetit){
                C[A.length + n] = B[j];
                n++;
            }
        }
        return C;
    }

    public static int[] intereseccioArrays(int[] A, int[] B){
        int[] C = new int[ min(A.length,  B.length)];

        int n = 0;
        for(int i=0; i<A.length; i++) {
            boolean repetit = false;
            int j = 0;
            while (j < B.length && !repetit) {
                if (A[i] == B[j]) {
                    repetit = true;
                    C[n] = A[i];
                    n++;
                }
                j++;
            }
        }
        return C;
    }

    public static int[] diferenciaArrays(int[] A, int[] B){
        int[] C = new int[A.length];

        int n = 0;
        for(int i=0; i<A.length; i++) {
            boolean repetit = false;
            int j = 0;
            while (j < B.length && !repetit) {
                if (A[i] == B[j]) {
                    repetit = true;
                }
                j++;
            }
            if(!repetit){
                C[n] = A[i];
                n++;
            }
        }
        return C;
    }
}
