package arrays2d;

public class ComparaMatrius {

    public static void main(String[] args) {

        int[][] mA = {{2, 4, 6}, {1, 3, 7}};
        int[][] mB = {{2, 4, 6}, {1, 3, 0}};

        System.out.printf("Les matrius són iguals? %b", matriusIguals(mA, mB));
    }

    public static boolean matriusIguals(int[][] m1, int[][] m2){
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[i].length; j++){
                if(m1[i][j]!=m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
