package diagrames.diagrama01;

public class Tesis extends Material {

    // Atributs
    private String universidad;
    private int año;

    // Constructor
    public Tesis(int id, String titulo, String autor) {
        super(id, titulo, autor);
    }

    // Getters

    public String getUniversidad() {
        return universidad;
    }

    public int getAño() {
        return año;
    }


    // Setters

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
