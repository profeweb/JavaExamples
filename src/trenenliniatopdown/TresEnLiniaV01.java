package trenenliniatopdown;

public class TresEnLiniaV01 {

    // Valors que es poden guardar en les caselles del tauler i el tauler (array bidimensional)
    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    // Valors possibles del resultat de la partida
    public enum RESULTAT {EMPAT, GUANYADOR_A, GUANYADOR_B};
    public static RESULTAT resultat;

    // Valors possible del torn i la seva variable
    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;

    public static void main(String[] args) {

        inicialitzaPartida(tauler);
        mostrarTauler(tauler);

        do {
            torn = canviarTorn(torn);
            ferTirada(torn);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
        } while(! partidaAcabada(tauler));

        // Un cop acabada la partida, s'indica el resultat
        mostrarResultat(resultat);
    }

    // Inicialitzar el tauler i les variables necessàries (torn)
    public static void inicialitzaPartida(VALOR[][] t){ }

    // Mostrar l'estat actual del tauler
    public static void mostrarTauler(VALOR[][] t){ }

    // Indicarà true quan la partida hagi acabat (per empat o victòria), i false en altre cas.
    public static boolean partidaAcabada(VALOR[][] t){ return true; }

    // Demana al jugador on fer la tirada (fila i columna)
    public static void ferTirada(TORN t){ }

    // Passa el torn a l'altre jugador
    public static TORN canviarTorn(TORN t) { return TORN.JUGADOR_A; }

    // Retorna el resultat de la partida (EMPAT, GUANYA A o GUANYA B)
    public static RESULTAT comprovaResultat(VALOR[][] t){ return RESULTAT.EMPAT; }

    // Indica el resultat de la partida (EMPAT, GUANYA A o GUANYA B)
    public static void mostrarResultat(RESULTAT r) {}

}
