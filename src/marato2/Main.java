package marato2;

public class Main {

    public static void main(String[] args) {

        Runner r1, r2;

        r1 = new Runner("Paco");
        r2 = new Runner("Bel", "Maravillas", true);

        r1.addRace("Palma");
        r1.addTime(12.5f);

        r1.addRace("Inca");
        r1.addTime(12.24f);

        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f",
                r1.getName(), r1.bestRace(), r1.bestTime());
    }
}
