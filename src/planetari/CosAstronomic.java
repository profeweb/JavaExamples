package planetari;

import processing.core.PApplet;
import processing.core.PShape;

public class CosAstronomic {

    // Tipus enumerat
    enum Tipus {ESTRELLA, PLANETA, SATÈLIT, COMETA, COSMENOR};

    // Atributs generals
    String nom;
    Tipus tipus;
    String codi;

    //Posició
    float x, y, z;

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
    CosAstronomic(String n, Tipus t, String c){
        this.nom = n;
        this.tipus = t;
        this.codi = c;
    }

    //  ************ Setters **************

    void setNom(String n){
        this.nom = n;
    }

    void setTipus(Tipus t){
        this.tipus = t;
    }

    void setCodi(String c){
        this.codi = c;
    }

    void setPosició(float x, float y, float z){
        this.x = x; this.y = y; this.z = z;
    }

    void setPropsFisiques(double m, double v, double d, double g, double r){
        this.masa = m;
        this.volum = v;
        this.densitat = d;
        this.gravetat = g;
        this.radi = r;
    }

    void setMasa(double m){
        this.masa = m;
    }

    void setVolum(double v){
        this.volum = v;
    }

    void setDensitat(double d){
        this.densitat = d;
    }

    void setGravetat(double g){
        this.gravetat = g;
    }

    void setRadi(double r){
        this.radi = r;
    }

    void setPropsOrbitals(double ro, double po, double pr, double ex){
        this.radiOrbita = ro;
        this.periodeOrbita = po;
        this.periodeRotació = pr;
        this.excentricitat = ex;
    }

    void setRadiOrbita(double ro){
        this.radiOrbita = ro;
    }

    void setPeriodeOrbita(double po){
        this.periodeOrbita = po;
    }

    void setPeriodeRotació(double pr){
        this.periodeRotació = pr;
    }

    void setExcentricitat(double e){
        this.excentricitat = e;
    }

    void setImatge(PApplet p5, String nomImatge ){
        this.img = p5.loadShape(nomImatge);
    }

    //  ************ Getters **************

    String getNom(){
        return this.nom;
    }

    Tipus getTipus(){
        return this.tipus;
    }

    String getCodi(){
        return this.codi;
    }

    double getMasa(){
        return this.masa;
    }

    double getVolum(){
        return this.volum;
    }

    double getDensitat(){
        return this.densitat;
    }

    double getGravetat(){
        return this.gravetat;
    }

    double getRadi(){
        return this.radi;
    }

    double getRadiOrbita(){
        return this.radiOrbita;
    }

    double getPeriodeOrbita(){
        return this.periodeOrbita;
    }

    double getPeriodeRotació(){
        return this.periodeRotació;
    }

    double getExcentricitat(){
        return this.excentricitat;
    }

    PShape getImatge(){ return this.img; }


    // Altres mètodes

    void print(){
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


    void display(PApplet p5){
        p5.pushMatrix();
            p5.translate(this.x, this.y, this.z);
            p5.imageMode(p5.CENTER);
            p5.shape(this.img, 0, 0, 100, 100);
        p5.popMatrix();
    }

}
