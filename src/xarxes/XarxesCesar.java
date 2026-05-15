package xarxes;

import java.util.Scanner;

public class XarxesCesar {

    public static final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char xifrar(char c, int shift){
        int pos = -1;
        for(int i=0; i< ALPHABET.length; i++){
            if(ALPHABET[i]==c){
                pos = i;
            }
        }
        if(pos>=0){
            int shiftPos = shift + pos;
            if(shiftPos >= ALPHABET.length){
                shiftPos = shiftPos % ALPHABET.length;
            }
            else if(shiftPos>=0 && shiftPos< ALPHABET.length){
                shiftPos = shiftPos;
            }
            else if(shiftPos<0){
                shiftPos = shiftPos + ALPHABET.length;
            }
            return ALPHABET[shiftPos];
        }
        else {
            return c;
        }
    }

    public static String xifrar(String original, int shift){
        String xifrat = "";
        for(int i=0; i<original.length(); i++){
            char c = original.charAt(i);
            xifrat += xifrar(c, shift);
        }
        return xifrat;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("MISSATGE ORIGINAL: ");
        String original = input.nextLine();

        System.out.println("SHIFT: ");
        int shift = input.nextInt();

        String xifrat = xifrar(original, shift);
        System.out.println("MISSATGE XIFRAT: " + xifrat);
    }

}
