package poo.geometria;

public class Poligon {

    Punt[] punts;

    Poligon(Punt ... ps){
        punts = new Punt[ps.length];
        for(int i=0; i<punts.length; i++){
            punts[i] = ps[i];
        }
    }

    Poligon(Punt centre, float radi, int numPunts){
        punts = new Punt[numPunts];
        float angle = 0;
        for(int i=0; i<punts.length; i++){
            double x = centre.x + radi*Math.cos(angle);
            double y = centre.y + radi*Math.sin(angle);
            punts[i] = new Punt((float)x, (float)y);
            angle += 2*Math.PI / numPunts;
        }
    }


    int getNumPunts(){
        return punts.length;
    }

    void print(){
        System.out.printf("Polígon format per %d punts:\n", getNumPunts());
        for(int i=0; i<punts.length; i++){
            punts[i].print();
        }
    }
}