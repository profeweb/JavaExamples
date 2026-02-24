package poo.geometria;

import processing.core.PApplet;

public class Punt {

    private float x;
    private float y;
    private char nom;

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

    public void setNom(char n){ this.nom = n; }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public char getNom(){ return  this.nom; }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    protected double distancia(Punt altre){
        double x =  Math.pow((this.x - altre.x), 2);
        double y = Math.pow((this.y - altre.y), 2);
        return  Math.sqrt(x+y);
    }

    protected void print(){
        System.out.printf("Punt:(%f, %f).\n", this.x, this.y);
    }

    public void display(PApplet p5){
        p5.fill(0); p5.noStroke();
        p5.circle(this.x, this.y, 10);
        p5.fill(0); p5.textSize(24); p5.textAlign(p5.CENTER);
        p5.text(this.nom, this.x, this.y - 10);
    }
}
