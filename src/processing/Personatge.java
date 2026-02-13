package processing;

import processing.core.PApplet;
import processing.core.PImage;

public class Personatge {

    //Atributs
    PImage[] img;
    int numFrame = 0;
    int speedImatge, speedX;
    float x, y ;
    int direccio;

    public Personatge(float x, float y, int direccio, int speedImg, int speedX){
        this.x = x; this.y = y; this.direccio = direccio;
        this.speedImatge = speedImg; this.speedX =speedX;
    }

    public void loadImages(PApplet p5, int numImages, int numCarpeta, String nomImg){
        img = new PImage[numImages];
        for(int i=0; i<img.length; i++) {
            img[i] = p5.loadImage("Personatge "+numCarpeta+"\\"+nomImg+i+".png");
        }
    }

    public void display(PApplet p5){
        p5.tint(150, 250, 150);
        p5.pushMatrix();
        p5.translate(x, y);
        p5.scale(direccio, 1);
        p5.image(img[numFrame],0, 0);
        p5.popMatrix();
    }

    public void move(PApplet p5){
        x+= speedX*direccio;
        if((x + img[numFrame].width>=p5.width && direccio==1) ||
                (x<=img[numFrame].width && direccio==-1)){
            direccio *= -1;
        }
    }

    public void updateFrame(PApplet p5){
        if(p5.frameCount% speedImatge ==0) {
            numFrame++;
            if (numFrame == 8) {
                numFrame = 0;
            }
        }
    }


}
