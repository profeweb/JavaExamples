package basics;


import arrays.ArrayNoPrefixat;

public class Temporal {

   public static void main(String[] args){

      // Definició i creació
      int[] a = {3, 8, 2, 11, 25};
      int[] b = {4, 8, 9};
      int[] c = {3, 8, 2, 11, 25, 2, 0, 45, 23};


      System.out.printf("La mitjana de l'array A és %d.", calculaMitjana(a));
      System.out.printf("La mitjana de l'array B és %d.", calculaMitjana(b));
      System.out.printf("La mitjana de l'array C és %d.", calculaMitjana(c));

   }

   public static int calculaSuma(int[] array){
      int suma = 0;
      for(int i=0; i<array.length; i++){
         suma = suma + array[i];
      }
      return suma;
   }

   public static float calculaMitjana(int[] array){
      return calculaSuma(array) / array.length;
   }


}
