package arrays2d;

public class ValorsEntreArray2D {

    public static void main(String[] args) {

        float[][] numeros = {
                { 2, 18, 9, 1, 20 },
                { 1, 6, 12, 25, 4 },
                { 27, 3, 33, 15, 7 },
        };

        int num1= quantsNumerosEntre(numeros, 1, 10);
        System.out.printf(" Entre 1 i 10 hi ha %d números. \n", num1);

        int num2= quantsNumerosEntre(numeros, 10, 30);
        System.out.printf(" Entre 10 i 30 hi ha %d números. \n", num2);
    }

    public static int quantsNumerosEntre(float[][] dades, int minVal, int maxVal){
        int n=0;
        for(int i=0; i<dades.length; i++){
            for(int j=0; j<dades[i].length; j++){
                if(dades[i][j]>=minVal && dades[i][j]<=maxVal){
                    n++;
                }
            }
        }
        return n;
    }
}
