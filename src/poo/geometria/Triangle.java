package poo.geometria;

import processing.core.PApplet;

public class Triangle {

    Punt a, b, c;

    public Triangle(Punt a, Punt b, Punt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Punt getA() {
        return a;
    }

    public void setA(Punt a) {
        this.a = a;
    }

    public Punt getB() {
        return b;
    }

    public void setB(Punt b) {
        this.b = b;
    }

    public Punt getC() {
        return c;
    }

    public void setC(Punt c) {
        this.c = c;
    }

    public void print(){
        System.out.println("Triangle format per: ");
        this.a.print();
        this.b.print();
        this.c.print();
    }

    public void display(PApplet p5){
        p5.strokeWeight(3); p5.stroke(0);
        p5.line(a.getX(), a.getY(), b.getX(), b.getY());
        p5.line(b.getX(), b.getY(), c.getX(), c.getY());
        p5.line(c.getX(), c.getY(), a.getX(), a.getY());
        a.display(p5);
        b.display(p5);
        c.display(p5);
    }
}
