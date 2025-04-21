package readersandbooks;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    // Atributs
    private String name;
    private List<Book> books;

    // Construtor
    public BookList(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Getters
    public String getName(){ return this.name; }
    public List<Book> getBooks() { return books; }
    public Book getBookAt(int i){ return books.get(i); }
    public int getNumBooks(){ return books.size(); }
    public boolean isEmpty(){ return books.isEmpty(); }

    // Setters
    public void setName(String n){ this.name = n; }
    public void addBook(Book book) { books.add(book); }
    public void removeBook(Book book) { books.remove(book); }

    // Altres

    // Número de llibres de la BookList d'aquest gènere
    public int getNumBooksGenre(Book.Genere genere){
        int num = 0;
        for(int i=0; i<getNumBooks(); i++){
            if(getBookAt(i).getGenere().equals(genere)){
                num++;
            }
        }
        return num;
    }

    // Suma del número de pàgines dels llibres de la BookList
    public int getTotalNumPagesBooksList(){
        int sumPages = 0;
        for(int i=0; i<getNumBooks(); i++){
            sumPages += getBookAt(i).getNumPagines();
        }
        return sumPages;
    }

    // Títol del llibre de la BookList amb major número de pàgines
    public String getBookNameMaxPages(){
        int maxPagBook = 0;
        int indexBook = -1;
        for(int i=0; i<getNumBooks(); i++){
            int np = getBookAt(i).getNumPagines();
            if(np> maxPagBook){
                maxPagBook = np;
                indexBook = i;
            }
        }
        return getBookAt(indexBook).getTitol();
    }

    // Número de llibres de la BookList que tenen entre minP y maxP pàgines (incloses)
    public int getNumBooksPages(int minP, int maxP){
        int num = 0;
        for(int i=0; i<getNumBooks(); i++){
            int np = getBookAt(i).getNumPagines();
            if(np>=minP && np<maxP){
                num++;
            }
        }
        return num;
    }

    // Inclou el llibre amb aquest isbn a la llista
    public boolean includesBook(String isbn){
        for(int i=0; i<getNumBooks(); i++){
            if(getBookAt(i).getIsbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }

    // Determina si tots els llibres de la llista són del mateix gènere
    public boolean allBooksSameGenre(){
        if(getNumBooks()>0) {
            Book.Genere g = getBookAt(0).getGenere();
            for (int i = 1; i <getNumBooks(); i++) {
                if(!getBookAt(i).getGenere().equals(g)){
                    return false;
                }
            }
        }
        return true;
    }

}
