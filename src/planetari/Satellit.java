package planetari;

public class Satellit extends CosAstronomic {

    enum TipusSatelit {NATURAL, PASTOR,  TROIA, COORBITAL, ASTEROIDAL};

    TipusSatelit tipusSatelit;
    Planeta planeta;
    double pressio;
    float temperatura;

    Satellit(String n, String c, TipusSatelit ts, Planeta p){
        super(n, Tipus.SATÈLIT, c);
        this.tipusSatelit = ts;
        this.planeta = p;
    }

    public TipusSatelit getTipusSatelit() {
        return tipusSatelit;
    }

    public void setTipusSatelit(TipusSatelit tipusSatelit) {
        this.tipusSatelit = tipusSatelit;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public double getPressio() {
        return pressio;
    }

    public void setPressio(double pressio) {
        this.pressio = pressio;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    void print(){
        System.out.println("SATÈL·LIT: ");
        System.out.println("\t Nom: "+this.nom);
        System.out.println("\t Tipus: "+this.tipus);
        char simbol = (char) Integer.parseInt(this.codi, 16);
        System.out.println("\t Símbol: "+simbol);
        System.out.println("\t Posició: ("+this.x+", "+this.y+", "+this.z+")");

        System.out.println("\t Propietats Satèl·lit: ");
        System.out.println("\t\t Tipus Satèl·lit: "+this.tipusSatelit);
        System.out.println("\t\t Planeta: "+this.planeta.nom);
        System.out.println("\t\t Temperatura: "+this.temperatura);
        System.out.println("\t\t Pressió Atmosfèrica: "+this.pressio);

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
        System.out.println("\t Propietats Satèl·lit: ");
        System.out.println("\t\t Tipus Satèl·lit: "+this.tipusSatelit);
        System.out.println("\t\t Planeta: "+this.planeta.nom);
        System.out.println("\t\t Temperatura: "+this.temperatura);
        System.out.println("\t\t Pressió Atmosfèrica: "+this.pressio);
    }
}
