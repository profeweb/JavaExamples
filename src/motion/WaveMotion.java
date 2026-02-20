package motion;

import processing.core.PApplet;

public class WaveMotion extends PApplet {

    float x, y, d;
    float xStep, direction;
    float yb, amplitud, angle, angleStep;

    public static void main(String[] args) {
        PApplet.main("motion.WaveMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        x = 0; y = height/2; d = 50;
        xStep = 0.5f; direction = 1;
        yb = height/2; amplitud = 200;
        angle = 0; angleStep = 1;
    }

    public void draw(){
        circle(x, y, d);

        x += xStep*direction;
        if((x>width -d/2 && direction==1)|| (x<d/2 && direction==-1)){
            direction *= -1;
            background(255);
        }

        y = yb + amplitud * sin(radians(angle));
        angle += angleStep;
    }
}
