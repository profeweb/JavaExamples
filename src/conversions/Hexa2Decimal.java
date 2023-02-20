package conversions;
import java.util.Scanner;

public class Hexa2Decimal {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hexadecimal number: ");
        String nh = input.next();

        int i = nh.length()-1;
        int nd = 0;
        int pot = 1;

        while(i>=0){
            char c = nh.charAt(i);
            int d = hexaDigitToDecimal(c);
            nd += d*pot;
            pot = 16 * pot;
            i--;
        }
        System.out.printf("Hexadecimal number %s is decimal number %d.", nh, nd);
    }

    public static int hexaDigitToDecimal(char c){
        switch(c){
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default: return Character.getNumericValue(c);
        }
    }
}
