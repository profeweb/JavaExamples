package poo.exempleClasse;

public class ProvaAlumne {

    public static void main(String[] args) {

         Alumne a, b;  // Declaració de variables Alumne

        a = new Alumne("Paco", 2, 'F');
        b = new Alumne("Pep");

        a.setNom("Francisco");
        b.setCursGrup(4, 'F');

        String nomA = a.getNom();
        System.out.println(nomA);

        a.imprimir();
        b.imprimir();
    }
}
