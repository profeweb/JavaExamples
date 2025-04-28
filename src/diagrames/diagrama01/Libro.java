package diagrames.diagrama01;

// Classe que hereta de Material

public class Libro extends Material{

    // Atributs
    private String ISBN;
    private int numeroPaginas;

    // Constructor
    public Libro(int id, String titulo, String autor, String ISBN, int numeroPaginas) {
        super(id, titulo, autor);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters

    public String getISBN() {
        return ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    // Setters

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Altres
    public String getResumen(){
        return "";
    }
}
