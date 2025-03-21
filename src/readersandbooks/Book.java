package readersandbooks;

public class Book {

    public enum Genere {NOVELA, POESIA, ECONOMIA, HISTORIA, COMIC};

    // Atributs
    private String titol;
    private String autor;
    private String isbn;
    private Genere genere;
    private int numPagines;

    // Constructor(s)
    public Book(String titol, String autor, String isbn) {
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genere = Genere.NOVELA;
        this.numPagines = 0;
    }

    public Book(String titol, String autor, String isbn, Genere genere, int numPagines) {
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genere = genere;
        this.numPagines = numPagines;
    }

    // Getters
    public String getTitol() { return titol; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public Genere getGenere() { return genere; }
    public int getNumPagines(){ return  numPagines; }

    // Setters

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    //Others

    @Override
    public String toString() {
        return "Llibre: {" +
                "títol = " + titol +
                ", autor = " + autor + 
                ", isbn = " + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Book otherBook = (Book) o;
        return this.isbn.equals(otherBook.isbn);
    }


}
