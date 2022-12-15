package arrays;

public class MatriuIdentitat {

    public static int[][] a;

    public static void main(String[] args){
        printArray2DFiles(matriuIdentitat(5));
    }

    public static int[][] matriuIdentitat(int n){
        int[][] m = new int[n][n];
        for(int i=0; i<m.length; i++){
            m[i][i]=1;
        }
        return m;
    }


    public static void printArray2DFiles(int[][] t){
        for(int f=0; f<t.length; f++){
            for(int c=0; c<t[0].length; c++){
                System.out.printf("%d \t", t[f][c]);
            }
            System.out.println();
        }
    }

}
