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
    

    // Getters


    // Altres

    public void display(PApplet p5){

    }

}
