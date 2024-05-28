package planetari;

public class Estrella extends CosAstronomic {

    // Atributs
    char tipusEspectral;
    float brillo;
    float temperatura;
    float indexColorUB;

    // Constructor
    Estrella(String n, String c, char te, float b){
        super(n, CosAstronomic.Tipus.ESTRELLA, c);
        this.tipusEspectral = te;
        this.brillo = b;
    }

    // Getters
    public char getTipusEspectral() {
        return tipusEspectral;
    }

    public float getBrillo() {
        return brillo;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getIndexColorUB() {
        return indexColorUB;
    }

    // Setters
    public void setTipusEspectral(char tipusEspectral) {
        this.tipusEspectral = tipusEspectral;
    }

    public void setBrillo(float brillo) {
        this.brillo = brillo;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setIndexColorUB(float indexColorUB) {
        this.indexColorUB = indexColorUB;
    }

    // Altres mètodes
    void print(){
        System.out.println("ESTRELLA: ");
        System.out.println("\t Nom: "+this.nom);
        System.out.println("\t Tipus: "+this.tipus);
        char simbol = (char) Integer.parseInt(this.codi, 16);
        System.out.println("\t Símbol: "+simbol);
        System.out.println("\t Posició: ("+this.x+", "+this.y+", "+this.z+")");

        System.out.println("\t Propietats Estrella: ");
        System.out.println("\t\t Tipus Espectral: "+this.tipusEspectral);
        System.out.println("\t\t Brillo: "+this.brillo);
        System.out.println("\t\t Temperatura: "+this.temperatura);
        System.out.println("\t\t Index de Color UB: "+this.gravetat);

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

        System.out.println("\t Propietats Estrella: ");
        System.out.println("\t\t Tipus Espectral: "+this.tipusEspectral);
        System.out.println("\t\t Brillo: "+this.brillo);
        System.out.println("\t\t Temperatura: "+this.temperatura);
        System.out.println("\t\t Index de Color UB: "+this.gravetat);
    }
}
