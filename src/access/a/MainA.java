package access.a;

public class MainA {

    public static void main(String[] args) {

        A a = new A(10, "Paco", 'A');
        System.out.println(a.edat);  // accés públic
        System.out.println(a.grup);  // accés protegit
        System.out.println(a.nom);  // accés privat


    }

}
