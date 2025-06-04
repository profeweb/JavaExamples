package xarxes;

// https://www.ascii-code.com/
// Caràcters de 'A' a 'Z': 65 a 90  (26 símbols)
// Caràcters de 'a' a 'z': 97 a 122 (26 símbols)

public class CodiCesarASCII {

    public static void main(String[] args) {

        // Codi ASCII (int) a partir de caràcter (char)
        char c1 = 'A';
        int asciiCode = c1;
        System.out.printf("El codi ASCII de %c és %d.\n", c1, asciiCode);

        // Caràcter (char) a partir de codi ASCII (int)
        asciiCode = 80;
        char c2 = (char) asciiCode;
        System.out.printf("El caràcter del codi ASCII %d és %c.\n", asciiCode, c2);

        // Detecció de Lletra de l'alfabet
        System.out.printf("El caràcter %c és lletra: %b.\n", c2, Character.isLetter(c2));

        // Detecció de Majúscula
        System.out.printf("El caràcter %c és majúscula: %b.\n", c2, Character.isUpperCase(c2));
    }

    public static char xifrar(char c, int shift){
        if(Character.isLetter(c) && Character.isUpperCase(c)){
            int asciiCode = c;
            int shiftCode = asciiCode + shift;
            if(shiftCode>=65 && shiftCode<=90){
                return (char) shiftCode;
            }
            else if(shiftCode>90){
                shiftCode = 65 + (shiftCode % 26);
                return (char) shiftCode;
            }
            else {
                shiftCode = shiftCode + 91;
                return (char) shiftCode;
            }
        }
        else if(Character.isLetter(c) && !Character.isUpperCase(c)) {
            int asciiCode = c;
            int shiftCode = asciiCode + shift;
            if(shiftCode>=97 && shiftCode<=122){
                return (char) shiftCode;
            }
            else if(shiftCode>122){
                shiftCode = 97 + (shiftCode % 26);
                return (char) shiftCode;
            }
            else {
                shiftCode = shiftCode + 123;
                return (char) shiftCode;
            }
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
}
