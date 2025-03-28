package poo.composicio;

import processing.core.PApplet;

public class Punt2D {

    // Atributs
    float x, y;
    String nom;

    // Constructor (s)
    Punt2D(String n, float x, float y){
        this.nom = n;
        this.x = x;
        this.y = y;
    }

    Punt2D(float x, float y){
        this.nom = "A";
        this.x = x;
        this.y = y;
    }

    // Getters i Setters

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    // Altres

    void imprimir(){
        System.out.printf("Punt %s(%f, %f).%n", nom, x, y);
    }

    void display(PApplet p5){
        p5.pushStyle();
            p5.fill(0);
            p5.circle(this.x, this.y, 10);
            p5.textAlign(p5.LEFT); p5.textSize(18);
            p5.text(this.nom + "("+this.x+","+this.y+")", this.x + 10, this.y);
        p5.popStyle();
    }
}
