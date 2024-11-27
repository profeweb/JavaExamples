package basics;

import java.util.Scanner;

public class Temporal {

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      System.out.print("Enter N: ");
      int n = input.nextInt();

      System.out.printf("El factorial de %d és %d.", n, factorial(n));
   }

   public static int factorial(int n){
      int f = 1;
      while(n>1){
         f = f * n;
         n = n -1;
      }
      return f;
   }



}
