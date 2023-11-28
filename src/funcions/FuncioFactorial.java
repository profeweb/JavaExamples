package funcions;

import java.util.Scanner;

public class FuncioFactorial {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N:");
        int n = input.nextInt();

        System.out.printf("El factorial de %d és %d.\n", n, factorial(n));
    }
    public static int factorial(int n){
        int f = n;
        int v = n - 1;
        while(v>1){
            f*=v;
            v--;
        }
        return f;
    }

}
