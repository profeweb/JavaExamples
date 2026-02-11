package poo.geometria;

import processing.core.PApplet;

public class TriangleOK {

    Punt[] punts;

    public TriangleOK(Punt a, Punt b, Punt c) {
        this.punts = new Punt[3];
        this.punts[0] = a;
        this.punts[1] = b;
        this.punts[2] = c;
    }

    public Punt getA() {
        return this.punts[0];
    }
    public Punt getB() {
        return this.punts[1];
    }
    public Punt getC() {
        return this.punts[2];
    }
    public Punt getPuntAt(int n){ return this.punts[n]; }

    public void setA(Punt a) {
        this.punts[0] = a;
    }
    public void setB(Punt b) {
        this.punts[1] = b;
    }
    public void setC(Punt c) {
        this.punts[2] = c;
    }
    public void setPuntAt(int n, Punt p){ this.punts[n] = p; }

    public void print(){
        System.out.println("Triangle format per: ");
        for(int i=0; i<punts.length; i++){
            this.punts[i].print();
        }
    }

    public void display(PApplet p5){
        for(int i=0; i<punts.length; i++){
            this.punts[i].display(p5);
            int j = (i+1) % punts.length;
            p5.strokeWeight(3); p5.stroke(0);
            p5.line(this.punts[i].x, this.punts[i].y,
                    this.punts[j].x, this.punts[j].y);
        }
    }
}
