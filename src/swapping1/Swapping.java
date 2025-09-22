package swapping1;

import processing.core.PApplet;

public class Swapping extends PApplet {

    Proces p1;

    public static void main(String[] args) {
        PApplet.main("swapping1.Swapping");
    }

    public void settings(){
        size(1400, 800);
    }

    public void setup(){
        p1 = new Proces("P1", color(255, 0, 0), 64);
    }

    public void draw(){
        background(255);
        p1.display(this, 100, 100, 50);
    }
}
