package basics;

import java.util.Scanner;

class TemperaturaCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT TEMPF
        System.out.print("Enter Temperature in Farenheit: ");
        float tempF = input.nextFloat();

        // TEMPC = 5.0/9.0 x (TEMPF - 32 )
        float tempC = 5.0f/9.0f * (tempF - 32 );

        // OUTPUT TEMPC
        System.out.println("Temperature in Celsius: "+tempC);
    }
}