package poo.alumnes;

public class ExempleClasseAlumne {

    public static void main(String[] args){

        // Cridades als constructors
        Alumne a = new Alumne("Paco", 1, 'D');
        Alumne b = new Alumne("Pep", 2, 'A');
        Alumne c = new Alumne("Jaume");

        // Aplicam setters
        a.setNom("Paquito");
        b.setCursGrup(3, 'C');

        // Utilitzam un getter
        String nMaj = a.getNom().toUpperCase();
        System.out.println(nMaj);

        // Imprimim informació dels Alumnes
        a.print();
        b.print();
        c.print();

    }
}
