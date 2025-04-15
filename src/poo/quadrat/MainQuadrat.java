package poo.quadrat;

import poo.poligons.Punt2D;
import processing.core.PApplet;

public class MainQuadrat extends PApplet {

    Punt2D p1;
    Quadrat q1, q2;

    public static void main(String[] args) {
        PApplet.main("poo.quadrat.MainQuadrat");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){

        p1 = new Punt2D("", 200, 200);
        q1 = new Quadrat(p1, 100);

        q2 = new Quadrat(new Punt2D("", 400, 400), 200);
    }

    public void draw(){
        background(255);
        q1.display(this);
        q2.display(this);
    }

}
