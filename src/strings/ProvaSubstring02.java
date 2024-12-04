package strings;

import static java.lang.Math.min;

public class ProvaSubstring02 {

    public static void main(String[] args) {

        // Text complet
        String paragraf = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                          "Sed rutrum dui eros, sit amet malesuada elit ultrices vitae. " +
                          "Aliquam finibus ligula ac tincidunt auctor. Sed ornare massa quis tincidunt rutrum. " +
                          "Maecenas porttitor vehicula accumsan. Aenean egestas enim felis, non hendrerit vel.";

        int numParaula = 0;

        while(paragraf.indexOf(" ")!=-1 || paragraf.indexOf(",")!= -1 || paragraf.indexOf(".")!= -1){

            // Posicions dels següents separadors (' ', ',', '.').
            int posBlank = paragraf.indexOf(" ");
            int posComma = paragraf.indexOf(",");
            int posDot = paragraf.indexOf(".");

            // Posició del 1r
            int minPos = min(min(posBlank, posComma), posDot);

            // Agafar la 1a paraula
            String paraula="";
            if(minPos!=-1) {
                paraula = paragraf.substring(0, minPos);
            }
            // llevar la paraula al paràgraf.
            paragraf = paragraf.substring(minPos+1);

            // Imprmir la paraula, si no és buida (llargada > 0).
            if(paraula.length()>0) {
                System.out.printf("%d : %s\n", numParaula, paraula);
            }

            // Incrementar el número de paraules
            numParaula++;
        }

    }
}
