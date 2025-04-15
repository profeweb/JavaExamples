package poo.poligons;

import static processing.core.PApplet.*;
import static processing.core.PApplet.radians;

public class Estrella extends Poligon{

    float radiInterior;

    Estrella(Punt2D c, float radiInterior, float radiExterior){
        super(12, c, radiExterior);
        updatePuntsInteriors(c);
        this.radiInterior = radiInterior;
    }

    public void setRadiInterior(float r){ this.radiInterior = r; }

    public void updatePuntsInteriors(Punt2D c){
        float angStep = 360f / 12;
        float ang = 0;
        for(int i=0; i< punts.length; i+=2){
            punts[i].x = c.x + radiInterior*cos(radians(ang));
            punts[i].y = c.y + radiInterior*sin(radians(ang));
            ang += 2*angStep;
        }
    }

}
