package basics;

public class ImprimirPrintF {

    public static void main(String[] args){
        String nom = "Paco", llinatge="Perez";
        int edat = 33;
        boolean estudiant = true;
        char grup = 'A';
        float pes = 77.3f;

        System.out.printf("Nom: %s,%n edat: %d,%n grup: %c.%n", nom, edat, grup);
    }
}
