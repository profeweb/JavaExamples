package poo.alumnes;

public class ExempleClasseAlumne {

    public static void main(String[] args){

        Alumne a = new Alumne("Paco", 1, 'D');
        Alumne b = new Alumne("Pep", 2, 'A');
        a.setNom("Paquito");
        a.setCurs(2);
        a.setGrup('C');
        b.setCursGrup(3, 'C');
        a.print();
        b.print();

        Alumne c=null;
        c = new Alumne("Maria", 2, 'F');
        c.print();
    }
}
