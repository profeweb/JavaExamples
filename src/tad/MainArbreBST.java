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
        creaArbreBST();
    }

    public void creaArbreBST(){

        // Càlcul del màxim i mínim de l'arbre
        arbreBST = new ArbreBST();
        for(int t=0; t<10; t++){
            int nr = (int)random(0, 100);
            arbreBST.addElement(nr);
        }

        // Càlcul del màxim i mínim de l'arbre
        valorMaxim = arbreBST.getMaxim();
        valorMinim = arbreBST.getMinim();

        // Cerca dins l'arbre BST
        cercaArbreBST();

        //Recorreguts
        traversingArbreBST();

    }

    public void traversingArbreBST(){
        // Recorreguts
        arbreBST.inordre();
        arbreBST.preordre();
        arbreBST.postordre();
        arbreBST.revers();
        arbreBST.bfs(arbreBST.arrel, -1);
    }

    public void cercaArbreBST(){
        // Valor a cercar en l'arbre
        valorCerca = (int) random(0, 100);

        // Resultat de la cerca
        resultatCerca = arbreBST.cercaElement(valorCerca, arbreBST.arrel);
    }

    public void draw(){
        background(255);

        // Dibuixa l'arbre BST
        arbreBST.display(this, arbreBST.arrel, width/2, 100, 50, 0);

        // Dibuixa els valors mínim, màxim i resultat de cerca
        fill(0); textSize(18); textAlign(LEFT);
        text("MINIM: "+valorMinim, 100, 100);
        text("MAXIM: "+valorMaxim, 100, 140);
        text("CERCA: "+valorCerca+", RESULTAT: "+ resultatCerca, 100, 180);
    }

    public void keyPressed(){
        if(key=='a' || key=='A') {
            creaArbreBST();
        }
        else if(key=='c' || key=='C'){
            cercaArbreBST();
        }
    }
}
