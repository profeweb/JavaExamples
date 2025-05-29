package xarxes;

import java.util.Scanner;

public class BitParitat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 7 data bits: ");
        int num = input.nextInt();

        int bp = calculaBit(num, TIPUS.PAR);
        System.out.printf("Bit de Paridad Par de les Dades %d: %d.", num, bp);
    }

    public static enum TIPUS {PAR, IMPAR};

    public static int calculaBit(int data, TIPUS tipus){
        int numUns = 0;
        int num = data;
        while(num!=0){
            int digit = num % 10;
            num = num / 10;
            if(digit==1){
                numUns++;
            }
        }
        if(tipus == TIPUS.PAR){
            return numUns%2==0 ? 0 : 1;
        }
        else {
            return numUns%2==1 ? 0 : 1;
        }
    }


}
