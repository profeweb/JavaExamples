package strings;

public class ProvaSubstring01 {

    public static void main(String[] args) {

        String nomComplet = "Paco Perez Lopez";

        // Obtenir les posicions dels caràcters en blanc.
        int pos1 = nomComplet.indexOf(" ");
        int pos2 = nomComplet.lastIndexOf(" ");

        // Obtenir els substrings corresponents a nom i llinatges
        String nom = nomComplet.substring(0, pos1);
        String llinatge1 = nomComplet.substring(pos1+1, pos2);
        String llinatge2 = nomComplet.substring(pos2+1);

        System.out.printf("%s, %s, %s", nom, llinatge1, llinatge2);
    }
}
