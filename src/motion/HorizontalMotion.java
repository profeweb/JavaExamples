package motion;

import processing.core.PApplet;

public class HorizontalMotion extends PApplet {

    float x, y, d=100;
    float xStep = 5;
    int direction = 1;

    public static void main(String[] args) {
        PApplet.main("motion.HorizontalMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        x = width/2; y = height/2; // Posició inicial
    }

    public void draw(){
        background(255);
        circle(x, y, d);
        x += xStep * direction;
        if((direction==1 && x >= width-d/2) || (direction==-1 && x<=d/2)){
            direction *= -1;
        }
    }
}
