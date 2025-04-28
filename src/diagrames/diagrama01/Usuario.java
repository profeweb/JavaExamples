package diagrames.diagrama01;

// Classe Abstracta

public abstract class Usuario {

    // Atributs
    private int id;
    private String nombre;

    // Constructor

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Altres
    public void solicitarPrestamo(Material material){ }
}
