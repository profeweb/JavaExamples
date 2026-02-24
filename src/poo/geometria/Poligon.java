package poo.geometria;

import processing.core.PApplet;

public class Poligon {

    Punt[] punts;

    int color;

    Poligon(Punt ... ps){
        punts = new Punt[ps.length];
        for(int i=0; i<punts.length; i++){
            punts[i] = ps[i];
        }
    }

    public Poligon(int n){
        this.punts = new Punt[n];
    }

    Poligon(Punt centre, float radi, int numPunts){
        punts = new Punt[numPunts];
        float angle = 0;
        for(int i=0; i<punts.length; i++){
            double x = centre.getX() + radi*Math.cos(angle);
            double y = centre.getY() + radi*Math.sin(angle);
            punts[i] = new Punt((float)x, (float)y);
            angle += 2*Math.PI / numPunts;
        }
    }

    public Punt getPuntAt(int n){ return this.punts[n]; }

    public void setPuntAt(int n, Punt p){ this.punts[n] = p; }

    public void setColor(int c){
        this. color = c;
    }

    public int getNumPunts(){
        return punts.length;
    }

    public void print(){
        System.out.printf("Polígon format per %d punts:\n", getNumPunts());
        for(int i=0; i<punts.length; i++){
            punts[i].print();
        }
    }

    public void display(PApplet p5, int c){
        for(int i=0; i<punts.length; i++){
            this.punts[i].display(p5);
            int j = (i+1) % punts.length;
            p5.strokeWeight(3); p5.stroke(c);
            p5.line(this.punts[i].getX(), this.punts[i].getY(),
                    this.punts[j].getX(), this.punts[j].getY());
        }
    }

    public void display(PApplet p5){
        display(p5, this.color);
    }
}