package motion;

import processing.core.PApplet;

public class VerticalMotion extends PApplet {

    float x, y, d = 100;
    float yStep = 5;
    int direction = 1;

    public static void main(String[] args) {
        PApplet.main("motion.VerticalMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        x = width/2; y = height/2;
    }

    public void draw(){
        background(255);
        circle(x, y, d);

        y += yStep*direction;
        if((direction == 1 && y >= height - d/2) || (direction == -1 && y < d/2)){
            direction *= -1;
        }
    }
}
