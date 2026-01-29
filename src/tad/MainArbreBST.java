package tad;

import processing.core.PApplet;

public class MainArbreBST extends PApplet {

    ArbreBST arbreBST;
    int valorMaxim, valorMinim, valorCerca;
    boolean resultatCerca;

    public static void main(String[] args) {
        PApplet.main("tad.MainArbreBST");
    }

    public void settings(){
        size(1400, 800);
    }

    public void setup(){
        arbreBST = new ArbreBST();
        for(int t=0; t<10; t++){
            int nr = (int)random(0, 100);
            arbreBST.addElement(nr);
        }

        valorMaxim = arbreBST.getMaxim();
        valorMinim = arbreBST.getMinim();
        valorCerca = (int) random(0, 100);
        resultatCerca = arbreBST.cercaElement(valorCerca, arbreBST.arrel);
    }

    public void draw(){
        background(255);
        arbreBST.display(this, arbreBST.arrel, width/2, 100, 50, 0);

        fill(0); textSize(18); textAlign(LEFT);
        text("MINIM: "+valorMinim, 100, 100);
        text("MAXIM: "+valorMaxim, 100, 140);
        text("CERCA: "+valorCerca+", RESULTAT: "+ resultatCerca, 100, 180);
    }

    public void keyPressed(){
        if(key=='a' || key=='A') {
            arbreBST = new ArbreBST();
            for (int t = 0; t < 10; t++) {
                int nr = (int) random(0, 100);
                arbreBST.addElement(nr);
            }
            valorMaxim = arbreBST.getMaxim();
            valorMinim = arbreBST.getMinim();
            arbreBST.inordre();
            println();
            arbreBST.preordre();
            println();
            arbreBST.postordre();
            println();
            arbreBST.revers();
            println();
            arbreBST.bfs(arbreBST.arrel, -1);
        }
        else if(key=='c' || key=='C'){
            valorCerca = (int) random(0, 100);
            resultatCerca = arbreBST.cercaElement(valorCerca, arbreBST.arrel);
        }
    }
}
