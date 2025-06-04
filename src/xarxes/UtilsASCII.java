package xarxes;

public class UtilsASCII {

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

}
