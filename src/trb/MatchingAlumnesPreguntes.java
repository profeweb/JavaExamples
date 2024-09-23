package trb;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.random;

public class MatchingAlumnesPreguntes {

    public static String[] nomsAlumnes = {
            "AMORÓS BASSA, LLUCIA" ,
                    "ARTERO MERINO, ALEIX" ,
                    "BAISSA , KHADIJA" ,
                    "BONET MAESTRE, AINA" ,
                    "CALAFELL BAUZA, AINA MARIA" ,
                    "EL MESSAOUDI EL MOURABIT, BILAL" ,
                    "FERRANDO SOLER, ARNEL NONO" ,
                    "FONS GALMES, MARIA DEL MAR" ,
                    "FUSTER PLANAS, LOURDES" ,
                    "GALMES CATALA, MIQUEL" ,
                    "HERRA FERNÁNDEZ, WILLIE MANUEL" ,
                    "BAUÇÀ MORLÀ, RAFEL"
    };

    static int numMaximPreguntes = 627;
    static int numPreguntes = 10;

    public static void main(String[] args) {

        for(int i = 0; i< nomsAlumnes.length; i++){

            ArrayList<Integer> numerosAlumne = new ArrayList<>();
            int n = 0;
            while(n<numPreguntes){
                int nr = (int) ( 1 + random()*numMaximPreguntes);
                if(!numerosAlumne.contains(nr)) {
                    numerosAlumne.add(nr);
                    n++;
                }
            }
            Collections.sort(numerosAlumne);

            System.out.print("ALUMNE/A: " + nomsAlumnes[i] +", PREGUNTES: ");
            for(int np=0; np<numPreguntes; np++){
                System.out.print(numerosAlumne.get(np)+", ");
            }
            System.out.println();
        }

    }
}
