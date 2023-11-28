package arrays;

public class NumPositiusArrayFuncio {

    public static void main(String[] args){

        int[] numeros = {3, -5, 2, 8, 9, -3, 0};
        System.out.printf("L\'array té %d números positius.", numPositiusArray(numeros));

    }

    public static int numPositiusArray(int[] a){
        int n = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                n++;
            }
        }
        return n;
    }


}
