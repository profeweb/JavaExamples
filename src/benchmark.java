public class benchmark {


    public static int[] poblaciones = {10, 100, 1000, 100000, 1000000, 100000000};
    public static int[][] muestras;


    public static void main(String[] args) {

        generaMuestras(0, 100);
        printMuestra(muestras[0]);
    }

    public static void generaMuestras(int minValue, int maxValue){
        muestras = new int[poblaciones.length][];
        for(int p=0; p<poblaciones.length; p++){
            muestras[p] = new int[poblaciones[p]];
            for(int i=0; i<poblaciones[p]; i++){
                muestras[p][i] = minValue + (int)((maxValue - minValue) * Math.random());
            }
        }
    }

    public static void printMuestra(int[] muestra){
        for(int i=0; i<muestra.length; i++){
            System.out.print(muestra[i] + ((i<muestra.length-1) ? ", " : "\n"));
        }
    }
}
