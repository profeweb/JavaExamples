package arrays;

public class Bidimensionals {

    public static void main(String[] args) {

        int[][] num1 = {
                { 4, 9, 7, 1},
                { 3, 2, 5, 4},
                { 0, 1, 8, 3},
                { 7, 6, 9, 1},
        };

        int[][] num2 = {
                { 0, 3, 6, 2},
                { 1, 1, 0, 5},
                { 2, 9, 4, 7},
                { 3, 7, 4, 8},
        };

        int[][] p = producteEscalar(3, num1);
        printArray(p);

        boolean b = iguals(num1, num1);
        System.out.printf("Són iguals les matrius? %b. ", b);
    }

    public static void printArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.printf("%d \t", array[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] sumaMatrius(int[][] a, int[][] b){
        int[][] s = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        return s;
    }

    public static int[][] producteEscalar(int k, int[][] a){
        int[][] p = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                p[i][j] = k * a[i][j] ;
            }
        }
        return p;
    }

    public static boolean iguals(int[][] a, int[][] b){
        if(a.length != b.length || a[0].length != b[0].length){
            return false;
        }
        else {
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    if(a[i][j] != b[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static int[][] matriuIdentitat(int n){
        int[][] m = new int[n][n];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++) {

                m[i][j] = (i==j)? 1 : 0;
            }
        }
        return m;
    }
}
