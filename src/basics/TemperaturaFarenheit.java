package basics;

import java.util.Scanner;

class TemperaturaFarenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        float tempC = input.nextFloat();

        float tempF = 9.0f/5.0f * tempC + 32;

        System.out.println("Temperature in Farenheit: "+tempF);
    }
}