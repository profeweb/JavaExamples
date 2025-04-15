package poo.quadrat;

import poo.poligons.Poligon;
import poo.poligons.Punt2D;
import processing.core.PApplet;

import static processing.core.PApplet.*;

public class Quadrat extends Poligon {

    public Quadrat(Punt2D c, float costat){
        super(4);

        float radi = (float)(costat*Math.sqrt(2)/2f);
        float ang = 45;
        for(int i=0; i<punts.length; i++){
            float x = c.getX() + radi*cos(radians(ang));
            float y = c.getY() + radi*sin(radians(ang));
            String t = String.valueOf(i+1);
            this.setPuntAt(i, new Punt2D(t, x, y));
            ang +=90;
        }
    }

    public void display(PApplet p5){
        p5.stroke(0);
        p5.fill(200, 200, 100, 50);

        p5.beginShape();
        for(int i=0; i<punts.length; i++){
            p5.vertex(punts[i].getX(), punts[i].getY());
        }
        p5.endShape(p5.CLOSE);
    }
}
