package arrays2d;

public class ProducteEscalar {

    public static void main(String[] args) {

        int[][] matriuA = {{2, 4, 5}, {1, 7, 3}, {0, 5, 1}};

        int[][] mp = producteEscalar(3, matriuA);

        imprimir(mp);

    }

    public static int[][] producteEscalar(int k, int[][] m){
        int[][] p = new int[m.length][m[0].length];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                p[i][j] = k * m[i][j];
            }
        }
        return p;
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
