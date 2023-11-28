package arrays;

public class NumParellsArray {

    public static void main(String[] args){

        int[] numeros = {3, 5, 2, 8, 9, 3, 4};

        int n = 0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0){
                n++;
            }
        }

        System.out.printf("L\'array té %d números parells.", n);

    }

}
