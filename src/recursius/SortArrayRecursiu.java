package recursius;

public class SortArrayRecursiu {

    public static void main(String[] args) {

        int[] nums = {5, 3, 7, 9, 1, 8};

        System.out.println("Abans d'ordenar:");
        printArray(nums);

        sortArray(nums, 0);

        System.out.println("Després d'ordenar:");
        printArray(nums);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }

    public static int posMinimArray(int[] array, int start){
        int m = array[start];
        int posMin = start;
        for(int i=start+1; i<array.length; i++){
            if(array[i]<m){
                m = array[i];
                posMin = i;
            }
        }
        return posMin;
    }

    public static void sortArray(int[] array, int start){
        if(start<array.length-1){
            int posMin = posMinimArray(array, start);
            int temp = array[start];
            array[start] = array[posMin];
            array[posMin] = temp;
            sortArray(array, start+1);
        }
    }
}
