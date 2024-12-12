package recursius;

public class NumParsArray {

    public static void main(String[] args) {
        int[] nums = {10, 5, 1, 2, 8, 7, 3, 21};
        System.out.printf("L'array té %d números pars.\n", numPars(nums));
        System.out.printf("L'array té %d números pars.\n", numPars(nums, 0, nums.length-1));
    }

    public static int numPars(int[] array){

        if(array.length==1 && array[0]%2==0){
            return 1;
        }
        else if(array.length==1 && array[0]%2==1){
            return 0;
        }
        else {

            // Nou array amb la 1a casella (0)
            int[] tros1 = new int[1];
            tros1[0] = array[0];

            // Nou array amb la resta de caselles (1 a length-1)
            int[] tros2 = new int[array.length-1];
            for(int i=0; i<tros2.length; i++){
                tros2[i] = array[i+1];
            }

            return numPars(tros1) + numPars(tros2);
        }
    }

    public static int numPars(int[] array, int start, int end){
        if(start==end && array[start]%2==0){
            return 1;
        }
        else if(start==end && array[start]%2==1){
            return 0;
        }
        else {
            return numPars(array, start, start) + numPars(array, start+1, end);
        }
    }
}
