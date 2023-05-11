package planetari;

public class Planetari {

    public static void main(String[] args){

        CosAstronomic p1 = new CosAstronomic("Terra", CosAstronomic.Tipus.PLANETA, "2641");
        p1.setMasa(59735e24);
        p1.setGravetat(9.780327);
        p1.setRadiOrbita(0.999855);
        p1.print();

        CosAstronomic p2 = new CosAstronomic("Mart", CosAstronomic.Tipus.PLANETA, "2642");
        p2.setMasa(6.4185e23);
        p2.setGravetat(3.711);
        p2.setRadiOrbita(1.523662);
        p2.print();

        CosAstronomic c2 = new CosAstronomic("Sol", CosAstronomic.Tipus.ESTRELLA, "2609");
        c2.print();

    }
}
