package poo.exempleClasse;

public class ProvaProfe {

    public static void main(String[] args) {

        Professor p1, p2;

        p1 = new Professor("Paco", 33, Professor.ASSIGNATURA.FISICA);
        p2 = new Professor("Pep", 44, Professor.ASSIGNATURA.ANGLES);

        p1.setNom("Xisco");

        System.out.println("El més vell és "+p1.getNomMesVell(p2));

        p1.imprimir();
        p2.imprimir();
    }
}
