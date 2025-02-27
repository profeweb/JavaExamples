package trenenliniatopdown;

import java.util.Scanner;

public class TresEnLiniaV03 {

    // Valors de les caselles del tauler i la variable del tauler (array bidimensional)
    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    // Valors possibles del resultat de la partida i la seva variable
    public enum RESULTAT {ENJOC, EMPAT, GUANYADOR_A, GUANYADOR_B};
    public static RESULTAT resultat;

    // Valors possibles del torn i la seva variable
    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;
    public static int numTirades;
    public static int numMaxTirades;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        inicialitzaPartida(5);
        mostrarTauler(tauler);

        while(! partidaAcabada()) {
            ferTirada(input, torn, tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviarTorn(torn);
        }
        mostrarResultat(resultat);
    }

    // Inicialitzar el tauler i les variables necessàries (torn)
    public static void inicialitzaPartida(int nf){
        tauler = new VALOR[nf][nf];
        for(int i=0; i<tauler.length; i++){
            for(int j=0; j<tauler[i].length; j++){
                tauler[i][j] = VALOR.BUIDA;
            }
        }
        numMaxTirades = nf*nf;
        torn = TORN.JUGADOR_A;
        resultat = RESULTAT.ENJOC;
    }

    // Mostrar l'estat actual del tauler
    public static void mostrarTauler(VALOR[][] t){
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                System.out.print("|");
                switch(t[i][j]){
                    case BUIDA: System.out.print(" "); break;
                    case CERCLE: System.out.print("O"); break;
                    case CREU: System.out.print("X"); break;
                } ;
                if(j==t[i].length-1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    // Indicarà true quan la partida hagi acabat (per empat o victòria), i false en altre cas.
    public static boolean partidaAcabada(){
        return (numTirades == numMaxTirades) || (resultat != RESULTAT.ENJOC);
    }

    // Demana al jugador on fer la tirada (fila i columna)
    public static void ferTirada(Scanner input, TORN t, VALOR[][] tauler){

        // Indica l'estat
        System.out.println("PARTIDA: "+ resultat);

        // Indica el torn
        System.out.println("TORN: "+ t);

        // Seleccionar fila i columna vàlides (buides)
        int f, c;
        do {
            f = demanar("Fila", input);
            c = demanar("Columna", input);
        } while(!tiradaValida(f, c, tauler));

        // Marcar la casella
        tauler[f][c] = t== TORN.JUGADOR_A ? VALOR.CREU : VALOR.CERCLE;

        // Incrementat el número de tirades
        numTirades++;
    }

    public static int demanar(String s, Scanner input){
        System.out.print("Indica la "+s+":");
        return input.nextInt();
    }

    //
    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return f>=0 && f<t.length && c>=0 && c<t[0].length && t[f][c] == VALOR.BUIDA;
    }

    // Passa el torn a l'altre jugador
    public static TORN canviarTorn(TORN t) {
        if (t == TORN.JUGADOR_A) {
            return TORN.JUGADOR_B;
        } else {
            return TORN.JUGADOR_A;
        }
    }

    // Retorna el resultat de la partida (EMPAT, GUANYA A o GUANYA B)
    public static RESULTAT comprovaResultat(VALOR[][] t){

        // Comprova guanyar per files
        boolean guanyaF = false;

        for(int f=0; f<t.length; f++){
            boolean b = true;
            for(int c=0; c<t[f].length-1; c++){
                b = b && (t[f][c]==t[f][c+1]  && t[f][c] != VALOR.BUIDA);
            }
            guanyaF = b || guanyaF;
        }

        // Comprova guanyar per columnes
        boolean guanyaC = false;
        for(int c=0; c<t[0].length; c++){
            boolean b = true;
            for(int f=0; f<t.length-1; f++){
                b = b && (t[f][c]==t[f+1][c]  && t[f][c] != VALOR.BUIDA);
            }
            guanyaC = b || guanyaC;
        }

        // Comprova guanyar per Diagonal Descendent
        boolean guanyaDD = false;
        boolean bDD = true;
        for(int i=0; i<t.length-1; i++){
            bDD = bDD && (t[i][i]==t[i+1][i+1]  && t[i][i] != VALOR.BUIDA);
        }
        guanyaDD = bDD;

        // Comprova guanyar per Diagonal Ascendent
        boolean guanyaDA = false;
        boolean bDA = true;
        for(int c=0, f = t.length-1; c<t.length-1; c++, f--){
            bDA = bDA && (t[f][c]==t[f-1][c+1]  && t[f][c] != VALOR.BUIDA);
        }
        guanyaDA = bDA;

        boolean guanya = guanyaF || guanyaC || guanyaDD || guanyaDA;

        if(guanya && torn == TORN.JUGADOR_A){
            return RESULTAT.GUANYADOR_A;
        }
        else if(guanya && torn == TORN.JUGADOR_B){
            return RESULTAT.GUANYADOR_B;
        }
        else if(numTirades==numMaxTirades){
            return RESULTAT.EMPAT;
        }
        else {
            return RESULTAT.ENJOC;
        }
    }

    // Indica el resultat de la partida (EMPAT, GUANYA A o GUANYA B)
    public static void mostrarResultat(RESULTAT r) {
        if(r == RESULTAT.EMPAT){
            System.out.println("La partida acaba en EMPAT.");
        }
        else if(r == RESULTAT.GUANYADOR_A){
            System.out.println("El guanyador de la partida és A.");
        }
        else if(r == RESULTAT.GUANYADOR_B){
            System.out.println("El guanyador de la partida és B.");
        }
        else if(r == RESULTAT.ENJOC){
            System.out.println("La partida està en joc.");
        }
    }

}
