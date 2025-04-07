package poo.temp;

import processing.core.PApplet;

public class MainPunt3DP5 extends PApplet {

    Punt3D p1, p2;

    public static void main(String[] args) {
        PApplet.main("poo.temp.MainPunt3DP5");
    }

    public void settings(){
        size(800,800, P3D);
    }

    public void setup(){
        p1 =new Punt3D("A", 200, 200, 0);
        p2 = new Punt3D("B", 300, 100, -200);
    }

    public void draw(){
        background(255);
        line(width/2, 0, width/2, height);
        line(0, height/2, width, height/2);
        translate(width/2, height/2);
        p1.display(this);
        p2.display(this);
    }

}
