package arrays;

public class Array2D {

    public static char[][] tauler1 = {{'A', 'B', 'C', 'X'},
                                     {'D', 'E', 'F', 'Y'},
                                     {'G', 'H', 'I', 'Z'}
                                    };
    public static char[][] tauler2 = {{'A', 'B'},
                                      {'D', 'E'}
                                    };

    public static void main(String[] args){
        printArray2D(tauler1);
        System.out.println();
        printArray2D(tauler2);
    }

    public static void printArray2D(char[][] t){
        for(int f=0; f<t.length; f++){
            for(int c=0; c<t[0].length; c++){
                System.out.printf("%c \t", t[f][c]);
            }
            System.out.println();
        }
    }

    public static void printArray2DCols(char[][] t){

    }
}
