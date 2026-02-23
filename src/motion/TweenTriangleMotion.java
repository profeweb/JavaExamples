package motion;

import processing.core.PApplet;

public class TweenTriangleMotion extends PApplet {

    float x, y, d=100;

    float[] xs, ys;
    int numTrajecte;
    float t;

    public static void main(String[] args) {
        PApplet.main("motion.TweenTriangleMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        xs = new float[3];
        ys = new float[3];
        xs[0] = 100; ys[0] = 50;  // P1
        xs[1] = 600; ys[1] = 250;  // P2
        xs[2] = 300; ys[2] = 650;  // P3
        numTrajecte = 0;
        t=0;
    }

    public void draw(){
        background(255);

        x = xs[numTrajecte] + (xs[(numTrajecte+1)%xs.length] - xs[numTrajecte])*t;
        y = ys[numTrajecte] + (ys[(numTrajecte+1)%xs.length] - ys[numTrajecte])*t;
        if(t<1) {
            t += 0.01;
        }
        else {
            numTrajecte++;
            numTrajecte = numTrajecte % xs.length;
            t=0;
        }

        for(int i=0; i<xs.length; i++){
            stroke(0);
            line(xs[i], ys[i], xs[ (i + 1) % xs.length], ys[(i + 1) % ys.length]);
            fill(0);
            circle(xs[i], ys[i], 20);
        }

        noFill();
        circle(x, y, d);

    }

}
