package arrays2d;

public class EstadistiquesMatriu {

    public static void main(String[] args) {
        int[][] dades = {
                {2, 6, 9, 1},
                {7, 3, 12, 8},
                {5, 6, 2, 0},
        };

        System.out.printf("Estadístiques 1 (Min / Max / Avg): \n");
        printArray(estadistiques(dades));

        System.out.printf("\nEstadístiques 2 (Min / Max / Avg): \n");
        printArray(estadistiques2(dades));
    }

    public static void printArray(float[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%f\t", array[i]);
        }
    }


    // Enfocament 1: funcions per separat (no eficient).

    public static float[] estadistiques(int[][] m){
        float[] e = new float[3];
        e[0] = minimMatriu(m);
        e[1] = maximMatriu(m);
        e[2] = mitjanaMatriu(m);
        return e;
    }

    public static int minimMatriu(int[][] m){
        int minim = m[0][0];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j]<minim){
                    minim = m[i][j];
                }
            }
        }
        return minim;
    }

    public static int maximMatriu(int[][] m){
        int maxim = m[0][0];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j]>maxim){
                    maxim = m[i][j];
                }
            }
        }
        return maxim;
    }

    public static float mitjanaMatriu(int[][] m){
        int num = m.length * m[0].length;
        float suma = 0f;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                suma += m[i][j];
            }
        }
        return suma / num;
    }

    // Enfocament 2: una única funció (eficient).

    public static float[] estadistiques2(int[][] m){

        int minim = m[0][0];
        int maxim = m[0][0];
        float suma = 0;
        int num = m.length * m[0].length;

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j]<minim){
                    minim = m[i][j];
                }
                if(m[i][j]>maxim){
                    maxim = m[i][j];
                }
                suma += m[i][j];
            }
        }

        float[] e = new float[3];
        e[0] = minim;
        e[1] = maxim;
        e[2] = suma / num;
        return e;
    }
}
