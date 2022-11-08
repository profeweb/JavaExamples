package basics;

public class ImprimirInfo {

    public static void main(String[] args) {

        String nom = "Paco";
        int edat = 33;
        float altura = 1.82f;
        char grup ='A';

        enum Sexe {HOME, DONA, ALTRE}
        Sexe sexe = Sexe.HOME;

        System.out.println("NOM: "+nom);
        System.out.println("EDAT: "+edat);
        System.out.println("ALTURA: "+altura);
        System.out.println("GRUP: "+grup);
        System.out.println("SEXE: "+sexe);
    }
}
