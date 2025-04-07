package poo.temp;

import processing.core.PApplet;

public class Punt3D {

    // Atributs o propietats
    String nom;
    float x, y, z;

    // Constructor(s)
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

    Punt3D(){
        this.nom = "O";
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Getters

    String getNom(){ return this.nom; }
    float getX(){ return this.x; }
    float getY(){ return this.y; }
    float getZ(){ return this.z; }

    // Setters
    void setNom(String n){ this.nom = n; }
    void setX(float x){ this.x = x; }
    void setY(float y){ this.y = y; }
    void setZ(float z){ this.z = z; }
    void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Altres

    double distancia(Punt3D altre){
        return Math.sqrt( Math.pow(this.x - altre.x, 2) +
                          Math.pow(this.y - altre.y, 2) +
                          Math.pow(this.z - altre.z, 2));
    }

    void print(){
        System.out.printf("%s:(%f,%f,%f).\n", this.nom, this.x, this.y, this.z);
    }

    void display(PApplet p5){
        p5.pushMatrix();
        p5.fill(0);
        p5.translate(this.x, this.y, this.z);
        p5.circle(0, 0,  20);
        p5.textSize(18); p5.textAlign(p5.LEFT);
        p5.text(this.nom +"("+this.x+","+this.y+","+this.z+")", 15, 0);
        p5.popMatrix();
    }
}
