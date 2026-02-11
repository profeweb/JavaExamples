package poo.geometria;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.PI;
import static processing.core.PConstants.TWO_PI;

public class Engranatge extends PoligonOK{

    Engranatge(int n, Punt centre, float radi1, float radi2){
        super(n);
        float angle = 3*PI/2;
        for(int i=0; i<n; i++){
            float radi = i%4<2 ? radi2 : radi1;
            float x = centre.x + radi * cos(angle);
            float y = centre.y + radi * sin(angle);
            Punt p = new Punt(' ', x, y);
            this.setPuntAt(i, p);
            angle+=TWO_PI/n;
        }
    }
}
