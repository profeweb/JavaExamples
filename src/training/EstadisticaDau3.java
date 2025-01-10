package training;

public class EstadisticaDau3 {

    public static void main(String[] args) {

        // Número de tirades de cada experiment
        int[] tirades = {100, 1000, 1000000};

        // Array per comptabilitzar les probalibilitats de les 6 cares en els 3 experiments
        float [][] cares = new float[3][6];

        // Per cada experiment
        for(int numExp=0; numExp<tirades.length; numExp++) {

            //Obtenir el número de tirades de l'experiment
            int numTirades = tirades[numExp];

            // Fer les tirades i comptabilitzar els resultats
            for (int i = 0; i < numTirades; i++) {
                int d = tirarDau();
                cares[numExp][d - 1]++;
            }

            // Dividir pel número de tirades
            for (int cara = 0; cara < cares[numExp].length; cara++) {
                cares[numExp][cara] /= numTirades;
            }

            // Mostrar resultats de l'experiment
            System.out.printf("Experiment amb %d tirades:\n", tirades[numExp]);
            float total = 0f;
            for (int cara = 0; cara < cares[numExp].length; cara++) {
                System.out.printf("\tProbabilitat d'un %d és %f.%n", cara + 1, cares[numExp][cara]);
                total += cares[numExp][cara];
            }

            System.out.printf("Total: %f.\n\n", total);
        }
    }

    public static int tirarDau(){
        return (int) Math.floor(1 + Math.random()*6);
    }
}
