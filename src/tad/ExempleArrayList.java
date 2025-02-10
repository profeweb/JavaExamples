package tad;

import java.util.ArrayList;

public class ExempleArrayList {

    public static void main(String[] args) {

        ArrayList<String> llistaCompra;  // Declaració

        llistaCompra = new ArrayList<>();  // Inicialització (Constructor)

        // Afegir elements
        llistaCompra.add("Pa");     // posició 0
        llistaCompra.add("Llet");   // posició 1
        llistaCompra.add("Verdura");  // posició 2

        System.out.println("NUM ELEMENTS: "+llistaCompra.size());

        // Eliminar elements
        llistaCompra.remove(2);

        System.out.println("NUM ELEMENTS: "+llistaCompra.size());
        System.out.println("ELEMENT AT 1: "+llistaCompra.get(1));

        // Recorregut de la llista (versió tradicional)
        for(int i=0; i<llistaCompra.size(); i++){
            System.out.println(llistaCompra.get(i));
        }

        // Recorregut de la llista (versió objectes)
        for(String producte : llistaCompra){
            System.out.println(producte);
        }

        // Eliminar tots els elements
        llistaCompra.clear();


    }
}
