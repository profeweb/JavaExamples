package arrays;

public class ProducteEscalarArray2D {

    public static int[][] a = { {4, 2, 8, 5}, {5, 1, 0, 0}, {2, 2, 4, 1}};

    public static void main(String[] args){
        printArray2DFiles(escalarArray2D(a, 2));
        System.out.println();
        printArray2DFiles(escalarArray2D(a, 3));
    }

    public static int[][] escalarArray2D(int[][] t, int k){
        int[][] producte = new int[t.length][t[0].length];
        for(int f=0; f<t.length; f++) {
            for (int c = 0; c < t[0].length; c++) {
                producte[f][c] = k * t[f][c];
            }
        }
        return producte;
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
