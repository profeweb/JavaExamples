package tad;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {

        // Declaració de Llistes de Nodes
        LinkedList<Integer> llistaNums;
        LinkedList<Character> llistaLletres;
        int[] array;

        // Creació / instanciació
        llistaNums = new LinkedList<>();
        llistaLletres = new LinkedList<>();
        array = new int[10];

        // Afegir elements a la llista (addElement)
        llistaNums.add(22);
        llistaNums.add(13);
        llistaLletres.add('A');
        array[0] = 7;

        // isEmpty
        boolean esBuida = llistaNums.isEmpty();

        // numElements
        int num = llistaNums.size();

        // removeElement
        llistaNums.remove(0);

        // Accedir a objecte d'una posició
        int primer = llistaNums.get(0);

        // Recórrer l'array-list
        for(int i=0; i<llistaNums.size(); i++){
            System.out.println(llistaNums.get(i));
        }

        for(Integer i : llistaNums){
            System.out.println(i);
        }


    }
}
