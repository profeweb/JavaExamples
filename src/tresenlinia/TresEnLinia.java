package tresenlinia;
import java.util.Scanner;

public class TresEnLinia {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        initTauler();
        printTauler();
        int[] t = demanaTirada(input);
        tauler[t[0]][t[1]]=VALOR.X;
        printTauler();
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
}
