package parametres;

public class PasReferencia {

    public static void main(String[] args){
        int[] n = {2, 4, 6, 8};
        doIt(n);
        printArray(n);
    }

    public static void doIt(int[] nums){
        printArray(nums);
        nums[2]=12;
        printArray(nums);
    }

    public static void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.printf("%d \t", nums[i]);
        }
        System.out.println();
    }
}
