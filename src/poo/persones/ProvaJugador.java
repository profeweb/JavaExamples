package poo.persones;

public class ProvaJugador {

    public static void main(String[] args) {

        // Crea objectes Jugador fent ús del constructor(s)
        Jugador j1 = new Jugador("Paco", 18, Persona.SEXE.HOME, "RCE Manacor", 15, Jugador.POSICIO.DAVANTER);
        Jugador j2 = new Jugador("Pep", 19, Persona.SEXE.HOME, "Inter Manacor", 12, Jugador.POSICIO.MIG);
        Jugador j3 = new Jugador("Maria", 17, Persona.SEXE.DONA, "Atlètic Manacor", Jugador.POSICIO.PORTER);

        // Utilitza el setter per modificar un atribut (numGols) del jugador
        j1.setNumGols(18);

        // Consulta amb un getter el valor d'un atribut (nomEquip) del jugador
        String nomEquip = j2.getNomEquip();
        System.out.printf("Equip del jugador 2: %s.%n%n", nomEquip);

        // Imprimeix la informació dels jugadors creats
        j1.imprimir();
        j2.imprimir();
        j3.imprimir();
    }
}
