package arrays2d;

public class MatriuIdentitat {

    public static void main(String[] args) {
        int d = 8;
        imprimir(matriuIdentitat(d));
    }

    public static int[][] matriuIdentitat(int n){
        int[][] m = new int[n][n];
        for(int i=0; i<m.length; i++){
            m[i][i] = 1;
        }
        return m;
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
