package access.a;

public class MainA {

    public static void main(String[] args) {

        // Cridada al constructor (mètode públic):
        A a = new A(10, "Paco", 'A');

        // Accés a propietats (pública, protegida i privada):

        System.out.println(a.edat);  // accés públic
        System.out.println(a.grup);  // accés protegit

        // Error! Accés privat no accessible fora de la pròpia classe.
        //System.out.println(a.nom);

        // Accés a  mètodes (públic, protegit i privat):

        a.print1();  // cridada a mètode públic
        a.print2();  // cridada a mètode protected

        // Error! Cridada a mètode privat no accessible fora de la pròpia classe.
        //a.print3();


    }

}
