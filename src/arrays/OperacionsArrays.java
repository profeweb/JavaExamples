package arrays;

public class OperacionsArrays {


    public static void main(String[] args) {

        int[] A = {2, 5, 7, 9};
        int[] B = {3, 7, 4, 8};
        int[] C;

        // Unió
        System.out.println("Unió: ");
        printArray(unioArrays(A, B));

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
}
