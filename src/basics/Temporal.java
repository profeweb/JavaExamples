package basics;

public class Temporal {

   public static void main(String[] args){

      String s = "Aloha";
      System.out.printf("%s té %d As.", s, numVocalsR(s));

   }

   public static boolean esUnaVocal(char c){
      if(c=='a' || c=='A' ||
         c=='e' || c=='E' ||
         c=='i' || c=='I' ||
              c=='o' || c=='O' ||
              c=='u' || c=='U'){
         return true;
      }
      else {
         return false;
      }
   }


   // Funció Iterativa
   public static int numVocals(String s){
      int num = 0;
      for(int i=0; i<s.length(); i++){
         char lletra = s.charAt(i);
         if(esUnaVocal(lletra)){
            num++;
         }
      }
      return num;
   }

   // Funció Recursiva
   public static int numVocalsR(String s){
      if(s.length()==1 && esUnaVocal(s.charAt(0))){
         return 1;
      }
      else if(s.length()==1 && !esUnaVocal(s.charAt(0))){
         return 0;
      }
      else {
         String tros1 = s.substring(0, s.length()/2);
         String tros2 = s.substring(s.length()/2);
         return numVocalsR(tros1) + numVocalsR(tros2);
      }
   }

}
