package estatic;

public class MainEstatic {

    public static void main(String[] args) {

        float f = 12 + CosaEstatica.PLANK;
        double d = CosaEstatica.potencia(3, 4);

        //float h = CosaNoEstatica.PLANK; // No estàtica (Error)
        CosaNoEstatica cne = new CosaNoEstatica();
        float h = cne.PLANK;
    }
}
