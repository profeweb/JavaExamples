package arrays;

public class ArrayPrimers {

    public static void main(String[] args) {
        printArray(arrayPrimers(10));
    }

    public static int[] arrayPrimers(int n){
        int[] primers = new int[n];
        int p = 1;
        int np =  0;
        while(np<n){
            if(esPrimer(p)){
                primers[np] = p;
                np++;
            }
            p = p + 1;
        }
        return primers;
    }

    public static boolean esPrimer(int n){
        int i = n - 1;
        while (i > 1 && n % i != 0) {
            i--;
        }
        return (i == 1);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }
}
