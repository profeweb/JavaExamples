package poo.geometria;

import processing.core.PApplet;

public class MainEstrella extends PApplet {

    Estrella e1;
    Sol s1;
    Engranatge e2;
    Petal p1;

    public static void main(String[] args) {
        PApplet.main("poo.geometria.MainEstrella");
    }

    public void settings(){size(1800, 800); }

    public void setup(){
        e1 = new Estrella(14,
                new Punt(width/6, height/2),
                100, 200);

        s1 = new Sol(24,
                new Punt(2.5f*width/6, height/2),
                50, 200);

        e2 = new Engranatge(24,
                new Punt(3.5f*width/6, height/2),
                100, 200);

        p1 = new Petal(24,
                new Punt(5*width/6, height/2),
                100, 200);
    }

    public void draw(){
        background(255);
        e1.display(this);
        e2.display(this);
        s1.display(this);
        p1.display(this);
    }
}
