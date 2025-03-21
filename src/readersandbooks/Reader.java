package readersandbooks;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    // Atributs
    private String nom;
    private List<BookList> bookLists;

    // Constructor
    public Reader(String nom) {
        this.nom = nom;
        this.bookLists = new ArrayList<>();
    }

    // Getters

    public String getNom() {
        return nom;
    }

    public List<BookList> getBookLists() {
        return bookLists;
    }

    public BookList getBookListAt(int index){
        return  bookLists.get(index);
    }

    public int getNumLists(){
        return bookLists.size();
    }

    // Setters
    public void createBookList(String listName) {
        bookLists.add(new BookList(listName));
    }

    public void addBookToList(String listName, Book book) {
        for (BookList bl : bookLists) {
            if (bl.getName().equals(listName)) {
                bl.addBook(book);
                break;
            }
        }
    }

    // Altres

    @Override
    public String toString() {
        return "Lector/a: { nom = " + nom + "}";
    }

    // Nom de la llista de llibres amb més llibres
    public String getNameLongestList(){
        int maxNumBooks = 0;
        String nameList = "";
        for(int i=0; i<bookLists.size(); i++){
            int nb = bookLists.get(i).getNumBooks();
            if(nb> maxNumBooks){
                maxNumBooks = nb;
                nameList = bookLists.get(i).getName();
            }
        }
        return nameList;
    }


    // Compara amb un altre lector (amb el número total pàgines de tots els llibres de totes les llistes)
    public boolean betterReader(Reader otherReader){
        int numTotalPages = 0;
        for(int i=0; i<getNumLists(); i++){
            BookList bl = getBookListAt(i);
            numTotalPages += bl.getTotalNumPagesBooksList();
        }

        int otherNumTotalPages = 0;
        for(int i=0; i<otherReader.getNumLists(); i++){
            BookList bl = getBookListAt(i);
            otherNumTotalPages += bl.getTotalNumPagesBooksList();
        }

        return numTotalPages > otherNumTotalPages;
    }

    // Mitjana del número de llibres de les llistes del lector
    public float averageNumBooks(){
        float n = 0;
        for(int i=0; i<getNumLists(); i++){
            n += getBookListAt(i).getNumBooks();
        }
        return n / getNumLists();
    }




}
