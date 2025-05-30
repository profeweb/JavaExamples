package xarxes;

public class CodiCesar {

    public static final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char xifrar(char c, int shift){

        int pos = -1;
        for(int i = 0; i< ALPHABET.length; i++){
            if(ALPHABET[i]==c){
                pos = i;
            }
        }
        if(pos>=0) {
            int shiftPos = (pos + shift);
            if (shiftPos >= ALPHABET.length){
                shiftPos = shiftPos % ALPHABET.length;
            }
            else if(shiftPos>=0 && shiftPos< ALPHABET.length) {
                shiftPos = shiftPos;
            }
            else if(shiftPos<0){
                shiftPos = ALPHABET.length + shiftPos;
            }
            return ALPHABET[shiftPos];
        }
        else {
            return c;
        }

    }

    public static String xifrar(String original, int shift){
        String xifrat="";
        for(int i=0; i<original.length(); i++){
            xifrat += xifrar(original.charAt(i), shift);
        }
        return xifrat;
    }

    public static String desxifrar(String xifrat, int shift){
        return xifrar(xifrat, -shift);
    }

    public static void main(String[] args) {

        int shift = -5;
        String original = "HOLA QUE TAL CESAR!";
        System.out.println("Missatge Original: "+ original);

        String xifrat = xifrar(original, shift);
        System.out.println("Missatge Xifrat: "+ xifrat);

        String desxifrat = desxifrar(xifrat, shift);
        System.out.println("Missatge Desxifrat: "+ desxifrat);
    }
}
