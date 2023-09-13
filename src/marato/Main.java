package marato;

public class Main {

    public static void main(String[] args){

        // Variables de classe
        Runner r1, r2, r3, r4;
        Team t1, t2;
        Race c1, c2, c3;

        // Construcció d'objectes de classes

        r1 = new Runner("Paco", "Playas", true);
        r2 = new Runner("Pep");
        r3 = new Runner("Maria", "Montañas", true);
        r4 = new Runner("Bel", "Playas", true);

        t1 = new Team("Playas", true);
        t2 = new Team("Montañas", false);

        c1 = new Race("Son Carrió");
        c2 = new Race("Puig Major");
        c3 = new Race("San Silvestre");

        // Agregar Runners a Teams
        t1.addRunner(r1);
        t1.addRunner(r4);
        t2.addRunner(r2);
        t2.addRunner(r3);

        // Agregar Runners a Races
        c1.addRunner(r1);
        c1.addRunner(r2);
        c1.addRunner(r3);
        c1.addRunner(r4);

        c3.addRunner(r1);
        c3.addRunner(r3);
    }
}
