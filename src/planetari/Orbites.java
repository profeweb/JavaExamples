package planetari;

import processing.core.PApplet;

public class Orbites extends PApplet {

    Estrella sol;
    Planeta terra;
    Satellit lluna;

    public void settings(){
        size(1000,1000, P3D);
    }

    public static void main(String[] args) {
        PApplet.main("planetari.Orbites");
    }

    public void setup(){

        sol = new Estrella("Sol", "2609", 'G', -26.8f );
        sol.setImatge(this, "planetes/sun.svg");
        sol.setPosicio(width/2, height/2, 0);

        terra = new Planeta("Terra", "2641", Planeta.TipusPlaneta.ROCOS, sol);
        terra.setImatge(this, "planetes/earth.svg");
        terra.setPosicio(1*width/3, 2*height/3, 0);
        terra.setRadiOrbita(300);
        terra.setAngleStep(0.01f);
        terra.setRotaStep(0.025f);

        lluna = new Satellit("Lluna", "263E", Satellit.TipusSatelit.NATURAL, terra);
        lluna.setImatge(this, "planetes/moon.svg");
        lluna.setPosicio(1*width/3 -200, 2*height/3, 0);
        lluna.setRadiOrbita(150);
        lluna.setAngleStep(0.05f);
        lluna.setRotaStep(0.01f);
    }

    public void draw(){
        background(200);

        sol.display(this);
        terra.display(this);
        lluna.display(this);

        terra.orbita(sol);
        terra.rota();

        lluna.orbita(terra);
        lluna.rota();
    }
}
