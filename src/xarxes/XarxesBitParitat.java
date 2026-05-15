package xarxes;

import java.util.Scanner;

public class XarxesBitParitat {

    public static enum TIPUS {PAR, IMPAR};

    public static int calculaBit(int dades, TIPUS tipus){
        int numUns = 0;
        int num = dades;
        while(num !=0){
            int digit = num % 10;
            num = num / 10;
            if(digit == 1){ numUns++; }
        }
        if(tipus == TIPUS.PAR){
            return numUns%2==0 ? 0 : 1;
        }
        else {
            return numUns%2==1 ? 0 : 1;
        }
    }

    public static int calculaBit(String dades, TIPUS tipus){
        int numUns = 0;
        for(int i=0; i<dades.length(); i++){
            if(dades.charAt(i)=='1'){
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entra 7 bits de dades: ");
        String dades = input.next();
        int bp = calculaBit(dades, TIPUS.IMPAR);
        System.out.printf("Bit de paridad par de dades: %s és %d.", dades, bp);
    }
}
