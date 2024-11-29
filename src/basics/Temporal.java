package basics;


import arrays.ArrayNoPrefixat;

public class Temporal {

   public static void main(String[] args){

      // Definició i creació
      int[] a = {3, 8, 2, 11, 25};

      ArrayNoPrefixat.printArray(invertArray(a));

   }

   public static int[] invertArray(int[] array){
      int[] invertit = new int[array.length];
      for(int i=0; i<array.length; i++){
         invertit[array.length-i -1] = array[i];
      }
      return  invertit;
   }




}
