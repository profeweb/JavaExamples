package planetari;

import processing.core.PApplet;
import processing.core.PShape;

public class Planetari extends PApplet {

    CosAstronomic[] cossos;

    // Botons de la interfície
    Boto bPlay, bPause, bPrev, bNext, bInfo, bZoomIn, bZoomOut;

    public void settings(){
        fullScreen(P3D);
    }

    public static void main(String[] args){
        PApplet.main("planetari.Planetari");
    }

    public void setup(){


        bPlay    = new Boto(this, "botons/bPlayOn.svg", "botons/bPlayOut.svg", 100, height - 100, 30);
        bPause   = new Boto(this, "botons/bPauseOn.svg", "botons/bPauseOut.svg", 160, height - 100, 30);
        bPrev    = new Boto(this, "botons/bPrevOn.svg", "botons/bPrevOut.svg", 220, height - 100, 30);
        bNext    = new Boto(this, "botons/bNextOn.svg", "botons/bNextOut.svg", 280, height - 100, 30);
        bInfo    = new Boto(this, "botons/bInfoOn.svg", "botons/bInfoOut.svg", 340, height - 100, 30);
        bZoomIn  = new Boto(this, "botons/bZoomInOn.svg", "botons/bZoomInOut.svg", width-200, height - 100, 30);
        bZoomOut = new Boto(this, "botons/bZoomOutOn.svg", "botons/bZoomOutOut.svg", width-120, height - 100, 30);

        cossos = new CosAstronomic[12];

        // 1 Estrella
        cossos[0] = new Estrella ( "Sol", "2609", 'G', -26.8f );
        cossos[0].setImatge(this, "planetes/sun.svg");
        cossos[0].setPosició(width/2, height/2, 0);

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

        displayInfo(50, 50, cossos[0]);

        cossos[0].display(this);

        // Dibuixa els botons
        bPlay.display(this); bPause.display(this);
        bPrev.display(this); bNext.display(this); bInfo.display(this);
        bZoomIn.display(this); bZoomOut.display(this);
    }

    void displayInfo(float x, float y, CosAstronomic c){

        // Dibuixa el fons del panell informatiu
        shapeMode(CORNER);
        PShape panell = loadShape("panel.svg");
        shape(panell, x, y);

        // Dibuixa la imatge del planeta
        shapeMode(CENTER);
        shape(c.img, x + 60, y+55, 80, 80);

        // Variables per definir el marge esquerre i l'altura entre línies.
        float marginLeft = 80, lineHeight = 45;

        // Font pel NOM del Cos Astronòmic
        fill(20, 96, 88); textSize(40); textAlign(LEFT); //textFont(font1);

        // Dibuixa el NOM del Cos Astronòmic
        text(c.nom, x + 140, y + 80);

        // Font per al TIPUS de Cos Astronòmic
        fill(50); textSize(24); textAlign(LEFT); //textFont(font2);

        // Dibuixa el TIPUS del cos astronòmic
        text(c.tipus.toString(), x + 140, y + 120);

        // Font per la resta de textos
        fill(255,20,20); textSize(24); textAlign(LEFT); //textFont(font2);

        // Dibuixa les dades del cos astronòmic (bloc 1)
        text("dada 1", x + marginLeft, y + 210 +  lineHeight*0);
        text("dada 2", x + marginLeft, y + 210 +  lineHeight*1);
        text("dada 3", x + marginLeft, y + 210 +  lineHeight*2);
        text("dada 4", x + marginLeft, y + 210 +  lineHeight*3);

        // Dibuixa les dades del cos astronòmic (bloc 2)
        text(String.valueOf(c.masa), x + marginLeft, y + 440 + lineHeight*0);
        text("dada 2", x + marginLeft, y + 440 + lineHeight*1);
        text("dada 3", x + marginLeft, y + 440 + lineHeight*2);
        text("dada 4", x + marginLeft, y + 440 + lineHeight*3);

        // Dibuixa les dades del cos astronòmic (bloc 3)
        text(String.valueOf(c.radiOrbita), x + marginLeft, y + 655 + lineHeight*0);
        text("dada 2", x + marginLeft, y + 655 + lineHeight*1);
        text("dada 3", x + marginLeft, y + 655 + lineHeight*2);
        text("dada 4", x + marginLeft, y + 655 + lineHeight*3);
    }

    public void mousePressed(){
        if(bPlay.mouseDinsBoto(this)){
            println("PLAY");
        }
        else if(bPause.mouseDinsBoto(this)){
            println("PAUSE");
        }
        else if(bPrev.mouseDinsBoto(this)){
            println("PREV");
        }
        else if(bNext.mouseDinsBoto(this)){
            println("NEXT");
        }
        else if(bInfo.mouseDinsBoto(this)){
            println("INFO");
        }
        else if(bZoomIn.mouseDinsBoto(this)){
            println("ZOOM IN");
        }
        else if(bZoomOut.mouseDinsBoto(this)){
            println("ZOOM OUT");
        }
    }
}
