package poo.temp2;

public class MainAlumne {

    public static void main(String[] args) {

        Alumne a1, a2, a3;  // 1) Declaració
        a3 = null;

        Professor p1, p2;

        // 2) Instanciació / creació amb el(s) constructor(s)
        a1 = new Alumne("Paco", 3, 'F');
        a2 = new Alumne("Pep");

        p1 = new Professor("Joan", 35, "Física");
        p2 = new Professor("Maria", 44, "Català");

        // 3) Usar mètodes de la classe Alumne
        a1.print();
        a1.setNom("Paquito");
        a1.setGrup('C');
        a1.print();

        p1.setEdat(45);
        p1.print();

        System.out.println("ALUMNES: " + a1.getNom()+", "+a2.getNom());

        // Error NullPointerException
        //a3.print();

    }

}
