public class Temp {

    public static void main(String[] args) {

        int[] a = {4, 7, 8};

        printArray(a);
        addOne(a);
        printArray(a);
    }


    public static void addOne(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] + 1;
        }
    }

    public static void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }

}
