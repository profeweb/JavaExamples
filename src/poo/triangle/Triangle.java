package poo.triangle;

import processing.core.PApplet;

public class Triangle {

    Punt2D a, b, c;

    // Agregació
    Triangle(Punt2D p1, Punt2D p2, Punt2D p3){
        this.a= p1; this.b= p2; this.c = p3;
    }

    // Composició
    Triangle(float x1, float y1, float x2, float y2, float x3, float y3){
        this.a = new Punt2D("A", x1, y1);
        this.b = new Punt2D("B", x2, y2);
        this.c = new Punt2D("C", x3, y2);
    }

    // Setters

    public void setA(Punt2D a) {
        this.a = a;
    }

    public void setB(Punt2D b) {
        this.b = b;
    }

    public void setC(Punt2D c) {
        this.c = c;
    }


    // Getters

    public Punt2D getA() {
        return a;
    }

    public Punt2D getB() {
        return b;
    }

    public Punt2D getC() {
        return c;
    }


    // Altres

    public void display(PApplet p5, int tColor){

        p5.stroke(0); p5.strokeWeight(2);
        p5.fill(tColor);

        // Dibuixa triangle
        p5.beginShape();
        p5.vertex(a.x, a.y);
        p5.vertex(b.x, b.y);
        p5.vertex(c.x, c.y);
        p5.endShape(p5.CLOSE);

        // Dibuixa punts
        a.display(p5);
        b.display(p5);
        c.display(p5);

    }

}
