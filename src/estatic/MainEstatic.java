package estatic;

public class MainEstatic {

    public static void main(String[] args) {

        // Podem emprar les propietats i mètodes estàtics sense crear objectes de la classe
        // No cal cridar al constructor
        float f = 12 + CosaEstatica.PLANK;
        double d = CosaEstatica.potencia(3, 4);

        // Cal instanciar objectes de la classe per emprar propietats o mètodes no estàtics
        // Cridada al constructor de la classe (instanciació d'un objecte)
        CosaNoEstatica cne1 = new CosaNoEstatica();

        float h = cne1.PLANK;              // Accés a propietat no estàtica
        float s = cne1.suma(5, 10);  // Ús de mètode no estàtic


        // Comprovació de que les propietats estàtiques són comunes a tots els objectes de la classe
        CosaNoEstatica cne2 = new CosaNoEstatica();
        cne2.numCoses = 6;

        System.out.println("Num Coses: "+ cne1.numCoses);
        System.out.println("Num Coses: "+ cne2.numCoses);
    }
}
