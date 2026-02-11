package poo.geometria;

import processing.core.PApplet;

public class Linia {

    Punt a, b;

    public Linia(Punt a, Punt b) {
        this.a = a;
        this.b = b;
    }

    public Punt getA() {
        return a;
    }

    public Punt getB() {
        return b;
    }

    public void setA(Punt a) {
        this.a = a;
    }

    public void setB(Punt b) {
        this.b = b;
    }

    double llargada(){
        return this.a.distancia(this.b);
    }

    void print(){
        System.out.println("Línia formada per:");
        this.a.print();
        this.b.print();
    }

    public void display(PApplet p5){
        p5.strokeWeight(3); p5.stroke(0);
        p5.line(a.x, a.y, b.x, b.y);
        a.display(p5);
        b.display(p5);
    }
}
