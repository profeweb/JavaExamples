package planetari;

public class Planeta extends CosAstronomic {

    enum TipusPlaneta {ROCOS, GASOS, NAN };

    // Atributs
    TipusPlaneta tipusPlaneta;
    Estrella estrella;
    boolean anells;
    int numSatellits;

    // Constructor
    Planeta(String n, String c, TipusPlaneta tp, Estrella e){
        super(n, CosAstronomic.Tipus.PLANETA, c);
        this.tipusPlaneta = tp;
        this.estrella = e;
    }

    // Getters
    public TipusPlaneta getTipusPlaneta() {
        return tipusPlaneta;
    }

    public Estrella getEstrella() {
        return estrella;
    }

    public boolean isAnells() {
        return anells;
    }

    public int getNumSatellits() {
        return numSatellits;
    }

    // Setters
    public void setTipusPlaneta(TipusPlaneta tipusPlaneta) {
        this.tipusPlaneta = tipusPlaneta;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    public void setAnells(boolean anells) {
        this.anells = anells;
    }

    public void setNumSatellits(int numSatellits) {
        this.numSatellits = numSatellits;
    }

    // Altres mètodes

    public void print(){
        System.out.println("PLANETA: ");
        System.out.println("\t Nom: "+this.nom);
        System.out.println("\t Tipus: "+this.tipus);
        char simbol = (char) Integer.parseInt(this.codi, 16);
        System.out.println("\t Símbol: "+simbol);
        System.out.println("\t Posició: ("+this.x+", "+this.y+", "+this.z+")");

        System.out.println("\t Propietats Planeta: ");
        System.out.println("\t\t Tipus Planeta: "+this.tipusPlaneta);
        System.out.println("\t\t Estrella: "+this.estrella.nom);
        System.out.println("\t\t Anells: "+this.anells);
        System.out.println("\t\t Núm. Satellits: "+this.numSatellits);

        System.out.println("\t Propietats Físiques: ");
        System.out.println("\t\t Masa: "+this.masa);
        System.out.println("\t\t Volum: "+this.volum);
        System.out.println("\t\t Densitat: "+this.densitat);
        System.out.println("\t\t Gravetat: "+this.gravetat);
        System.out.println("\t\t Radi: "+this.radi);

        System.out.println("\t Propietats Orbitals: ");
        System.out.println("\t\t Radi Orbital: "+this.radiOrbita);
        System.out.println("\t\t Periode Orbital: "+this.periodeOrbita);
        System.out.println("\t\t Periode Rotació: "+this.periodeRotació);
        System.out.println("\t\t Excentricitat: "+this.excentricitat);
        System.out.println("");
    }

    void print2(){
        super.print();
        System.out.println("\t Propietats Planeta: ");
        System.out.println("\t\t Tipus Planeta: "+this.tipusPlaneta);
        System.out.println("\t\t Estrella: "+this.estrella.nom);
        System.out.println("\t\t Anells: "+this.anells);
        System.out.println("\t\t Núm. Satellits: "+this.numSatellits);
    }
}
