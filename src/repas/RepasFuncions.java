package repas;

import java.util.Scanner;

public class RepasFuncions {

    public static void main(String[] args) {

        int maxNumeros = maxim10numeros();
        System.out.println("Màxim de 10 números: "+ maxNumeros);

        int sumaNumeros = suma10numeros();
        System.out.println("Suma de 10 números: "+ sumaNumeros);

        int numParells = quantsParells();
        System.out.println("Núm de Parells: "+ numParells);

        int quantsInterval = quantsDinsInterval(3, 7);
        System.out.println("Quants dins interval [3, 7]: "+ quantsInterval);

        int quantsPrimers = quantsPrimers();
        System.out.println("Quants primers: "+ quantsPrimers);

    }


    public static int maxim10numeros(){
        Scanner input = new Scanner(System.in);
        int maxNumero = Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            System.out.print("Enter number: ");
            int n = input.nextInt();
            if(n>maxNumero){
                maxNumero = n;
            }
        }
        return maxNumero;
    }

    public static int suma10numeros(){
        Scanner input = new Scanner(System.in);
        int suma = 0;
        for(int i=0; i<10; i++){
            System.out.print("Enter number: ");
            int n = input.nextInt();
            suma = suma + n;
        }
        return suma;
    }

    public static int quantsParells(){
        Scanner input = new Scanner(System.in);
        int quants = 0;
        for(int i=0; i<10; i++){
            System.out.print("Enter number: ");
            int n = input.nextInt();
            if(n%2 == 0){
                quants++;
            }
        }
        return quants;
    }

    public static int quantsDinsInterval(int minVal, int maxVal){
        Scanner input = new Scanner(System.in);
        int quants = 0;
        for(int i=0; i<10; i++){
            System.out.print("Enter number: ");
            int n = input.nextInt();
            if(n >= minVal && n <= maxVal){
                quants++;
            }
        }
        return quants;
    }

    public static int quantsPrimers(){
        Scanner input = new Scanner(System.in);
        int quants = 0;
        for(int i=0; i<10; i++){
            System.out.print("Enter number: ");
            int n = input.nextInt();
            if(esPrimer(n)){
                quants++;
            }
        }
        return quants;
    }

    public static boolean esPrimer(int n){
        int x = n -1;
        while (n%x!=0 && n>1){
            n--;
        }
        if(n==1){
            return true;
        }
        else {
            return false;
        }
    }



}
