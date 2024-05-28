package planetari;

import processing.core.PApplet;
import processing.core.PShape;

public class Boto {

    PShape imgOn, imgOut;
    float x, y;
    float radi;

    public Boto(PApplet p5, String i1, String i2, float x, float y, float r){
        this.imgOn = p5.loadShape(i1);
        this.imgOut = p5.loadShape(i2);
        this.x = x; this.y = y;
        this.radi = r;
    }

    public boolean mouseDinsBoto(PApplet p5){
        return p5.dist(p5.mouseX, p5.mouseY, x, y)<radi;
    }

    public void display(PApplet p5){
        p5.pushMatrix();
            p5.translate(x, y, 0);
            p5.shapeMode(p5.CENTER);
            if(mouseDinsBoto(p5)){
                p5.shape(imgOn, 0, 0, radi*2, radi*2);
            }
            else {
                p5.shape(imgOut, 0, 0, radi*2, radi*2);
            }
        p5.popMatrix();
    }


}
