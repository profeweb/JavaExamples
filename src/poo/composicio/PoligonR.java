package poo.composicio;

public class PoligonR {

    Punt2D[] punts;
    Punt2D centre;
    float radi;

    PoligonR(Punt2D c, float r, int n){
        this.centre = c;
        this.radi = r;
        punts = new Punt2D[n];

        float angle = 0;
        for(int i=0; i<punts.length; i++){
            float x = (float)(centre.x + radi*Math.cos(angle));
            float y = (float)(centre.y + radi*Math.sin(angle));
            punts[i] = new Punt2D(x, y);
            angle += 2*Math.PI / n;
        }
    }

    /*
    void display(color c){

        fill(c);
        beginShape();
        for(int i=0; i<punts.length; i++){
            vertex(punts[i].x, punts[i].y);
        }
        endShape(CLOSE);

        for(int i=0; i<punts.length; i++){
            punts[i].display();
        }
    }

     */


}
