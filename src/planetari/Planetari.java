package planetari;

import peasy.PeasyCam;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.core.PShape;

public class Planetari extends PApplet {

    // Array de cossos astronòmics
    CosAstronomic[] astres;

    // Número de Cossos Astronòmics
    int numTotalAstres = 11;

    // Número de l'Astre seleccionat
    int numAstre = 0;

    // Elements Interfície Gràfica
    public Boto bPlay, bPause, bPrev, bNext, bInfo, bZoomIn, bZoomOut;
    PShape panell; // Panell de dades (SVG)
    PFont font1, font2; // Fonts (TTF o OTF)
    PImage imgFons;  // Imatge de fons (JPG)

    boolean showPanel = true;
    boolean enableMotion = true;
    boolean viewOrbits = true;

    PeasyCam cam;
    float zoomLevel = 1000f;

    public void settings(){
        fullScreen(P3D);
    }

    public static void main(String[] args){
        PApplet.main("planetari.Planetari");
    }

    public void setup(){

        cam = new PeasyCam(this,2000);

        // Carrega la imatge SVG del panell informatiu
        panell = loadShape("panel.svg");

        // Carrega la imatge JPG del fons del planetari
        imgFons = loadImage("fons.jpg");

        // Carrega les fonts TTF dels textos panell informatiu
        font1 = createFont("fonts/Starge.ttf", 40);
        font2 = createFont("fonts/Nasa.ttf", 24);

        // Crea els botons de la Interfície Gràfica
        bPlay    = new Boto(this, "botons/bPlayOn.svg", "botons/bPlayOut.svg", 100, height - 100, 30);
        bPause   = new Boto(this, "botons/bPauseOn.svg", "botons/bPauseOut.svg", 160, height - 100, 30);
        bPrev    = new Boto(this, "botons/bPrevOn.svg", "botons/bPrevOut.svg", 220, height - 100, 30);
        bNext    = new Boto(this, "botons/bNextOn.svg", "botons/bNextOut.svg", 280, height - 100, 30);
        bInfo    = new Boto(this, "botons/bInfoOn.svg", "botons/bInfoOut.svg", 340, height - 100, 30);
        bZoomIn  = new Boto(this, "botons/bZoomInOn.svg", "botons/bZoomInOut.svg", width-200, height - 100, 30);
        bZoomOut = new Boto(this, "botons/bZoomOutOn.svg", "botons/bZoomOutOut.svg", width-120, height - 100, 30);

        // Creació de l'Array de Cossos Astronòmics
        astres = new CosAstronomic[numTotalAstres];

        // Instanciació del Sol (Estrella)
        Estrella sol = new Estrella("Sol", "2609", 'G', -26.8f );
        sol.setImatge(this, "planetes/sun.svg");
        sol.setPosicio(0, 0, -10);
        sol.setPropsFisiques(1.9891e30, 1.4123e18, 1.41, 274, 696340);
        sol.setPropsOrbitals(0.1628, 2.25e18, 27, 0);
        sol.setTemperatura(5778);
        sol.setIndexColorUB(274);
        // Guardar el Sol a l'array d'astres
        astres[0] = sol;

        // Instanciació de Mercuri (Planeta)
        Planeta mercuri = new Planeta("Mercuri", "2641", Planeta.TipusPlaneta.ROCOS, sol);
        mercuri.setImatge(this, "planetes/mercury.svg");
        mercuri.setPosicio(1*width/3, height/3, 0);
        mercuri.setPropsFisiques(3.285e23, 6.083e10, 5430, 3.7, 2439.7);
        mercuri.setPropsOrbitals(0.387, 88, 58.645833, 0.2056306);
        mercuri.setRadiOrbita(100);
        // Guardar Mercuri a l'array d'astres
        astres[1] = mercuri;

        // Instanciació de Venus (Planeta)
        Planeta venus = new Planeta("Venus", "2640", Planeta.TipusPlaneta.ROCOS, sol);
        venus.setImatge(this, "planetes/venus.svg");
        venus.setPosicio(1*width/3, 1*height/2, 0);
        venus.setPropsFisiques(4.867e24, 9.38e11, 5240, 8.87, 6051.8);
        venus.setPropsOrbitals(0.723, 225, 116.75, 0.007);
        venus.setRadiOrbita(200);
        // Guardar Venus a l'array d'astres
        astres[2] = venus;

        // Instanciació de la Terra (Planeta)
        Planeta terra = new Planeta("Terra", "2641", Planeta.TipusPlaneta.ROCOS, sol);
        terra.setImatge(this, "planetes/earth.svg");
        terra.setPosicio(1*width/3, 2*height/3, 0);
        terra.setPropsFisiques(5.973e24, 1.0832e12, 5.515, 9.780327, 6378.1);
        terra.setPropsOrbitals(0.9998555, 365.25, 0.99726, 0.016711233);
        terra.setRadiOrbita(300);
        // Guardar la Terra a l'array d'astres
        astres[3] = terra;

        // Instanciació d'un Satèl·lit
        Satellit lluna = new Satellit("Lluna", "263E", Satellit.TipusSatelit.NATURAL, terra);
        lluna.setImatge(this, "planetes/moon.svg");
        lluna.setPosicio(1*width/3 -200, 2*height/3, 0);
        lluna.setPropsFisiques(7.349e22, 2.1958e10, 3.34, 1.62, 1737.1);
        lluna.setPropsOrbitals(2.5695552e-6, 27.321527, 0.99726, 0.044);
        lluna.setRadiOrbita(100);
        // Guardar la Lluna a l'array d'astres
        astres[4] = lluna;

        // Instanciació de Mart (Planeta)
        Planeta mart = new Planeta("Mart", "2642", Planeta.TipusPlaneta.ROCOS, sol);
        mart.setImatge(this, "planetes/mars.svg");
        mart.setPosicio(width/2, 1*height/3, 0);
        mart.setPropsFisiques(6.4185e23, 1.6318e11, 3.9335, 3.711, 3389.5);
        mart.setPropsOrbitals(1.523662, 686.971, 0.093315, 0.093315);
        mart.setRadiOrbita(400);
        // Guardar Mart a l'array d'astres
        astres[5] = mart;

        // Instanciació de Júpiter (Planeta)
        Planeta jupiter = new Planeta("Júpiter", "2643", Planeta.TipusPlaneta.GASOS, sol);
        jupiter.setImatge(this, "planetes/jupiter.svg");
        jupiter.setPosicio(width/2, 2*height/3, 0);
        jupiter.setPropsFisiques(1.899e27, 1.4313e15, 1336, 24.79, 71492);
        jupiter.setPropsOrbitals(5.204267, 4332.71, 4332.71, 0.04839266);
        jupiter.setRadiOrbita(500);
        // Guardar Júpiter a l'array d'astres
        astres[6] = jupiter;

        // Instanciació de Saturn (Planeta)
        Planeta saturn = new Planeta("Saturn", "2644", Planeta.TipusPlaneta.GASOS, sol);
        saturn.setImatge(this, "planetes/saturn.svg");
        saturn.setPosicio(2*width/3, 1*height/3, 0);
        saturn.setPropsFisiques(5.688e26, 8.27e23, 690, 10.44, 58232);
        saturn.setPropsOrbitals(9.537, 378.1, 0.4400231, 0.05648);
        saturn.setRadiOrbita(600);
        // Guardar Saturn a l'array d'astres
        astres[7] = saturn;

        // Instanciació de Urà (Planeta)
        Planeta ura = new Planeta("Urà", "2645", Planeta.TipusPlaneta.GASOS, sol);
        ura.setImatge(this, "planetes/uranus.svg");
        ura.setPosicio(2*width/3, 1*height/2, 0);
        ura.setPropsFisiques(8.681e25, 6.833e13, 1274, 8.87, 25362);
        ura.setPropsOrbitals(19.18, 369.66, 0.714, 0.04405586);
        ura.setRadiOrbita(700);
        // Guardar Urà a l'array d'astres
        astres[8] = ura;

        // Instanciació de Neptú (Planeta)
        Planeta neptu = new Planeta("Neptú", "2646", Planeta.TipusPlaneta.GASOS, sol);
        neptu.setImatge(this, "planetes/neptun.svg");
        neptu.setPosicio(2*width/3, 2*height/3, 0);
        neptu.setPropsFisiques(1.024e26, 6.254e23, 1.64, 11.15, 24624);
        neptu.setPropsOrbitals(30.1, 60190, 0.67152777, 0.011214269);
        neptu.setRadiOrbita(800);
        // Guardar Neptú a l'array d'astres
        astres[9] = neptu;

        // Instanciació de Plutó (Planeta)
        Planeta pluto = new Planeta("Plutó", "2647", Planeta.TipusPlaneta.NAN, sol);
        pluto.setImatge(this, "planetes/pluto.svg");
        pluto.setPosicio(2*width/3 + 200, 1*height/2, 0);
        pluto.setPropsFisiques(1.25e22, 8.27e23, 1750, 0.6, 1195);
        pluto.setPropsOrbitals(29.67, 90580.065, 6.375, 0.244);
        pluto.setRadiOrbita(900);
        // Guardar Plutó a l'array d'astres
        astres[10] = pluto;

    }

    public void draw(){

        background(0);

        // Dibuixa la imatge de fons
        imageMode(CENTER);
        pushMatrix();
        translate(0, 0, -100);
        image(imgFons, 0, 0, 4*width, 4*height);
        popMatrix();

        // Dibuixa els cossos astronòmics
        int pos = 1;
        for(int i=0; i<numTotalAstres; i++) {
            astres[i].display(this);

            if(enableMotion) {
                // Moviment Orbital
                // Si el cos és un Planeta, ha d'orbitar respecte del sol
                if (astres[i] instanceof Planeta) {
                    //astres[i].orbita(astres[0]);
                    astres[i].orbita(this, astres[0], pos, viewOrbits);
                    pos++;
                } else if (astres[i] instanceof Satellit) {
                    astres[i].orbita(astres[3]);
                }

                // Moviment Rotació (excepte del sol)
                if (!(astres[i] instanceof Estrella)) {
                    astres[i].rota();
                }
            }
        }

        // Inici del HUD (dibuix en 2D)
        cam.beginHUD();

            // Dibuixa el panell informatiu
            if(showPanel) {
                displayInfo(50, 50, astres[numAstre]);
            }

            // Dibuixa els botons
            bPlay.display(this); bPause.display(this);
            bPrev.display(this); bNext.display(this); bInfo.display(this);
            bZoomIn.display(this); bZoomOut.display(this);
        cam.endHUD();
        // Final del  HUD
    }

    void displayInfo(float x, float y, CosAstronomic c){

        // Dibuixa el fons del panell informatiu
        shapeMode(CORNER);
        shape(panell, x, y);

        // Dibuixa la imatge del planeta
        shapeMode(CENTER);
        shape(c.img, x + 60, y+55, 80, 80);

        // Variables per definir el marge esquerre i l'altura entre línies.
        float marginLeft = 80, lineHeight = 45;

        // Font pel NOM del Cos Astronòmic
        fill(20, 96, 88); textSize(40); textAlign(LEFT); textFont(font1);

        // Dibuixa el NOM del Cos Astronòmic
        text(c.nom, x + 140, y + 80);

        // Font per al TIPUS de Cos Astronòmic
        fill(50); textSize(24); textAlign(LEFT); textFont(font2);

        // Dibuixa el TIPUS del cos astronòmic
        text(c.tipus.toString(), x + 140, y + 120);

        // Font per la resta de textos
        fill(255,20,20); textSize(24); textAlign(LEFT); textFont(font2);

        // Dibuixa les dades del cos astronòmic (bloc 1)
        if( c instanceof Estrella){
            Estrella e = (Estrella) c;
            text(e.tipusEspectral, x + marginLeft, y + 210 +  lineHeight*0);
            text(e.brillo, x + marginLeft, y + 210 +  lineHeight*1);
            text(e.temperatura+" ºK", x + marginLeft, y + 210 +  lineHeight*2);
            text(e.indexColorUB, x + marginLeft, y + 210 +  lineHeight*3);
        }
        else if( c instanceof Planeta){
            Planeta p = (Planeta) c;
            text(p.tipusPlaneta.toString(), x + marginLeft, y + 210 +  lineHeight*0);
            text(p.estrella.nom, x + marginLeft, y + 210 +  lineHeight*1);
            String txtAnells = p.anells ? "Amb anells" : "Sense anells";
            text(txtAnells, x + marginLeft, y + 210 +  lineHeight*2);
            text(p.numSatellits+" llunes", x + marginLeft, y + 210 +  lineHeight*3);
        }
        else if( c instanceof Satellit){
            Satellit s = (Satellit) c;
            text(s.tipusSatelit.toString(), x + marginLeft, y + 210 +  lineHeight*0);
            text(s.planeta.nom, x + marginLeft, y + 210 +  lineHeight*1);
            text(String.format("%.3e", s.pressio)+" Pa", x + marginLeft, y + 210 +  lineHeight*2);
            text(String.format("%.2f", s.temperatura)+" ºK", x + marginLeft, y + 210 +  lineHeight*3);
        }

        // Dibuixa les dades del cos astronòmic (bloc 2 - propietats físiques)

        text(String.format("%.5e", c.masa)+" kg", x + marginLeft, y + 440 + lineHeight*0);
        text(String.format("%.4e", c.volum)+" km3", x + marginLeft, y + 440 + lineHeight*1);
        text(String.format("%.2e", c.densitat)+" kg/m3", x + marginLeft, y + 440 + lineHeight*2);
        text(String.format("%.3f", c.gravetat)+ " m/s2", x + marginLeft, y + 440 + lineHeight*3);

        // Dibuixa les dades del cos astronòmic (bloc 3 - propietats orbitals)
        text(String.format("%.5f", c.radiOrbita)+" ua", x + marginLeft, y + 655 + lineHeight*0);
        text(String.format("%.4e", c.periodeOrbita)+ " d", x + marginLeft, y + 655 + lineHeight*1);
        text(String.format("%.5f", c.periodeRotació) + " d", x + marginLeft, y + 655 + lineHeight*2);
        text(String.format("%.5f", c.excentricitat), x + marginLeft, y + 655 + lineHeight*3);
    }

    public void mousePressed(){
        // Detecta si pitjam damunt algun dels botons
        if(bPlay.mouseDinsBoto(this)){
            println("PLAY");
            enableMotion = true;
        }
        else if(bPause.mouseDinsBoto(this)){
            println("PAUSE");
            enableMotion = false;
        }
        else if(bPrev.mouseDinsBoto(this)){
            println("PREV");
            numAstre--;
            if(numAstre<0){
                numAstre = numTotalAstres-1;
            }
        }
        else if(bNext.mouseDinsBoto(this)){
            println("NEXT");
            numAstre++;
            if(numAstre >= numTotalAstres){
                numAstre = 0;
            }
        }
        else if(bInfo.mouseDinsBoto(this)){
            println("INFO");
            showPanel = !showPanel;
        }
        else if(bZoomIn.mouseDinsBoto(this)){
            println("ZOOM IN");
            zoomLevel -= 200;
            cam.setDistance(zoomLevel);
        }
        else if(bZoomOut.mouseDinsBoto(this)){
            println("ZOOM OUT");
            zoomLevel += 200;
            cam.setDistance(zoomLevel);
        }
    }
}
