package marato;

public class Main {

    public static void main(String[] args){

        // Variables de classe (Runner, Team i Race)
        Runner r1, r2, r3, r4;
        Team t1, t2;
        Race c1, c2, c3;

        // Construcció d'objectes de classes (Runner, Team i Race)

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

        // Afegir carreres a corredors
        r1.addRace("Puig Major");
        r1.addTime(65);

        r1.addRace("Son Macia");
        r1.addTime(55);

        r1.addRace("Lluc");
        r1.addTime(75);

        r1.addRace("Petra");
        r1.addTime(45);

        r1.addRace("Calvià");
        r1.addTime(35);

        r1.addRace("Volta al Món");
        r1.addRace("Volta al Món al enrevés");

        float minTempsR1 = r1.bestTime();
        System.out.printf("El millor temps de %s és %f.\n", r1.getName(), minTempsR1);

        float avgTempsR1 = r1.averageTimes();
        System.out.printf("Mitjana de temps de %s és %f.\n", r1.getName(), avgTempsR1);

    }
}
