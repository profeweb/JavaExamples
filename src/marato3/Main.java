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

    }
}
