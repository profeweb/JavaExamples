package poo.cercle;

import poo.triangle.Punt2D;
import processing.core.PApplet;

public class MainCercle extends PApplet {

    Cercle c1, c2; // Declaració de les variables de classe Cercle.

    public static void main(String[] args) {
        PApplet.main("poo.cercle.MainCercle");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        // Instanciació de les variables de classe Cercle amb els constructors.
        c1 = new Cercle();
        c2 = new Cercle(new Punt2D("C", 200, 200), 300);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);

        // Dibuixa eixos
        line(-width, 0, width, 0);
        line(0, -height, 0, height);

        // Dibuixa els cercle
        c1.display(this);
        c2.display(this);
    }

    public void mousePressed(){

    }
}
