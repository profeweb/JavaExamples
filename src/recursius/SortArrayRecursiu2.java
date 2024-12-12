package recursius;

public class SortArrayRecursiu2 {

    public static void main(String[] args) {

        int[] nums = {5, 3, 7, 9, 1, 8};

        System.out.println("Abans d'ordenar:");
        printArray(nums);

        sortArray(nums, nums.length-1);

        System.out.println("Després d'ordenar:");
        printArray(nums);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }

    public static int posMaximArray(int[] array, int end){
        int m = array[0];
        int posMax = 0;
        for(int i=0; i<=end; i++){
            if(array[i]>m){
                m = array[i];
                posMax = i;
            }
        }
        return posMax;
    }

    public static void sortArray(int[] array, int end){
        if(end>0){
            int posMax = posMaximArray(array, end);
            int temp = array[end];
            array[end] = array[posMax];
            array[posMax] = temp;
            sortArray(array, end-1);
        }
    }
}
