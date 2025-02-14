package conversions;
import java.util.Scanner;

public class Binari2Hexadecimal {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Demanam el número binari a convertir (String perquè pot ser molt llarg)
        System.out.print("Enter Binary number: ");
        String sb = input.next();

        // Inicialitzam el resultat a l'String buit
        String sh = "";

        while(sb.length()!=0){

            // Agafam un tros de 4 bits (o menys!) des de la dreta
            int numDigitsTotal = sb.length();
            int numDigitsTros = Math.min(numDigitsTotal, 4);
            String bitsTros = sb.substring(sb.length()-numDigitsTros);

            // Convertim aquest número al seu equivalent dígit hexadecimal
            // [Binari (String --> Integer)] --> Decimal --> Hexadecimal
            int bits = Integer.valueOf(bitsTros);
            String dh = digitToHexaString(binari2decimal(bits));

            // Afegim aquest dígit hexadecimal a l'esquerra del número resultant
            sh = dh + sh;

            // Llevam el tros de 4 bits ja processat
            sb = sb.substring(0, sb.length()-numDigitsTros);
        }

        // Sortida del resultat
        System.out.printf("Binary number %s is hexadecimal number %s.", sb, sh);
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
