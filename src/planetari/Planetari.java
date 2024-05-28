package planetari;

import processing.core.PApplet;

public class Planetari extends PApplet {

    CosAstronomic[] cossos;

    Boto b;

    public void settings(){
        size(1000, 800, P3D);
    }

    public static void main(String[] args){
        PApplet.main("planetari.Planetari");
    }

    public void setup(){

        // PApplet p5, String i1, String i2, float x, float y, float r
        b = new Boto(this, "botons/bInfoOn.svg", "botons/bInfoOut.svg", 200, 200, 50);

        cossos = new CosAstronomic[12];

        // 1 Estrella
        cossos[0] = new Estrella ( "Sol", "2609", 'G', -26.8f );
        cossos[0].setImatge(this, "planetes/sun.svg");

        // 2 Planetes
        cossos[1] = new Planeta( "Terra" , "2641" , Planeta.TipusPlaneta.ROCOS, (Estrella)cossos[0]);
        cossos[2] = new Planeta( "Mart" , "2642" , Planeta.TipusPlaneta.ROCOS, (Estrella)cossos[0]);

        // 2 Satèlits
        cossos[3] = new Satellit("Lluna", "2600", Satellit.TipusSatelit.NATURAL, (Planeta)cossos[1]);
        cossos[4] = new Satellit("Deimos", "0000", Satellit.TipusSatelit.NATURAL, (Planeta)cossos[2]);

        // Imprimir els planetes creats
        for(int i=0; i<cossos.length; i++) {
            if(cossos[i]!=null && cossos[i].tipus== CosAstronomic.Tipus.PLANETA) {
                cossos[i].print();
            }
        }

        // Imprimir els satèl·lits creats
        for(int i=0; i<cossos.length; i++) {
            if(cossos[i]!=null && cossos[i] instanceof Satellit) {
                cossos[i].print();
            }
        }

    }

    public void draw(){
        background(255, 100, 100);

        cossos[0].display(this);

        b.display(this);
    }
}
