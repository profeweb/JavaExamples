package arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] numeros = {2, 6, 4, 8, 0, 1};
        int s = sumaArray(numeros);
        System.out.println("Suma: "+s);
    }

    public static int sumaArray(int[] array){
        int suma = 0;
        for(int i=0; i<array.length; i++){
            suma = suma + array[i];
        }
        return suma;
    }

    public static float mitjanaArray(int[] array){
        int s = sumaArray(array);
        return s / (float)array.length;
    }

}
