package estatic;

public class MainEstatic {

    public static void main(String[] args) {

        // Podem emprar les propietats i mètodes estàtics sense crear objectes de la classe
        // No cal cridar al constructor
        float f = 12 + CosaEstatica.PLANK;
        double d = CosaEstatica.potencia(3, 4);

        // Cal instanciar objectes de la classe per emprar propietats o mètodes no estàtics
        // Cridada al constructor de la classe
        CosaNoEstatica cne = new CosaNoEstatica();

        float h = cne.PLANK;                // Accés a propietat no estàtica
        float s = cne.suma(5, 10);  // Ús de mètode no estàtic
    }
}
