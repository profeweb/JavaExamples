package diagrames.diagrama01;

// Classe Abstracta

public abstract class Material {

    // Atributs
    private int id;
    private String titulo;
    private String autor;

    // Constructor
    public Material(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    // Altres

    public String getInformacion(){
        return "";
    }

}
