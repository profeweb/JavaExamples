package poo.geometria;

import processing.core.PApplet;

public class MainTriangleOK extends PApplet {

    TriangleOK t1;
    PoligonOK p1;

    public static void main(String[] args) {
        PApplet.main("poo.geometria.MainTriangleOK");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        t1 = new TriangleOK(new Punt('A', 400, 100),
                            new Punt('B', 500, 300),
                            new Punt('C', 200, 600));

        p1 = new PoligonOK(3);
        p1.setPuntAt(0, new Punt('1', 200, 200));
        p1.setPuntAt(1, new Punt('2', 250, 400));
        p1.setPuntAt(2, new Punt('3', 100, 500));
    }

    public void draw(){
        background(255);
        t1.display(this);
        p1.display(this);
    }
}
