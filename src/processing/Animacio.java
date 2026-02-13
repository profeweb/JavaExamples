package processing;

import processing.core.PApplet;
import processing.core.PImage;

public class Animacio extends PApplet {

    PImage[] img;
    int numFrame = 0;
    int speed = 15;
    float x = 0, y = 400;
    int direccio = 1;

    public static void main(String[] args) {
        PApplet.main("processing.Animacio");
    }

    public void settings(){ size(800, 800); }

    public void setup(){
        loadImages();
    }

    public void draw(){
        background(200, 100, 100);
        display();
        move();
        updateFrame();
    }

    public void display(){
        tint(150, 250, 150);
        pushMatrix();
        translate(x, y);
        scale(direccio, 1);
        image(img[numFrame],0, 0);
        popMatrix();
    }

    public void move(){
        x+= 5*direccio;
        if((x + img[numFrame].width>=width && direccio==1) ||
                (x<=img[numFrame].width && direccio==-1)){
            direccio *= -1;
        }
    }

    public void updateFrame(){
        if(frameCount%speed ==0) {
            numFrame++;
            if (numFrame == 8) {
                numFrame = 0;
            }
        }
    }

    public void loadImages(){
        img = new PImage[8];
        for(int i=0; i<img.length; i++) {
            img[i] = loadImage("Personatge 1\\frame"+i+".png");
        }
    }
}
