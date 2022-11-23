package funcions;

import java.util.Scanner;

public class TemperaturaFarenheitFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Temp ºC: ");
        float t = input.nextFloat();

        System.out.printf("La temperatura %f ºC equival a %fºF.", t, convertTempF(t));

    }

    public static float convertTempF(float tempC){
        return 9.0f/5.0f * tempC + 32;
    }
}
