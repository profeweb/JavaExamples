package poo.triangle;

import processing.core.PApplet;

public class Punt2D {

    //Atributs, propietats o variables de classe
    float x, y;
    String nom;

    // Constructor(s)
    Punt2D(){
        this.x = 0; this.y = 0; this.nom ="O";
    }

    Punt2D(String nom, float x, float y){
        this.nom = nom; this.x = x; this.y = y;
    }

    //Setters (Mutadores)
    void setX(float x){ this.x = x; }
    void setY(float y){ this.y = y; }
    void setXY(float x, float y){ this.x = x; this.y = y;}
    void setNom(String nom){ this.nom = nom; }

    // Getters (Accesores)
    String getNom(){ return this.nom; }
    float getX(){ return this.x; }
    float getY(){ return this.y; }

    // Altres
    void display(PApplet p5){
        p5.circle(this.x, this.y, 30);
        p5.fill(0);
        p5.text(this.nom, this.x + 30, this.y);
    }
}
