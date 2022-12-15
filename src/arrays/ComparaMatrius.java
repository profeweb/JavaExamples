package arrays;

public class ComparaMatrius {

    public static int[][] a = { {0, 1, 2}, {9, 8, 7}};
    public static int[][] b = { {0, 1, 2}, {9, 8, 7}};
    public static int[][] c = { {0, 1, 2}, {9, 8, 7}, {3, 7, 2}};
    public static int[][] d = { {0, 1, 2}, {9, 8, 0}};

    public static void main(String[] args){
        System.out.printf("Son iguals A i B? %b.\n", compara(a, b));
        System.out.printf("Son iguals A i C? %b.\n", compara(a, c));
        System.out.printf("Son iguals A i D? %b.\n", compara(a, d));
    }

    public static boolean compara(int[][] m1, int[][] m2){
        // Comparam per dimensions
        if(m1.length!=m2.length || m1[0].length!=m2[0].length){
            return false;
        }
        // Comparam per contingut
        else {
            for (int f = 0; f < m1.length; f++) {
                for (int c = 0; c < m1[0].length; c++) {
                    if (m1[f][c] != m2[f][c]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

}
