package basics;

public class ImprimirPrintF {

    public static void main(String[] args){
        String nom = "Paco", llinatge="Perez";
        int edat = 33;
        boolean estudiant = true;
        char grup = 'A';
        float pes = 77.3f;

        enum Sexe {HOME, DONA, ALTRE}
        Sexe sexe = Sexe.HOME;

        System.out.printf("Nom: %s,%n edat: %d,%n pes: %f,%n grup: %c.%n Sexe: %s.%n Estudiant:%b.",
                nom, edat, pes, grup, sexe, estudiant);
    }
}
