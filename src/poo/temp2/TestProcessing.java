package poo.temp2;

import processing.core.PApplet;

public class TestProcessing extends PApplet {

    Punt2D p1, p2, p3;
    Linia2D l1, l2;

    public static void main(String[] args) {
        PApplet.main("poo.temp2.TestProcessing");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        // Creació o instanciació amb els constructors
        p1 = new Punt2D('A', 200, 100);
        p2 = new Punt2D('B', 400, 300);
        p3 = new Punt2D('C', 100, 400);

        l1 = new Linia2D(p1, p2);
        l2 = new Linia2D(p3, p2);
    }

    public void draw(){
        background(255);

        l1.display(this);
        l2.display(this);
    }
}
