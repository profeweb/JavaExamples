package poo.poligons;

import processing.core.PApplet;

public class MainEstrella extends PApplet {

    Estrella e; // Declaració
    Punt2D ce;

    public static void main(String[] args) {
        PApplet.main("poo.poligons.MainEstrella");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        ce = new Punt2D("O", 0, 0);
        e = new Estrella(ce, 200, 300);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        line(-width, 0, width, 0);
        line(0, -height, 0, height);
        e.display(this);

        float rInt = map(mouseX, 0, width, 100, 250);
        e.setRadiInterior(rInt);
        e.updatePuntsInteriors(ce);
    }
}
