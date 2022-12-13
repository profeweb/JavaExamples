package arrays;

public class Array2D {

    public static char[][] tauler = {{'A', 'B', 'C', 'X'},
                                     {'D', 'E', 'F', 'Y'},
                                     {'G', 'H', 'I', 'Z'}
                                    };

    public static void main(String[] args){
        System.out.println("Imprimir Array 2D per Files:");
        printArray2DFiles(tauler);
        System.out.println("\nImprimir Array 2D per Columnes:");
        printArray2DCols(tauler);
        System.out.println("\nImprimir Diagonal Asc. Array 2D:");
        printDiagAsc(tauler);
        System.out.println("\nImprimir Diagonal Desc. Array 2D:");
        printDiagDesc(tauler);
    }

    public static void printArray2DFiles(char[][] t){
        for(int f=0; f<t.length; f++){
            for(int c=0; c<t[0].length; c++){
                System.out.printf("%c \t", t[f][c]);
            }
            System.out.println();
        }
    }

    public static void printArray2DCols(char[][] t){
        for(int c=0; c<t[0].length; c++){
            for(int f=0; f<t.length; f++){
                System.out.printf("%c \t", t[f][c]);
            }
            System.out.println();
        }
    }

    public static void printDiagDesc(char[][] t){
        for(int d=0; d<t.length; d++){
            System.out.printf("%c \t", t[d][d]);
        }
    }

    public static void printDiagAsc(char[][] t){
        for(int f=t.length-1, c=0; f>=0 ; f--, c++){
            System.out.printf("%c \t", t[f][c]);
        }
    }
}
