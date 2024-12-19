package arrays2d;

public class Bidimensional {

    public static void main(String[] args) {

        char[][] meuArray = {
                {'A', 'B','C'},
                {'D', 'E','F'},
                {'G', 'H','I'},
        };

        // Recorregut per files
        System.out.printf("Recorregut per files: \n");
        for(int f=0; f<meuArray.length; f++){
            for(int c=0; c<meuArray[f].length; c++){
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }

        // Recorregut per columnes
        System.out.printf("Recorregut per columnes: \n");
        for(int c=0; c<meuArray[0].length; c++){
            for(int f=0; f<meuArray.length; f++){
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }

        // Recorregut Diagonal Descendent v1
        System.out.printf("Recorregut Diagonal Descendent: \n");
        for(int f=0; f<meuArray.length; f++){
            for(int c=0; c<meuArray[f].length; c++){
                if(f==c) {
                    System.out.printf("%c\t", meuArray[f][c]);
                }
            }
            System.out.printf("\n");
        }

        // Recorregut Diagonal Descendent v2
        System.out.printf("Recorregut Diagonal Descendent: \n");
        for(int f=0; f<meuArray.length; f++){
            System.out.printf("%c\t", meuArray[f][f]);
        }

        // Recorregut Diagonal Ascendent
        System.out.printf("Recorregut Diagonal Ascendent: \n");
        for(int f=2, c=0; f>=0 && c<meuArray.length; f--, c++){
            System.out.printf("%c\t", meuArray[f][c]);
        }
    }

    public static int[][] sumaMatrius(int[][] m1, int[][] m2){
        int[][] m = new int[m1.length][m1[0].length];
        for(int f=0; f<m1.length; f++){
            for(int c=0; c<m1[f].length; c++){
                m[f][c] = m1[f][c] + m2[f][c];
            }
        }
        return m;
    }


}
