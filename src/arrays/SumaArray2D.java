package arrays;

public class SumaArray2D {

    public static int[][] a = { {4, 2, 8, 5}, {5, 1, 0, 0}, {2, 2, 4, 1}};
    public static int[][] b = { {2, 7, 4, 0}, {0, 3, 8, 1}, {1, 5, 2, 0}};

    public static void main(String[] args){
        printArray2DFiles(sumaMatrius(a, b));
    }

    public static int[][] sumaMatrius(int[][] m1, int[][] m2){
        int[][] suma = new int[m1.length][m1[0].length];
        for(int f=0; f<suma.length; f++){
            for(int c=0; c<suma[0].length; c++) {
                suma[f][c] = m1[f][c] + m2[f][c];
            }
        }
        return suma;
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
