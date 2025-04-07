package poo.composicio;

import processing.core.PApplet;

public class Punt3D {

    // Atributs
    float x, y, z;
    String nom;

    // Constructor
    Punt3D(String n, float x, float y, float z){
        this.nom = n;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Punt3D(float x, float y, float z){
        this.nom = "A";
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double distancia(Punt3D altre){
        return Math.sqrt( Math.pow(this.x - altre.x, 2) + Math.pow(this.y-altre.y, 2) + Math.pow(this.z-altre.z, 2));
    }

    void imprimir(){
        System.out.printf("Punt %s(%f, %f, %f).%n", nom, x, y, z);
    }

    void display(PApplet p5){
        p5.pushMatrix();
        p5.pushStyle();
        p5.fill(0);
        p5.translate(this.x, this.y, this.z);
        p5.circle(0, 0, 10);
        p5.textAlign(p5.LEFT); p5.textSize(18);
        p5.translate(10, 0, 0);
        p5.text(this.nom + "("+this.x+","+this.y+","+this.z+")", 10, 0, 0);
        p5.popStyle();
        p5.popMatrix();
    }
}
