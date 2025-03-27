package poo.profes;

public class ExempleClasseProfessor {

    public static void main(String[] args){

        // Cridades als constructors
        Professor a = new Professor("Manel", 35, Professor.DEPARTAMENT.FÍSICA);
        Professor b = new Professor("Xesca", 22, Professor.DEPARTAMENT.CATALÀ);
        Professor c = new Professor("Carles", Professor.DEPARTAMENT.MATES);

        // Aplicam setters
        a.setNom("MANEL");
        b.setAnys(23);

        // Utilitzam getters
        int sumaAnys = a.getAnys() + b.getAnys();
        System.out.println("SUMA ANYS: " + sumaAnys);

        // Imprimim informació dels Professors
        a.print();
        b.print();
        c.print();

    }
}
