package poo.geometria;

public class Geometria {
    public static void main(String[] args){

        // Check de Class Punt
        Punt p1, p2, p3, p4;

        p1 = new Punt();
        p2 = new Punt(20, 15);
        p3 = new Punt(30, 45);
        p4 = new Punt(-10, -25);

        float d12 = distancia(p1.x, p1.y, p2.x, p2.y);
        System.out.println("Distancia Funció: "+ d12);

        double d = p1.distancia(p2);
        System.out.println("Distancia Mètode: "+ d);

        p1.print();
        p2.print();

        // Check de Classe Línia
        Linia l1 = new Linia(p1, p2);
        Linia l2 = new Linia(new Punt(10, 10), new Punt(20, 50));
        l1.print();
        System.out.printf("Llargada de lía L1: %f.\n", l1.llargada());

        // Check de Classe Triangle
        Triangle t1 = new Triangle(p1, p2, new Punt(10, 30));
        t1.print();

        // Check de Classe Triangle2
        Triangle2 t2 = new Triangle2(p1, p2, new Punt(15, 25));
        t2.print();

        // Check de Classe Polígon
        Poligon pol1 = new Poligon(p1, p2, p3);
        Poligon pol2 = new Poligon(p1, p2, p3, p4);
        pol2.print();
    }

    public static float distancia(float x1, float y1, float x2, float y2){
        float x = (float) Math.pow((x1 - x2), 2);
        float y = (y1 - y2)*(y1 - y2);
        return (float) Math.sqrt(x+y);
    }

}
