package funcions;

import java.util.Scanner;

public class FuncioValorAbsolut {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N:");
        int n = input.nextInt();

        System.out.printf("El valor absolut de %d és %d.", n, absolut(n));
    }
    public static int absolut(int n){
        return (n>=0) ? n : -n;
    }

}
