package trenenliniatopdown;

import java.util.Scanner;

public class TresEnLiniaV01 {

    // Valors de les caselles del tauler i la variable del tauler (array bidimensional)
    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    // Valors possibles del resultat de la partida i la seva variable
    public enum RESULTAT {EN_JOC, EMPAT, GUANYADOR_A, GUANYADOR_B};
    public static RESULTAT resultat;

    // Valors possibles del torn i la seva variable
    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;
    public static int numTirades;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        inicialitzaPartida();
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
    public static void inicialitzaPartida(){ }

    // Mostrar l'estat actual del tauler
    public static void mostrarTauler(VALOR[][] t){ }

    // Indicarà true quan la partida hagi acabat (per empat o victòria), i false en altre cas.
    public static boolean partidaAcabada(){ return true; }

    // Demana al jugador on fer la tirada (fila i columna)
    public static void ferTirada(Scanner input, TORN t, VALOR[][] tauler){ }

    // Passa el torn a l'altre jugador
    public static TORN canviarTorn(TORN t) { return TORN.JUGADOR_A; }

    // Retorna el resultat de la partida (EMPAT, GUANYA A o GUANYA B)
    public static RESULTAT comprovaResultat(VALOR[][] t){ return RESULTAT.EN_JOC; }

    // Indica el resultat de la partida (EMPAT, GUANYA A o GUANYA B)
    public static void mostrarResultat(RESULTAT r) {}

}
