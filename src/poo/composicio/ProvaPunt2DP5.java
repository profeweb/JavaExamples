package poo.composicio;

import processing.core.PApplet;

public class ProvaPunt2DP5 extends PApplet {

    Punt2D p1, p2;

    public static void main(String[] args) {
        PApplet.main("poo.composicio.ProvaPunt2DP5", args);
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){

        p1 = new Punt2D("B", 50, 30);
        p2 = new Punt2D(150, 300);

        p1.setXY(60, 40);

        p1.imprimir();
        p2.imprimir();
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        line(0, -height, 0, height);
        line(-width, 0, width, 0);

        p1.display(this);
        p2.display(this);
    }
}
