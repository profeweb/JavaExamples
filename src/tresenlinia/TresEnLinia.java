package tresenlinia;
import java.util.Scanner;

public class TresEnLinia {

    public static int numTirades =0;
    public enum VALOR {X, O, BUIDA};
    public static VALOR[][] tauler;
    public static String[] jugadors;
    public static int numJugadors = 2;
    public static int N = 5;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        demanaJugadors(input);
        do {
            initTauler();
            printTauler();
            do {
                jugar(input);
            } while (!hihaGuanyador() && numTirades < N*N);
            printResultat();
        } while(continuar(input));
    }

    public static void jugar(Scanner input){
        int[] t = demanaTirada(input);
        tauler[t[0]][t[1]] = (numTirades % 2 == 0) ? VALOR.X : VALOR.O;
        printTauler();
        numTirades++;
    }

    public static void demanaJugadors(Scanner input){
        jugadors = new String[numJugadors];
        for(int j=0; j<numJugadors; j++){
            System.out.printf("Nom del Jugador %d:", j);
            jugadors[j] = input.next();
        }
    }

    public static boolean continuar(Scanner input){
        System.out.print("Vols continuar? (S/N): ");
        char c = input.next().charAt(0);
        return (c=='S') || (c=='s');
    }

    public static void printResultat(){
        if(hihaGuanyador()){
            int jugador = (numTirades-1)%2;
            System.out.printf("Guanya %s!!!\n", jugadors[jugador]);
        }
        else {
            System.out.println("EMPAT!!!!! :)");
        }
    }

    public static void initTauler(){
        tauler = new VALOR[N][N];
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
            tirada[0] = demanaNumero(input, "Fila:", 0, N-1);
            tirada[1] = demanaNumero(input, "Columna:", 0, N-1);
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
        boolean b = true;
        for(int c=0; c<tauler[0].length-1; c++){
            b = b && (tauler[f][c] == tauler[f][c+1]);
        }
        return (b && tauler[f][0]!=VALOR.BUIDA);
    }

    public static boolean columnaIguals(int c){
        boolean b = true;
        for(int f=0; f<tauler.length-1; f++){
            b = b && (tauler[f][c]==tauler[f+1][c]);
        }
        return b && (tauler[0][c]!=VALOR.BUIDA);
    }

    public static boolean diagAscIguals(){
        boolean b = true;
        int nc = tauler.length-1;
        for(int d=0; d<nc; d++){
            b = b && (tauler[nc-d][d]==tauler[nc-d-1][d+1]);
        }
        return b && (tauler[nc][0]!=VALOR.BUIDA);
    }

    public static boolean diagDescIguals(){
        boolean b = true;
        for(int d=0; d<tauler.length-1; d++) {
            b = b && (tauler[d][d] == tauler[d+1][d+1]);
        }
        return b && (tauler[0][0]!=VALOR.BUIDA);
    }
}
