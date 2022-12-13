package arrays;

public class MatriuIdentitat {

    public static int[][] a = { {4, 2, 8, 5}, {5, 1, 0, 0}, {2, 2, 4, 1}};

    public static void main(String[] args){

        System.out.println();

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
