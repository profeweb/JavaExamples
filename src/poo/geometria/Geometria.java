package poo.geometria;

import processing.core.PApplet;

public class Geometria extends PApplet {

    // Check de Class Punt
    Punt p1, p2, p3, p4;
    Linia l1, l2;
    Triangle t1;

    public static void main(String[] args){
        PApplet.main("poo.geometria.Geometria");
    }

    public static float distancia(float x1, float y1, float x2, float y2){
        float x = (float) Math.pow((x1 - x2), 2);
        float y = (y1 - y2)*(y1 - y2);
        return (float) Math.sqrt(x+y);
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        p1 = new Punt(50, 50);
        p2 = new Punt('A', 200, 150);
        p3 = new Punt('B',300, 450);
        p4 = new Punt('C',100, -25);

        float d12 = distancia(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        System.out.println("Distancia Funció: "+ d12);

        double d = p1.distancia(p2);
        System.out.println("Distancia Mètode: "+ d);

        p1.print();
        p2.print();

        // Check de Classe Línia
        l1 = new Linia(p1, p2);
        l2 = new Linia(new Punt(10, 10), new Punt(20, 50));
        l1.print();
        System.out.printf("Llargada de línea L1: %f.\n", l1.llargada());

        // Check de Classe Triangle
        t1 = new Triangle(p1, p2, new Punt('C', 100, 300));
        t1.print();

        // Check de Classe Triangle2
        //Triangle2 t2 = new Triangle2(p1, p2, new Punt(15, 25));
        //t2.print();

        // Check de Classe Polígon
        //Poligon pol1 = new Poligon(p1, p2, p3);
        //Poligon pol2 = new Poligon(p1, p2, p3, p4);
        //pol2.print();
    }

    public void draw(){
        background(255);
        //p1.display(this);

        //l1.display(this);

        t1.display(this);
    }

}
