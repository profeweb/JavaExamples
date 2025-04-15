package poo.poligons;

import processing.core.PApplet;

import static processing.core.PApplet.*;

public class Poligon {

    public Punt2D[] punts;  // Composició

    public Poligon(int n){
        punts = new Punt2D[n];
    }

    public Poligon(int n, Punt2D c, float r){
        this(n);  // Cridada a l'altre constructor de Poligon
        float angStep = 360f / n;
        float ang = 0;
        for(int i=0; i<punts.length; i++){
            float x = c.x + r*cos(radians(ang));
            float y = c.y + r*sin(radians(ang));
            String t = String.valueOf(i+1);
            setPuntAt(i, new Punt2D(t, x, y));
            ang += angStep;
        }
    }

    public void setPuntAt(int i, Punt2D p){
        punts[i] = p;
    }

    public Punt2D getPuntAt(int i){
        return punts[i];
    }

    public void display(PApplet p5){
        p5.stroke(0);
        p5.fill(200, 100, 100, 50);

        p5.beginShape();
        for(int i=0; i<punts.length; i++){
            p5.vertex(punts[i].getX(), punts[i].getY());
        }
        p5.endShape(p5.CLOSE);

        for(int i=0; i<punts.length; i++){
            punts[i].display(p5);
        }
    }
}
