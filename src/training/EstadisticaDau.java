package training;

public class EstadisticaDau {

    public static void main(String[] args) {

        // Número de tirades
        float numTirades = 1000000;

        // Array per comptabilitzar les cares
        int [] cares = new int[6];

        // Fer les tirades i comptabilitzar els resultats
        for(int i=0; i<numTirades; i++){
            int d = tirarDau();
            cares[d-1]++;
        }

        // Mostrar resultats
        for(int i=0; i<cares.length; i++){
            System.out.printf("Probabilitat d'un %d és %f.%n", i+1, cares[i]/numTirades);
        }
    }

    public static int tirarDau(){
        return (int) Math.floor(1 + Math.random()*6);
    }
}
