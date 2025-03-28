package poo.composicio;

import processing.core.PApplet;

public class ProvaPunt3DP5 extends PApplet {

    Punt3D p1, p2;

    public static void main(String[] args) {
        PApplet.main("poo.composicio.ProvaPunt3DP5", args);
    }

    public void settings(){
        size(800, 800, P3D);
    }

    public void setup(){

        p1 = new Punt3D("B", 50, 30, 0);
        p2 = new Punt3D("X", 150, 300, -100);

        p1.setXYZ(60, 40, 0);

        p1.imprimir();
        p2.imprimir();
    }

    public void draw(){
        background(255);
        translate(width/2, height/2, 0);
        line(0, -height, 0, height);
        line(-width, 0, width, 0);

        p1.display(this);
        p2.display(this);
    }
}
