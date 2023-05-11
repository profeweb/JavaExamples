package planetari;

public class Planetari {

    public static void main(String[] args){

        Estrella e = new Estrella("Sol", "2609", 'F', 7500);
        e.print();

        Planeta p1 = new Planeta("Terra", "2641", Planeta.TipusPlaneta.ROCOS, e);
        p1.setMasa(59735e24);
        p1.setGravetat(9.780327);
        p1.setRadiOrbita(0.999855);
        p1.setAnells(false);
        p1.setNumSatellits(1);
        p1.print();

        CosAstronomic p2 = new CosAstronomic("Mart", CosAstronomic.Tipus.PLANETA, "2642");
        p2.setMasa(6.4185e23);
        p2.setGravetat(3.711);
        p2.setRadiOrbita(1.523662);
        p2.print();

        Satellit lluna = new Satellit("LLuna", "2222", Satellit.TipusSatelit.NATURAL, p1);
        lluna.print();
    }
}
