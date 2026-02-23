package motion;

import processing.core.PApplet;

public class TweenMotion extends PApplet {

    float x, y, d=100;
    float x1, y1, x2, y2;
    float t;

    public static void main(String[] args) {
        PApplet.main("motion.TweenMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        x1 = 100; y1 = 100;
        x2 = 600; y2 = 600;
        t=0;
    }

    public void draw(){
        background(255);

        x = x1 + (x2 - x1)*t;
        y = y1 + (y2 - y1)*t;
        if(t<1) {
            t += 0.01;
        }

        stroke(0);
        line(x1, y1, x2, y2);
        fill(0);
        circle(x1, y1, 20);
        circle(x2, y2, 20);

        noFill();
        circle(x, y, d);

    }

}
