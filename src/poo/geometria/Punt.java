package poo.geometria;

import processing.core.PApplet;

public class Punt {

    float x;
    float y;
    char nom;

    Punt(){
        this.x = 0;
        this.y = 0;
        this.nom = ' ';
    }

    Punt(float x, float y){
        this.x = x;
        this.y = y;
        this.nom = ' ';
    }

    Punt(char n, float x, float y){
        this.x = x;
        this.y = y;
        this.nom = n;
    }

    void setNom(char n){ this.nom = n; }

    void setX(float x){
        this.x = x;
    }

    void setY(float y){
        this.y = y;
    }

    void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    char getNom(){ return  this.nom; }

    float getX(){
        return this.x;
    }

    float getY(){
        return this.y;
    }

    float[] getXY(){
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    double distancia(Punt altre){
        double x =  Math.pow((this.x - altre.x), 2);
        double y = Math.pow((this.y - altre.y), 2);
        return  Math.sqrt(x+y);
    }

    void print(){
        System.out.printf("Punt:(%f, %f).\n", this.x, this.y);
    }

    public void display(PApplet p5){
        p5.fill(0); p5.noStroke();
        p5.circle(this.x, this.y, 10);
        p5.fill(0); p5.textSize(24); p5.textAlign(p5.CENTER);
        p5.text(this.nom, this.x, this.y - 10);
    }
}
