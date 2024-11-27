package funcions;

import java.util.Scanner;

public class TaulaMultiplicar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input del valor N
        System.out.print("Enter N: ");
        int num = input.nextInt();

        // Cridada a la funció
        taulaMultiplicar(num);
    }

    // Definició de la funció
    public static void taulaMultiplicar(int n){
        System.out.printf("Taula de Multiplicar del número %d. \n", n);
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d.\n", i, n, i*n);
        }
    }
}
