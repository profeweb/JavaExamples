package poo.triangle;

import processing.core.PApplet;

public class MainTriangle extends PApplet {

    Punt2D p1, p2, p3;

    public static void main(String[] args) {
        PApplet.main("poo.triangle.MainTriangle");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        p1 = new Punt2D();
        p2 = new Punt2D("A", 200, 200);
        p3 = new Punt2D("B", -200, 100);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        p1.display(this);
        p2.display(this);
        p3.display(this);
    }
}
