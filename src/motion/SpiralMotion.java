package motion;

import processing.core.PApplet;

public class SpiralMotion extends PApplet {

    float x, y, d = 10;
    float xc, yc;
    float radi, radiStep;
    float angle, angleStep;

    public static void main(String[] args) {
        PApplet.main("motion.SpiralMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        xc = width/2; yc = height/2;
        radi = 0; radiStep = 0.25f;
        angle = 0; angleStep = 1;
    }

    public void draw(){
        //background(255);
        x = xc + radi*cos(radians(angle));
        y = yc + radi*sin(radians(angle));
        angle += angleStep;
        radi += radiStep;
        circle(x, y, d);

        if(radi>width/2){
            radi = 0;
            angle = 0;
        }
    }
}
