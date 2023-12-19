package trenenliniatopdown;

import java.util.Scanner;

public class TresEnLiniaW {

    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    public enum RESULTAT {ENJOC, EMPAT, GUANYADOR_A, GUANYADOR_B};
    public static RESULTAT resultat;

    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;
    public static int numTirades;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        inicialitzaPartida();
        mostraTauler(tauler);
        while(!partidaAcabada()){
            ferTirada(input, torn, tauler);
            mostraTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviaTorn(torn);
        }
        mostrarResultat(resultat);
    }

    public static void inicialitzaPartida(){
        tauler = new VALOR[3][3];
        for(int f=0; f<tauler.length; f++){
            for(int c=0; c<tauler[f].length; c++){
                tauler[f][c] = VALOR.BUIDA;
            }
        }

        torn = TORN.JUGADOR_A;
        resultat = RESULTAT.ENJOC;
    }

    public static void mostraTauler(VALOR[][] t){
        for(int f=0; f<tauler.length; f++){
            for(int c=0; c<tauler[f].length; c++){
                System.out.print("|");
                switch(t[f][c]){
                    case BUIDA : System.out.print(" "); break;
                    case CERCLE: System.out.print("O"); break;
                    case CREU: System.out.print("X"); break;
                }
            }
            System.out.println("|");
        }
    }

    public static boolean partidaAcabada(){
        return resultat != RESULTAT.ENJOC;
    }
    public static void ferTirada(Scanner input, TORN t, VALOR[][] tauler){

        System.out.println("RESULTAT: "+resultat);
        System.out.println("TORN: "+ torn);
        int fila, col;

        do {
            System.out.print("Fila: ");
            fila = input.nextInt();

            System.out.print("Columna: ");
            col = input.nextInt();

        } while(!(fila>=0 && fila<3 && col>=0 && col<3 && tauler[fila][col]==VALOR.BUIDA));

        tauler[fila][col] = (torn == TORN.JUGADOR_A) ? VALOR.CERCLE : VALOR.CREU;

    }
    public static RESULTAT comprovaResultat(VALOR[][] t){ return RESULTAT.ENJOC;}

    public static TORN canviaTorn(TORN t){
        return (t == TORN.JUGADOR_A) ? TORN.JUGADOR_B : TORN.JUGADOR_A;
    }
    public static void mostrarResultat(RESULTAT r){
        if(resultat == RESULTAT.EMPAT){
            System.out.println("La partida ha acabat en empat!");
        }
        else if(resultat == RESULTAT.GUANYADOR_A){
            System.out.println("El guanyador/a és A!");
        }
        else if(resultat == RESULTAT.GUANYADOR_B){
            System.out.println("El guanyador/a és B!");
        }
    }
}
