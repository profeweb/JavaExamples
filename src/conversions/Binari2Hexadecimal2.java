package conversions;
import java.util.Scanner;

public class Binari2Hexadecimal2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Demanam el número binari a convertir (long perquè pot ser molt llarg)
        System.out.print("Enter Binary number: ");
        long nb = input.nextLong();

        // Inicialitzam el resultat a l'String buit
        String sh = "";

        while(nb!=0){

            // Agafam un tros de 4 bits (o menys!) des de la dreta
            int r = (int)(nb % 10000);
            System.out.println(r);

            // Convertim aquest número al seu equivalent dígit hexadecimal
            String dh = digitToHexaString(binari2decimal(r));

            // Afegim aquest dígit hexadecimal a l'esquerra del número resultant
            sh = dh + sh;

            // Llevam el tros de 4 bits ja processat
            nb = nb / 10000;
        }

        // Sortida del resultat
        System.out.printf("Binary number %d is hexdecimal number %s.", nb, sh);
    }

    // Converteix un número binari a decimal
    public static int binari2decimal(int nb){
        int nd = 0;
        int pot = 1;

        while(nb!=0){
            int r = nb % 10;
            nb = nb / 10;
            nd = r*pot + nd;
            pot = 2 * pot;
        }
        return nd;
    }

    // Converteix un número decimal (0-15) al seu dígit hexadecimal corresponent (0-9,A-F)
    public static String digitToHexaString(int n){
        if(n<10){
            return String.valueOf(n);
        }
        else if(n==10){
            return "A";
        }
        else if(n==11){
            return "B";
        }
        else if(n==12){
            return "C";
        }
        else if(n==13){
            return "D";
        }
        else if(n==14){
            return "E";
        }
        else {
            return "F";
        }
    }


}
