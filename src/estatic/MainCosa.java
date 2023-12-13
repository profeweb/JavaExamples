package estatic;

public class MainCosa {

    public static void main(String[] args) {

        // Instanciació d'objectes de classe Cosa
        Cosa c1 = new Cosa("172727");
        Cosa c2 = new Cosa("373738");
        Cosa c3 = new Cosa("825267");
        Cosa c4 = new Cosa("016172");

        // Cridada al mètode print de l'objecte c1 de classe Cosa
        c1.print();

        // Accés a la propietat estàtica numCoses de la classe Cosa
        System.out.println("Num Coses: "+ c1.numCoses);
        System.out.println("Num Coses: "+ Cosa.numCoses);
    }
}
