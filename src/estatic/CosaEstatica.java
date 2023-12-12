package estatic;

/*
    Exemple de classe amb atributs i mètodes estàtics.
    No cal instanciar cap objecte per a utilitzar les propietats o mètodes estàtics.
 */

public class CosaEstatica {

    // Propietat Estàtica
    public static float PLANK = 6.26f;

    // Mètode Estàtic
    public static double potencia(int b, int e){
        return Math.pow(b, e);
    }

}
