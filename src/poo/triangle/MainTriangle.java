package poo.triangle;

import processing.core.PApplet;

public class MainTriangle extends PApplet {

    Punt2D p1, p2, p3;  // Declaració de variables de classe Punt2D
    Triangle t1, t2;    // Declaració de variables de classe Triangle

    public static void main(String[] args) {
        PApplet.main("poo.triangle.MainTriangle");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){

        // Instanciació d'objectes Punt2D amb els constructors
        p1 = new Punt2D();
        p2 = new Punt2D("P1", 200, 200);
        p3 = new Punt2D("P2", -200, 100);

        // Instanciació d'objectes Triangle amb els constructors
        t1 = new Triangle(p1, p2, p3);
        t2 = new Triangle(-200, -200, 0, -50, 200, -100);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);

        // Dibuixa eixos
        line(-width, 0, width, 0);
        line(0, -height, 0, height);

        // Dibuixa triangles
        t1.display(this, color(255, 100, 50, 50));
        t2.display(this, color(50, 255, 100, 50));

    }

    public void mousePressed(){
        Punt2D pMouse = new Punt2D("A", mouseX - width/2, mouseY - height/2);
        t1.setA(pMouse);
    }
}
