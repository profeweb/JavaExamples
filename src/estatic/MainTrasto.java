package estatic;

public class MainTrasto {

    public static void main(String[] args) {

        Trasto t = new Trasto("COSA 1");
        // Accés a propietats i mètodes no estàtics amb notació objecte-punt.
        String nom = t.nom;  // Accés a la propietat (no estàtica)
        t.print();  // Accés al mètode (no estàtic)

        // Accés a propietats i mètodes estàtics amb notació Classe-punt.
        String nomE = Trasto.nomEstatic;  // Accés a la propietat estàtica
        Trasto.printEstatic();  // Accés al mètode estàtic

        // Tan PI com pow són estàtics
        double calcul = Math.PI * Math.pow(2, 5);

        Trasto t2 = new Trasto("COSA 2");
        Trasto t3 = new Trasto("COSA 3");

        System.out.println(Trasto.nomEstatic);
        System.out.println(Trasto.numTrastos);
    }
}
