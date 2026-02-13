package processing;

import processing.core.PApplet;
import processing.core.PImage;

public class AnimacioClasse extends PApplet {

    Personatge p1, p2;

    public static void main(String[] args) {
        PApplet.main("processing.AnimacioClasse");
    }

    public void settings(){ size(800, 800); }

    public void setup(){
        p1 = new Personatge(100, 400, 1, 15, 5);
        p1.loadImages(this, 8, 1, "frame");

        p2 = new Personatge(300, 300, -1, 15, 1);
        p2.loadImages(this, 10, 2, "Artboard ");
    }

    public void draw(){
        background(200, 100, 100);
        p1.display(this);
        p1.move(this);
        p1.updateFrame(this);

        p2.display(this);
        p2.move(this);
        p2.updateFrame(this);
    }
}
