package poo.geometria;

import processing.core.PApplet;

public class MainQuadrat extends PApplet {

    Quadrat q1, q2;
    Punt[] punts = { new Punt(300, 100),
            new Punt(600, 100),
            new Punt(600, 600),
            new Punt(300, 600)};

    public static void main(String[] args) {
        PApplet.main("poo.geometria.MainQuadrat");
    }

    public void settings(){ size(800, 800); }

    public void setup(){
        q1 = new Quadrat();
        q1.setPuntAt(0, new Punt(100, 100));
        q1.setPuntAt(1, new Punt(200, 100));
        q1.setPuntAt(2, new Punt(200, 200));
        q1.setPuntAt(3, new Punt(100, 200));

        q2 = new Quadrat(punts);

        q2.print();
    }

    public void draw(){
        background(255);
        q1.display(this);
        q2.display(this);
    }

}
