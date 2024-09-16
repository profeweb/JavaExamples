package marato3;

public class Main {

    public static void main(String[] args) {

        // Objectes de classe Runner
        Runner r1, r2;

        // Constructor(s) de la classe Runner
        r1 = new Runner("Paco");
        r2 = new Runner("Bel", "Maravillas", true);

        // Mètodes de la classe Runner
        r1.addRace("Palma");
        r1.addTime(12.5f);

        r1.addRace("Inca");
        r1.addTime(12.24f);

        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f. \n",
                r1.getName(), r1.bestRace(), r1.bestTime());


        // Objectes de la classe Team
        Team t1, t2;

        // Constructor(s) de la classe Team
        t1 = new Team("Equip A", true);
        t2 = new Team("Equip B", false);

        // Mètodes de la classe Team
        t1.addRunner(r1);
        t1.addRunner(r2);

        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t1.getName(), t1.averageTimes());

        // Objectes de la classe Race
        Race c1, c2;

        // Constructor(s) de la classe Race
        c1 = new Race("Carrera 1", false, 12);

        // Mètodes de la classe Race
        c1.addRunner(r1);
        c1.addTimeToRunner(r1, 12.5f);

        c1.addRunner(r2);
        c1.addTimeToRunner(r2, 14.3f);

        System.out.printf("Millor corredor/a de la carrea %s és %s amb temps %.2f. \n", c1.getRaceID(), c1.bestRunner(), c1.bestTime());


    }
}
