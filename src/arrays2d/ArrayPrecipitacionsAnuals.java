package arrays2d;

public class ArrayPrecipitacionsAnuals {

    public static void main(String[] args) {

        // 12 mesos, 31 dies (simplificació).
        float[][] pluja = new float[12][31];

        // Emplenar l'array amb valors pseudo-aleatoris
        emplenaArray(pluja, 0, 100);

        // Calcular el total de pluges del mes de Febrer
        float plujaFebrer = sumaPrecipitacionsMes(pluja, 1);
        System.out.printf("Pluja Febrer: %f.", plujaFebrer);

    }

    public static void emplenaArray(float[][] array, float valorMinim, float valorMaxim){
        for(int f=0; f<array.length; f++){
            for(int c=0; c<array[f].length; c++){
                array[f][c] = (float)(valorMinim + ((valorMaxim - valorMinim) * Math.random()));
            }
        }
    }

    public static float sumaPrecipitacionsMes(float[][] array, int mes){
        float suma = 0;
        for(int dia=0; dia<array[mes].length; dia++){
            suma += array[mes][dia];
        }
        return suma;
    }
}
