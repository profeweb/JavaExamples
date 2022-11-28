package arrays;

public class ComparaArrays {

    public static void main(String[] args){

        int[]a = {2, 6, 8, 9};
        int[]b = {2, 6, 7, 9};

        System.out.printf("Son iguals? %b", iguals(a, b));
    }

    public static boolean iguals(int[] a, int[] b){
        if(a.length!=b.length){
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
}
