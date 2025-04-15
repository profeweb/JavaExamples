package poo.poligons;

import static processing.core.PApplet.*;

public class Sol extends Poligon{

    float radiInterior;

    Sol(Punt2D c, float radiInterior, float radiExterior){
        super(33, c, radiExterior);
        updatePuntsInteriors(c);
        this.radiInterior = radiInterior;
    }

    public void setRadiInterior(float r){ this.radiInterior = r; }

    public void updatePuntsInteriors(Punt2D c){
        float angStep = 360f / punts.length;
        float ang = 0;
        for(int i=0; i< punts.length; i++){
            if(i%3>0) {
                punts[i].x = c.x + radiInterior * cos(radians(ang));
                punts[i].y = c.y + radiInterior * sin(radians(ang));
            }
            ang += angStep;
        }
    }

}
