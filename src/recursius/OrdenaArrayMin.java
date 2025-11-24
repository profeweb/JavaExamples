package recursius;

public class OrdenaArrayMin {

    public static void main(String[] args) {
        int[] nums = {4, 8, 2, 7, 5, 1, 9};
        ordenaArrayMin(nums, 0);
        printArray(nums);
    }


    public static void printArray(int[] array){
        System.out.print("\n[");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    public static void ordenaArrayMin(int[] array, int pos){
        if(pos < array.length-1){
            int posMin = posMinimArray(array, pos);
            int temp = array[pos];
            array[pos] = array[posMin];
            array[posMin] = temp;
            ordenaArrayMin(array, pos +1);
        }
    }

    public static int posMinimArray(int[] array, int pos){
        int minVal = array[pos];
        int posMin = pos;
        for(int i=pos+1; i<array.length; i++){
            if(array[i]<minVal){
                minVal = array[i];
                posMin = i;
            }
        }
        return posMin;
    }
}
