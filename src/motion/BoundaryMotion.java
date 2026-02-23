package motion;

import processing.core.PApplet;

public class BoundaryMotion extends PApplet {

    float x, y, d=100;
    float step = 5;
    float xDir, yDir;

    public static void main(String[] args) {
        PApplet.main("motion.BoundaryMotion");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        x = width/2; y = height/2; // Posició inicial
        xDir = random(-1, 1); yDir = random(-1, 1);
    }

    public void draw(){
        background(255);
        circle(x, y, d);

        x += step * xDir;
        y += step * yDir;

        if( y <= d/2  || y >= height - d/2){
            yDir *= -1;
        }
        if( x <= d/2  || x >= width - d/2){
            xDir *= -1;
        }
    }

    public void mousePressed(){
        x = width/2; y = height/2; // Posició inicial
        xDir = random(-1, 1); yDir = random(-1, 1);
    }
}
