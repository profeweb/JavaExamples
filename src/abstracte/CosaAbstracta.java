package abstracte;

/*
    Exemple de Classe Abstracta:
    No es podrà instanciar (no permet crear objectes a través del seu constructor).
 */

public abstract class CosaAbstracta {

    // Té els seus atributs, propietats o variables
    public int edat;

    // I també els seus mètodes
    public void print(){
        System.out.println(edat);
    }
}
