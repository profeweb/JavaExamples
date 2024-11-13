package basics;

public class Temporal {

   public static void main(String[] args){

      // ACT 16 - Imparells entre 1 i 13 (ordre ascendent, sense +2)

      for(int i=1; i<=13; i++){
         if(i % 2 == 1) {
            System.out.println(i);
         }
      }

      // ACT 17 - Múltiples de 3 entre 33 i 12 (ordre descendent, sense -3).
      for(int i=33; i>=12; i--){
         if(i%3==0){
            System.out.println(i);
         }
      }


   }

}
