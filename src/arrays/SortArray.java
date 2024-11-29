package arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] a = {4, 8, 2, 5, 11, 1};
        sortArray(a);
        printArray(a);
    }

    public static void sortArray(int[] a){
        boolean ordenat = false;
        while(!ordenat) {
            ordenat = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    ordenat = false;
                }
            }
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }
}
