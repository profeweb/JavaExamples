package poo.geometria;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.PI;
import static processing.core.PConstants.TWO_PI;

public class PoligonR extends Poligon{

    PoligonR(int n, Punt centre, float radi){
        super(n);
        float angle = 3*PI/2;
        for(int i=0; i<n; i++){
            float x = centre.getX() + radi * cos(angle);
            float y = centre.getY() + radi * sin(angle);
            char c = Integer.toString(i).charAt(0);
            Punt p = new Punt(c, x, y);
            this.setPuntAt(i, p);
            angle+=TWO_PI/n;
        }
    }
}
