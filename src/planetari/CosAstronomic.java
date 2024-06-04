package planetari;

import processing.core.PApplet;
import processing.core.PShape;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;

/**
 * @author Toni
 * @version 1.0
 * Superclasse que serveix per representar qualsevol cos astronòmic.
 */
public class CosAstronomic {

    // Tipus enumerat
    enum Tipus {ESTRELLA, PLANETA, SATÈLIT, COMETA, COSMENOR};

    /*
     Atributs generals
     etc
     */
    String nom;
    Tipus tipus;
    String codi;

    //Posició
    float x, y, z;

    // Angles de l'Orbita i la Rotació
    float angleRotacio;
    float angleOrbita;
    float angleStep = 0.002f;
    float rotaStep = 0.02f;

    // Propietats físiques
    double masa;
    double volum;
    double densitat;
    double gravetat;
    double radi;

    // Propietats orbitals
    double radiOrbita;
    double periodeOrbita;
    double periodeRotació;
    double excentricitat;

    // Propietats visuals
    PShape img;

    // Constructor

    /**
     * Constructor de cos astrònomic general.
     * @param n Nom del cos astronòmic.
     * @param t Tipus de cos astronòmic.
     * @param c Codi del cos astronòmic.
     */
    public CosAstronomic(String n, Tipus t, String c){
        this.nom = n;
        this.tipus = t;
        this.codi = c;

        angleOrbita = (float)( Math.random() * Math.PI * 2);
    }

    //  ************ Setters **************

    /**
     * Actualitza el nom del cos astronòmic.
     * @param n Nom del cos astronòmic.
     */
    public void setNom(String n){
        this.nom = n;
    }

    public void setTipus(Tipus t){
        this.tipus = t;
    }

    public void setCodi(String c){
        this.codi = c;
    }

    public void setPosicio(float x, float y, float z){
        this.x = x; this.y = y; this.z = z;
    }

    public void setPropsFisiques(double m, double v, double d, double g, double r){
        this.masa = m;
        this.volum = v;
        this.densitat = d;
        this.gravetat = g;
        this.radi = r;
    }

    public void setMasa(double m){
        this.masa = m;
    }

    public void setVolum(double v){
        this.volum = v;
    }

    public void setDensitat(double d){
        this.densitat = d;
    }

    public void setGravetat(double g){
        this.gravetat = g;
    }

    public void setRadi(double r){
        this.radi = r;
    }

    public void setPropsOrbitals(double ro, double po, double pr, double ex){
        this.radiOrbita = ro;
        this.periodeOrbita = po;
        this.periodeRotació = pr;
        this.excentricitat = ex;
    }

    public void setRadiOrbita(double ro){
        this.radiOrbita = ro;
    }

    public void setPeriodeOrbita(double po){
        this.periodeOrbita = po;
    }

    public void setPeriodeRotació(double pr){
        this.periodeRotació = pr;
    }

    public void setExcentricitat(double e){
        this.excentricitat = e;
    }

    public void setImatge(PApplet p5, String nomImatge ){
        this.img = p5.loadShape(nomImatge);
    }

    public void setAngleStep(float a){ this.angleStep = a; }

    public void setRotaStep(float a){ this.rotaStep = a; }

    //  ************ Getters **************

    /**
     * Getter de la propietat nom.
     * @return El nom del cos astronòmic
     */
    public String getNom(){
        return this.nom;
    }

    public Tipus getTipus(){
        return this.tipus;
    }

    public String getCodi(){
        return this.codi;
    }

    public double getMasa(){
        return this.masa;
    }

    public double getVolum(){
        return this.volum;
    }

    public double getDensitat(){
        return this.densitat;
    }

    public double getGravetat(){
        return this.gravetat;
    }

    public double getRadi(){
        return this.radi;
    }

    public double getRadiOrbita(){
        return this.radiOrbita;
    }

    public double getPeriodeOrbita(){
        return this.periodeOrbita;
    }

    public double getPeriodeRotació(){
        return this.periodeRotació;
    }

    public double getExcentricitat(){
        return this.excentricitat;
    }

    public PShape getImatge(){ return this.img; }


    // Altres mètodes

    public void print(){
        System.out.println("COS ASTRONÒMIC: ");
        System.out.println("\t Nom: "+this.nom);
        System.out.println("\t Tipus: "+this.tipus);
        char simbol = (char) Integer.parseInt(this.codi, 16);
        System.out.println("\t Símbol: "+simbol);
        System.out.println("\t Posició: ("+this.x+", "+this.y+", "+this.z+")");
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


    public void display(PApplet p5){
        p5.pushMatrix();
            p5.translate(this.x, this.y, this.z);
            p5.rotate(angleRotacio);
            p5.shapeMode(p5.CENTER);
            p5.shape(this.img, 0, 0, 100, 100);
        p5.popMatrix();
    }


    public void orbita(CosAstronomic astrePivot){
        this.x = astrePivot.x + (float)radiOrbita*cos(angleOrbita);
        this.y = astrePivot.y + (float)radiOrbita*sin(angleOrbita);

        angleOrbita+= angleStep;
    }

    public void orbita(PApplet p5, CosAstronomic astrePivot, float pos, boolean viewOrbits){

        float r = 150*pos;

        this.x = astrePivot.x + r*cos(angleOrbita);
        this.y = astrePivot.y + r*sin(angleOrbita);

        float angStep = p5.map((float) this.periodeOrbita, 0, 90000, 0.001f, 0.0001f);
        this.angleOrbita+= angStep;

        if(viewOrbits){
            p5.pushMatrix();
            p5.translate(astrePivot.x, astrePivot.y, -5.0f);
            p5.noFill();
            p5.stroke(255);
            p5.ellipse(0, 0, 2*r, 2*r);
            p5.popMatrix();
        }
    }


    public void rota(){
        this.angleRotacio += rotaStep;
    }

}
