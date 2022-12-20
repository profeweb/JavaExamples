package tresenlinia;
import java.util.Scanner;

public class TresEnLinia {

    public static int numTirades =0;
    public enum VALOR {X, O, BUIDA};
    public static VALOR[][] tauler;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        do {
            initTauler();
            printTauler();
            do {
                int[] t = demanaTirada(input);
                tauler[t[0]][t[1]] = (numTirades % 2 == 0) ? VALOR.X : VALOR.O;
                printTauler();
                numTirades++;
            } while (!hihaGuanyador() && numTirades < 9);
            printResultat();
        } while(continuar(input));
    }

    public static boolean continuar(Scanner input){
        System.out.print("Vols continuar? (S/N): ");
        char c = input.next().charAt(0);
        return (c=='S') || (c=='s');
    }

    public static void printResultat(){
        if(hihaGuanyador()){
            int jugador = (numTirades-1)%2;
            System.out.printf("Guanya %s", VALOR.values()[jugador]);
        }
        else {
            System.out.println("EMPAT!!!!! :)");
        }
    }

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

    public static int[] demanaTirada(Scanner input){
        int[] tirada = new int[2];
        do {
            tirada[0] = demanaNumero(input, "Fila:", 0, 2);
            tirada[1] = demanaNumero(input, "Columna:", 0, 2);
        }while(tauler[tirada[0]][tirada[1]]!=VALOR.BUIDA);
        return tirada;
    }

    public static int demanaNumero(Scanner input, String txt, int min, int max){
        int n;
        do {
            System.out.print(txt);
            n = input.nextInt();
        }while(!(n>=min && n<=max));
        return n;
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
