package arrays2d;

public class MaximMinimMitjaArray2D {

    public static void main(String[] args) {

        float[][] numeros = {
                { 2, 18, 9, 1, 20 },
                { 1, 6, 12, 25, 4 },
                { 27, 3, 33, 15, 7 },
        };

        float[] e = calculaEstadistiques(numeros);

        System.out.printf(" El mínim valor és %f.", e[0]);
        System.out.printf(" El màxim valor és %f.", e[1]);
        System.out.printf(" La mitja és %f.", e[2]);


    }

    public static float[] calculaEstadistiques(float[][] dades){

        float[] estadistiques = new float[3];

        float maxValue = dades[0][0];
        float minValue = dades[0][0];
        float sumValue = 0;

        for(int i=0; i<dades.length; i++){
            for(int j=0; j<dades[i].length; j++){

                sumValue += dades[i][j];

                if(dades[i][j]>maxValue){
                    maxValue = dades[i][j];
                }

                if(dades[i][j]<minValue){
                    minValue = dades[i][j];
                }
            }
        }

        estadistiques[0] = minValue;
        estadistiques[1] = maxValue;
        estadistiques[2] = sumValue / (dades.length * dades[0].length);

        return estadistiques;
    }
}
