package poo.temp2;

import poo.geometria.Punt;
import processing.core.PApplet;

public class MainCercles extends PApplet {

    Cercle c1, c2, c3;

    public static void main(String[] args) {
        PApplet.main("poo.temp2.MainCercles");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        Punt2D p1 = new Punt2D('A', width/2, height/2);
        c1 = new Cercle(p1, 300);

        c2 = new Cercle(new Punt2D('B', width/4, height/3), 200);

        if(c1.tocar(c2)){
            println("Se toquen!!!");
        }
        else {
            println("No se toquen");
        }
    }

    public void draw(){
        background(255);
        c1.display(this);
        c2.display(this);
        if(c3!=null) {
            c3.display(this);
        }
    }

    public void mousePressed(){
        Punt2D pMouse = new Punt2D('M', mouseX, mouseY);
        if(c3==null) {
            c3 = new Cercle(pMouse, 200);
        }
        else {
            c3.setCentre(pMouse);
            c3.setDiametre(random(100, 300));
        }

        boolean toca1o2 = c3.tocar(c1) || c3.tocar(c2);
        println("C3 toca a C1 o C2: "+ toca1o2);
    }

}
