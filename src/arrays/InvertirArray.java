package arrays;

public class InvertirArray {

    public static void main(String[] args){

        int[] numeros = {1, 2, 3, 4, 5, 6 ,7};
        int[] edats   = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        invertirArray(numeros);
        imprimirArray(numeros);

        int[] edats2 = copiaInvertida(edats);
        imprimirArray(edats2);

    }

    public static void invertirArray(int[] array){
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length -1 -i] = temp;
        }
    }

    public static int[] copiaInvertida(int[] array){
        int[] carray = new int[array.length];
        for(int i=0; i<=array.length/2; i++){
            carray[i] = array[array.length-1 - i];
            carray[array.length -1 -i] = array[i];
        }
        return carray;
    }

    public static void imprimirArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

}
