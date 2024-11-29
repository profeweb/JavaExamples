package arrays;

public class ArrayNoPrefixat {

    public static void main(String[] args) {

        int[] a = {1, 4, 7, 9, 4, 7, 9, 2, 1};
        int[] potencies = arrayPotencies2(10);
        printArray(potencies);
    }

    public static int[] numsArray(int a, int b){
        int[] array = new int[b-a+1];   // Creació de l'array
        // Emplenar amb valors entre A i B
        for(int i=0; i<array.length; i++){
            array[i] = a + i;
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }

    public static int[] copiaArray(int[] array){
        int[] copia = new int[array.length];
        for(int i=0; i<array.length; i++){
            copia[i] = array[i];
        }
        return copia;
    }

    public static int[] subArray(int[] array, int a, int b){
        int[] copia = new int[b-a+1];
        for(int i=0; i<copia.length; i++){
            copia[i] = array[ i + a];
        }
        return copia;
    }

    public static int[] arrayPotencies2(int n){
        int[] array = new int[n];
        for (int i=0; i<array.length; i++){
            array[i] = (int) Math.pow(2, i+1);
        }
        return array;
    }

    public static boolean arraysIguals(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        else {
            for(int i=0; i<a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
