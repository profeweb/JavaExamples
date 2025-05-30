package xarxes;

public class CodiCesar {

    public static final char[] ALPHABET26 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char xifrar(char c, int shift){

        int pos = -1;
        for(int i=0; i< ALPHABET26.length; i++){
            if(ALPHABET26[i]==c){
                pos = i;
            }
        }
        if(pos>=0) {
            int shiftPos = (pos + shift);
            if (shiftPos >= ALPHABET26.length){
                shiftPos = shiftPos % ALPHABET26.length;
            }
            else if(shiftPos>=0 && shiftPos< ALPHABET26.length) {
                shiftPos = shiftPos;
            }
            else if(shiftPos<0){
                shiftPos = ALPHABET26.length + shiftPos;
            }
            return ALPHABET26[shiftPos];
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

    public static void main(String[] args) {

        String original = "HOLA QUE TAL CESAR!";
        System.out.println("Missatge Original: "+ original);

        String xifrat = xifrar(original, 5);
        System.out.println("Missatge Xifrat: "+ xifrat);
    }
}
