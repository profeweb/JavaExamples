package conversions;

import java.util.Scanner;

public class Binari2DecimalString {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        convertToDecimal(input.next());

    }

    public static void convertToDecimal(String BIN)  {

        long DEC=0;

        for (int I=0; I<BIN.length(); I++){

            long binL = Character.getNumericValue(BIN.charAt(I));

            DEC = (long) (DEC + binL*Math.pow(2,BIN.length()-1-I));

        }System.out.print(DEC);

    }
}
