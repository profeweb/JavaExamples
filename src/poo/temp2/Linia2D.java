package poo.temp2;

import processing.core.PApplet;

public class Linia2D {

    // Atributs o propietats
    Punt2D p1, p2;

    // Constructors
    Linia2D(Punt2D p1, Punt2D p2){
        this.p1 = p1; this.p2 = p2;
    }

    // Setters
    public void setP1(Punt2D p1){ this.p1 = p1; }
    public void setP2(Punt2D p2){ this.p2 = p2; }

    // Getters
    public Punt2D getP1(){ return this.p1; }
    public Punt2D getP2(){ return this.p2; }

    // Altres
    public void print(){
        System.out.println("LINIA: ");
        p1.print();
        p2.print();
    }

    public void display(PApplet p5){
        p1.display(p5);
        p2.display(p5);
        p5.stroke(255, 0, 0);
        p5.strokeWeight(3);
        p5.line(p1.x, p1.y, p2.x, p2.y);
    }



}
