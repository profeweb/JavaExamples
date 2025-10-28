package funcions;

public class ImprimirParellsArray {
    public static void main(String[] args) {

        int[] nums1 = {3, 4, 2, 8, 1, 7};
        int[] nums2 = {1, 3, 4, 5, 8, 9};

        System.out.printf("%d Parells a NUMS1: ", quantsParellsArray(nums1));
        imprimirParellsArray(nums1);

        System.out.printf("%d Parells a NUMS2: ", quantsParellsArray(nums2));
        imprimirParellsArray(nums2);

    }

    public static void imprimirParellsArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                System.out.printf("%d%n", array[i]);
            }
        }
    }

    public static int quantsParellsArray(int[] array){
        int num = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                num++;
            }
        }
        return num;
    }
}
