package poo.geometria;

import processing.core.PApplet;

public class MainPoligonRegular extends PApplet {

    PoligonR pr1;
    Pentagon pe;

    public static void main(String[] args) {
        PApplet.main("poo.geometria.MainPoligonRegular");
    }

    public void settings(){ size(800, 800); }

    public void setup(){
        pr1 = new PoligonR(6, new Punt(300, 300), 200);
        pe = new Pentagon(new Punt(600, 400), 150);
        pe.setColor(color(0, 0, 255));
    }

    public void draw(){
        background(255);
        pr1.display(this, color(255, 0, 0));


        pe.display(this);
    }
}
