package strings;

import static java.lang.Math.min;

public class ProvaSubtring03A {

    public static void main(String[] args) {

        // Text complet
        String paragraf = "Lorem ipsum dolor sit amet consectetur adipiscing elit";

        int numParaula = 0;

        while(paragraf.indexOf(" ")!=-1){

            // Posició del primer blanc.
            int posBlank = Math.max(paragraf.indexOf(" "), 0);

            // Agafar la 1a paraula
            String paraula = paragraf.substring(0, posBlank);

            // llevar la paraula al paràgraf.
            paragraf = paragraf.substring(posBlank+1);

            // Imprmir la paraula, si no és buida (llargada > 0).
            if(paraula.length()>0) {
                System.out.printf("%d : %s\n", numParaula, paraula);
            }

            // Incrementar el número de paraules
            numParaula++;
        }

        // Imprmir la darrera paraula, si no és buida (llargada > 0).
        if(paragraf.length()>0) {
            System.out.printf("%d : %s\n", numParaula, paragraf);
        }

    }
}
