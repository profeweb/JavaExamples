package poo.alumnes;

public class ExempleClasseAlumne {

    public static void main(String[] args){

        // Cridades als constructors
        Alumne a = new Alumne("Paco", 1, 'D');
        Alumne b = new Alumne("Pep", 2, 'A');
        Alumne c = new Alumne("Jaume");

        // Aplicam setters per modificar els atributs dels alumnes
        a.setNom("Paquito");
        b.setCursGrup(3, 'C');

        // Utilitzam getters per obtenir informació dels alumnes
        String nMaj = a.getNom().toUpperCase();
        System.out.println(nMaj);

        // Imprimim informació dels alumnes
        a.print();
        b.print();
        c.print();

    }
}
