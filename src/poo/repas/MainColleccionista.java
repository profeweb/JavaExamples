package poo.repas;

public class MainColleccionista {

    public static void main(String[] args) {

        // Array de 3 elements
        Element[] elements = new Element[3];
        elements[0] = new Element("XAPA1", "SPAIN");
        elements[1] = new Element("SEGELL1", "UK");
        elements[2] = new Element("XAPA2", "USA");

        // Col·leccionista C1 amb 1 segell i 1 xapa
        Colleccionista c1 = new Colleccionista("PACO", 23);
        c1.addSegell(new Segell("SEGELL1", 12.50, 150));
        c1.addXapa(new Xapa("XAPA1", 75.50, 50));

        // Col·leccionista C2 amb 0 segells i 1 xapa
        Colleccionista c2 = new Colleccionista("MARIA", 93);
        Xapa x2 = new Xapa("XAPA2", 25.50, 45);
        c2.addXapa(x2);

        // Preu total de la col·lecció de C1
        double preu = c1.preuTotalColleccio();
        System.out.println("Preu total de la col·lecció: "+ preu);

        // Pais d'origen de la xapa de nom "XAPA2"
        String pais = Colleccionista.getPaisXapa(x2, elements);
        System.out.println("Pais de la xapa: "+ pais);

    }

}
