package poo.temp;

public class MainProfes {

    public static void main(String[] args) {
        // Declaració
        Professor p1, p2, p3;

        // Cridades als constructors
        p1 = new Professor("Manel", 35, Professor.DEPARTAMENT.FÍSICA);
        p2 = new Professor("Xesca", 22, Professor.DEPARTAMENT.CATAlÀ);
        p3 = new Professor("Biel", Professor.DEPARTAMENT.MATES);

        // Setters (mutadores)
        p1.setNom("Manel Ernest");
        p2.setDepartament(Professor.DEPARTAMENT.ANGLÈS);
        p3.setAnys(15);

        // Getters
        int sumaAnys = p1.getAnys() + p2.getAnys() + p3.getAnys();
        System.out.printf("SUMA ANYS: %d.\n", sumaAnys);

        //Altres
        p1.print();
        p2.print();
        p3.print();
    }
}
