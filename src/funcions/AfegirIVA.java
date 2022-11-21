package funcions;

import java.util.Scanner;

public class AfegirIVA {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Preu:");
        float preu = input.nextFloat();

        System.out.print("IVA:");
        float iva = input.nextFloat();

        float preuFinal = afegirIVA(preu, iva);
        System.out.printf("El preu %f amb IVA del %f és %f.", preu, iva, preuFinal);
    }

    public static float afegirIVA(float preu, float iva){
        return preu*(1 + iva/100);
    }
}
