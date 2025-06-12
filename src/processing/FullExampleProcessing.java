package processing;

import processing.core.PApplet;
import processing.core.PFont;

public class FullExampleProcessing extends PApplet {

    // Variable global
    float diametre;
    int color, color1, color2;
    PFont font;

    public static void main(String[] args) {
        PApplet.main("processing.FullExampleProcessing");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        diametre = 300;
        color1 = color(200, 100, 100);
        color2 = color(100, 200, 100);
        color = color1;

        font = createFont("C:\\Users\\tonim\\IdeaProjects\\JavaExamples\\data\\fonts\\Starge.tff", 24);
    }

    public void draw(){
        background(255);
        fill(color); strokeWeight(5);
        circle(width/2, height/2, diametre);

        textSize(24); textAlign(CENTER); fill(0); textFont(font);
        text("Processing + IDEA", width/2, 100);
    }


    // Interacció amb teclat i ratolí
    public void mousePressed(){
        if(mouseButton==LEFT){
            diametre-=10;
        }
        else if(mouseButton==RIGHT){
            diametre+=10;
        }
    }

    public void keyPressed(){
        if(key=='1'){
            color = color1;
        }
        else if(key=='2'){
            color = color2;
        }
    }
}
