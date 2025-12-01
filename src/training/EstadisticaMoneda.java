package training;

public class EstadisticaMoneda {

    public static void main(String[] args) {

        // Número de tirades
        int numTirades = 1000000;

        // Array per comptabilitzar les cares
        float [] cares = new float[2];

        // Fer les tirades i comptabilitzar les ocurrències
        for(int i=0; i<numTirades; i++){
            int d = tirarMoneda();
            cares[d]++;
        }

        // Calcular les probabilitats
        for(int i=0; i<cares.length; i++){
            cares[i] /= numTirades;
        }

        // Mostrar resultats
        System.out.printf("Probabilitat d'una cara és %f.%n", cares[0]);
        System.out.printf("Probabilitat d'una creu és %f.%n", cares[1]);
        System.out.printf("Total: %f.", cares[0]+cares[1]);

    }

    public static int tirarMoneda(){
        return (int) Math.floor(Math.random()*2);
    }
}
