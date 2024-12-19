package arrays2d;

public class QuinsValorsEntreArray2D {

    public static void main(String[] args) {
        int[][] m = {{2, 7, 12}, {1, 5, 24}};
        imprimirValorsEntre(m, 0, 5);
    }

    public static void imprimirValorsEntre(int[][] m, int a, int b){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j]>=a && m[i][j]<=b){
                    System.out.printf("%d\t", m[i][j]);
                }
            }
        }
    }
}
