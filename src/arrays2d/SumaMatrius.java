package arrays2d;

public class SumaMatrius {

    public static void main(String[] args) {

        int[][] matriuA = {{2 , 3, 4}, {1,  0, 5}};
        int[][] matriuB = {{4 , 0, 1}, {3,  2, 0}};

        int[][] matriuS = sumaMatrius(matriuA, matriuB);
        imprimir(matriuS);
    }

    public static int[][] sumaMatrius(int[][] a, int[][] b){
        int[][] s = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        return s;
    }

    public static void imprimir(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
