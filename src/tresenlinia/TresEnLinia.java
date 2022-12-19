package tresenlinia;
import java.util.Scanner;

public class TresEnLinia {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        initTauler();
        printTauler();
        do {
            int[] t = demanaTirada(input);
            tauler[t[0]][t[1]] = VALOR.X;
            printTauler();
        }while(!hihaGuanyador());
    }

    public static int[] demanaTirada(Scanner input){
        int[] tirada = new int[2];
        System.out.print("Fila: ");
        tirada[0] = input.nextInt();
        System.out.print("Columna: ");
        tirada[1] = input.nextInt();
        return tirada;
    }

    public enum VALOR {BUIDA, X, O};
    public static VALOR[][] tauler;

    public static void initTauler(){
        tauler = new VALOR[3][3];
        for(int f=0; f<tauler.length; f++){
            for(int c=0; c<tauler[0].length; c++) {
                tauler[f][c] = VALOR.BUIDA;
            }
        }
    }

    public static void printTauler(){
        for(int f=0; f<tauler.length; f++){
            System.out.printf("%d:\t", f);
            for(int c=0; c<tauler[0].length; c++) {
                if(tauler[f][c]==VALOR.BUIDA) {
                    System.out.printf("_\t");
                }
                else {
                    System.out.printf("%s\t", tauler[f][c]);
                }
            }
            System.out.println();
        }
    }

    public static boolean hihaGuanyador(){

        for(int f=0; f<tauler.length; f++){
            if(filaIguals(f)== true){
                return true;
            }
        }

        for(int c=0; c<tauler[0].length; c++){
            if(columnaIguals(c)== true){
                return true;
            }
        }

        return diagAscIguals() || diagDescIguals();
    }

    public static boolean filaIguals(int f){
        return (tauler[f][0]==tauler[f][1] &&
                tauler[f][1]==tauler[f][2]&&
                tauler[f][0]!=VALOR.BUIDA);
    }

    public static boolean columnaIguals(int c){
        return (tauler[0][c]==tauler[1][c] &&
                tauler[1][c]==tauler[2][c]&&
                tauler[0][c]!=VALOR.BUIDA);
    }

    public static boolean diagAscIguals(){
        return (tauler[2][0]==tauler[1][1] &&
                tauler[1][1]==tauler[0][2]&&
                tauler[1][1]!=VALOR.BUIDA);
    }

    public static boolean diagDescIguals(){
        return (tauler[0][0]==tauler[1][1] &&
                tauler[1][1]==tauler[2][2]&&
                tauler[1][1]!=VALOR.BUIDA);
    }
}
