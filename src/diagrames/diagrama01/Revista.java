package diagrames.diagrama01;

// Classe que hereta de Material
public class Revista extends Material {

    // Atributs
    private int volumen;
    private int numero;

    // Constructor
    public Revista(int id, String titulo, String autor, int volumen, int numero) {
        super(id, titulo, autor);
        this.volumen = volumen;
        this.numero = numero;
    }

    // Getters

    public int getVolumen() {
        return volumen;
    }

    public int getNumero() {
        return numero;
    }


    // Setters

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
