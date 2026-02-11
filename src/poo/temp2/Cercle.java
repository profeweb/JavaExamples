package poo.temp2;

import processing.core.PApplet;

import static processing.core.PApplet.dist;

public class Cercle {

    Punt2D centre;
    float diametre;

    public Cercle(Punt2D centre, float diametre) {
        this.centre = centre;
        this.diametre = diametre;
    }

    public Punt2D getCentre() {
        return centre;
    }

    public void setCentre(Punt2D centre) {
        this.centre = centre;
    }

    public float getDiametre() {
        return diametre;
    }

    public void setDiametre(float diametre) {
        this.diametre = diametre;
    }

    public void display(PApplet p5){
        p5.strokeWeight(2); p5.stroke(255, 0, 0);
        p5.fill(255, 0, 0, 50);
        p5.circle(centre.x, centre.y, diametre);
        centre.display(p5);
    }

    public boolean tocar(Cercle altre){
        float radi = this.diametre / 2;
        float radiAltre = altre.diametre / 2;
        float d = dist(this.centre.x, this.centre.y, altre.centre.x, altre.centre.y);
        return d <= radi + radiAltre;
    }
}
