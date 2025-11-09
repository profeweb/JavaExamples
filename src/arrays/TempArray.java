package arrays;

public class TempArray {
    public static void main(String[] args) {
        int[] a = {4, 2, 7, 5, 9, 0, 1, 3};
        int[] b = {4, 2, 7, 5, 9, 0, 1, 6};
        int[] c;
        c = sumaArrays(a, b);
        printArray(c);
    }

    public static int[] joinArrays(int[] a, int[] b){
        int[] array = new int[a.length + b.length];
        for(int i=0; i<a.length; i++){
            array[i] = a[i];
        }
        for(int i=0; i<b.length; i++){
            array[a.length + i] = b[i];
        }
        return array;
    }

    public static int[] sumaArrays(int[] a, int[] b){
        int[] suma = new int[a.length];
        for(int i=0; i<suma.length; i++){
            suma[i] = a[i] + b[i];
        }
        return suma;
    }

    public static boolean sameArrays(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        else {
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static int[] subArray(int[] original, int a, int b){
        int[] array = new int[b-a+1];
        for(int i=0; i<array.length; i++){
            array[i] = original[a + i];
        }
        return array;
    }

    public static int[] intervalArray(int a, int b){
        int[] array = new int[b-a+1];
        for(int i=0; i<array.length; i++){
            array[i]= a + i;
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }
}
