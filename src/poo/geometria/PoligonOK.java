package poo.geometria;

import processing.core.PApplet;

public class PoligonOK {

    Punt[] punts;

    public PoligonOK(Punt[] punts) {
        this.punts = punts;
    }

    public PoligonOK(int n){
        this.punts = new Punt[n];
    }

    public Punt getPuntAt(int n){ return this.punts[n]; }

    public void setPuntAt(int n, Punt p){ this.punts[n] = p; }

    public void print(){
        System.out.println("Poligon format per: ");
        for(int i=0; i<punts.length; i++){
            this.punts[i].print();
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
        display(p5, p5.color(0));
    }
}
