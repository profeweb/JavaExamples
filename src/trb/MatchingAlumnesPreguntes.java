package trb;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.random;

public class MatchingAlumnesPreguntes {

    public static String[] nomsAlumnes = {
            "Aarab Jarrab, Wasim" ,
            "Amorós Bassa, Llucia" ,
            "Artero Merino, Aleix" ,
            "Baissa el Wafi, Khadija" ,
            "Bonet Maestre, Aina" ,
            "Fons Galmés, Maria del Mar" ,
            "Fuster Planas, Lourdes" ,
            "Hamza, Nuri Abbas" ,
            "Monzó Loaisa, Arnau" ,
            "Morlà Mas, Joan" ,
            "Oliver Martorell, Mateu" ,
            "Oliver Sansó, Miquel" ,
            "Ramis Barceló, Nadal" ,
            "Ramón Mayordomo, Sebastià"
    };

    static int numMaximPreguntes = 627;
    static int numPreguntes = 10;

    public static void main(String[] args) {

        for(int i = 0; i< nomsAlumnes.length; i++){

            ArrayList<Integer> numerosAlumne = new ArrayList<>();
            int n = 0;
            while(n<numPreguntes){
                int nr = (int) (random()*numMaximPreguntes);
                if(!numerosAlumne.contains(nr)) {
                    numerosAlumne.add(nr);
                    n++;
                }
            }
            Collections.sort(numerosAlumne);

            System.out.print("ALUMNE/A: " + nomsAlumnes[i] +", PREGUNTES: ");
            for(int np=0; np<numPreguntes; np++){
                System.out.print(numerosAlumne.get(np)+"\t");
            }
            System.out.println();
        }

    }
}
