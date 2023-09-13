package marato;

public class Main {

    public static void main(String[] args){

        Runner r1, r2, r3, r4;
        Team t1, t2;
        Race c1, c2, c3;

        r1 = new Runner("Paco", "Playas", true);
        r2 = new Runner("Pep");
        r3 = new Runner("Maria", "Montañas", true);
        r4 = new Runner("Bel", "Playas", true);

        t1 = new Team("Playas", true);
        t2 = new Team("Montañas", false);

        c1 = new Race("Son Carrió");
        c2 = new Race("Puig Major");
        c3 = new Race("San Silvestre");
    }
}
