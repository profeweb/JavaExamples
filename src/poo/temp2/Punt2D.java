package poo.temp2;

import processing.core.PApplet;

public class Punt2D {

    // Atributs o propietats
    char nom;
    float x, y;

    // Constructor(s)
    Punt2D(char nom){
        this.nom = nom; this.x = 0; this.y=0;
    }

    Punt2D(char nom, float x, float y){
        this.nom = nom; this.x = x; this.y=y;
    }

    // Getters
    public char getNom(){ return this.nom; }
    public float getX(){ return  this.x; }
    public float getY(){ return  this.y; }

    // Setters
    public void setNom(char nom){ this.nom = nom; }
    public void setX(float x){ this.x = x; }
    public void setY(float y){ this.y = y; }
    public void setXY(float x, float y){
        this.x =x; this.y=y;
    }

    // Altres
    public void print(){
        System.out.printf(" Punt %c :(%f, %f).\n", nom, x,y);
    }

    public void display(PApplet p5){
        p5.fill(0); p5.noStroke();
        p5.circle(this.x, this.y, 20);
        p5.textSize(14); p5.textAlign(p5.CENTER);
        String info = nom + ":("+x+", "+y+")";
        p5.text(info, this.x, this.y -10);
    }
}
