package trenenliniatopdown;

import java.util.Scanner;

public class TresTemp {

    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    public enum RESULTAT {ENJOC, EMPAT, GUANYADOR_A, GUANYADOR_B};
    public static RESULTAT resultat;

    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;
    public static int numTirades;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        inicialitzaPartida(5);
        mostrarTauler(tauler);
        while(!partidaAcabada()){
            ferTirada(input, torn, tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviaTorn(torn);
        }
        mostrarResultat(resultat);
    }

    public static void inicialitzaPartida(int n){
        tauler = new VALOR[n][n];
        for(int i=0; i<tauler.length; i++){
            for(int j=0; j<tauler[i].length; j++){
                tauler[i][j] = VALOR.BUIDA;
            }
        }
        numTirades = 0;
        torn = TORN.JUGADOR_A;
        resultat = RESULTAT.ENJOC;
    }

    public static void mostrarTauler(VALOR[][] t){
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                System.out.print("|");
                switch(t[i][j]){
                    case BUIDA : System.out.print(" "); break;
                    case CREU : System.out.print("X"); break;
                    case CERCLE : System.out.print("O"); break;
                }
            }
            System.out.println("|");
        }
    }

    public static boolean partidaAcabada(){
        return resultat != RESULTAT.ENJOC;
    }

    public static int demanar(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();
    }

    public static void ferTirada(Scanner input, TORN t, VALOR[][] tauler){

        System.out.println("PARTIDA: "+ resultat);
        System.out.println("TORN: "+ torn);

        int fila, col;

        do {

            fila = demanar("Fila: ", input);
            col = demanar("Columna: ", input);

        }while(! tiradaValida(fila, col, tauler));

        tauler[fila][col] = (t==TORN.JUGADOR_A)? VALOR.CREU : VALOR.CERCLE;

        numTirades++;
    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return (f>=0 && f<=t.length-1 && c>=0 && c<=t.length-1 && t[f][c]==VALOR.BUIDA);
    }

    public static TORN canviaTorn(TORN t){
        if(t == TORN.JUGADOR_A) {
            return TORN.JUGADOR_B;
        }
        else {
            return TORN.JUGADOR_A;
        }
    }

    public static RESULTAT comprovaResultat(VALOR[][] t){

        boolean guanyaF = false;

        for(int f=0; f<=t.length-1; f++){
            boolean b = true;
            for(int c=0; c<t[f].length-1; c++){
                b = b && (t[f][c]==t[f][c+1] && t[f][c]!=VALOR.BUIDA);
            }
            guanyaF = b || guanyaF;
        }

        boolean guanyaC = false;

        for(int c=0; c<=t.length-1; c++){
            boolean b = true;
            for(int f=0; f<t.length-1; f++){
                b = b && (t[f][c]==t[f+1][c]  && t[f][c]!=VALOR.BUIDA);
            }
            guanyaC = b || guanyaC;
        }

        boolean guanyaDD = true;
        for(int i=0; i<t.length-1; i++){
            guanyaDD = guanyaDD && (t[i][i]==t[i+1][i+1]  && t[i][i]!=VALOR.BUIDA);
        }

        boolean guanyaDA = true;
        for(int c=0, f=t.length-1; c<t.length-1; c++, f--){
            guanyaDA = guanyaDA && (t[f][c]==t[f-1][c+1]  && t[f][c]!=VALOR.BUIDA);
        }

        boolean guanya = guanyaF || guanyaC || guanyaDD || guanyaDA;

        if(guanya && torn==TORN.JUGADOR_A){
            return RESULTAT.GUANYADOR_A;
        }
        else if(guanya && torn==TORN.JUGADOR_B){
            return RESULTAT.GUANYADOR_B;
        }
        else if(!guanya && numTirades==t.length*t.length){
            return RESULTAT.EMPAT;
        }
        else {
            return  RESULTAT.ENJOC;
        }

    }

    public static void mostrarResultat(RESULTAT r){
        if(r==RESULTAT.EMPAT){
            System.out.println("Partida acabada en empat!!!");
        }
        else if(r==RESULTAT.GUANYADOR_A){
            System.out.println("Enhorabona Jugador/a A !!!");
        }
        else if(r==RESULTAT.GUANYADOR_B){
            System.out.println("Enhorabona Jugador/a B !!!");
        }
        else {
            System.out.println("La partida segueix en joc ... ");
        }
    }




}
