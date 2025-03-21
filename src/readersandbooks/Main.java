package readersandbooks;

import java.util.ArrayList;

public class Main {

    public static Reader[] readers;


    public static void main(String[] args) {

        // Creació de 2 lectors
        Reader reader1 = new Reader("Alice");
        Reader reader2 = new Reader("John");

        // Creació de llistes de llibres als lectors
        reader1.createBookList("Favorits");
        reader1.createBookList("Pendents");

        // Creació de 2 llibres
        Book book1 = new Book("1984", "George Orwell", "123456", Book.Genere.NOVELA, 231);
        Book book2 = new Book("Brave New World", "Aldous Huxley", "789012", Book.Genere.COMIC, 125);

        // Mostra la informació del llibre
        System.out.println(book1);

        // Afegir les llibres a una llista del lector
        reader1.addBookToList("Favorits", book1);
        reader1.addBookToList("Favorits", book2);

        // Mostra la informació del lector
        System.out.println(reader1);

        // Instanciar l'array de lectors amb 10 caselles
        readers = new Reader[10];

        // Emplenar algunes caselles de l'array readers
        readers[0] = reader1;
        readers[1] = reader2;

        // Número de llibres del gènere (sense duplicats) entre tots els lectors
        Book.Genere g = Book.Genere.NOVELA;
        int nbg = numBooksGenreNoDuplicates(g, readers);
        System.out.printf("Num. Llibres Gènere %s: %d.\n", g, nbg);

        // Compara 2 lectors
        if(reader1.betterReader(reader2)){
            System.out.printf("% és millor lector que %s.\n", reader1.getNom(), reader2.getNom());
        }
        else {
            System.out.printf("% és millor lector que %s.\n", reader2.getNom(), reader1.getNom());
        }
    }


    public static int numBooksGenre(Book.Genere genere, Reader[] readers){
        int n = 0;
        for(int nr=0; nr<readers.length; nr++) {
            if (readers[nr] != null) {
                for (int nl = 0; nl < readers[nr].getNumLists(); nl++) {
                    n += readers[nr].getBookListAt(nl).getNumBooksGenre(genere);
                }
            }
        }
        return n;
    }

    public static int numBooksGenreNoDuplicates(Book.Genere genere, Reader[] readers){
        ArrayList<String> isbns = new ArrayList<>();
        int n = 0;
        for(int nr=0; nr<readers.length; nr++){
            if(readers[nr]!=null) {
                for (int nl = 0; nl < readers[nr].getNumLists(); nl++) {
                    for (int nb = 0; nb < readers[nr].getBookListAt(nl).getNumBooks(); nb++) {
                        if (readers[nr].getBookListAt(nl).getBookAt(nb).getGenere().equals(genere)) {
                            String isbn = readers[nr].getBookListAt(nl).getBookAt(nb).getIsbn();
                            if (!isbns.contains(isbn)) {
                                isbns.add(isbn);
                                n++;
                            }
                        }
                    }
                }
            }
        }
        return n;
    }

    // Nom del lector amb la mitjana més alta de llibres en llistes
    public static String readerNameMaxAverage(Reader[] readers){
        float maxAvg =  0;
        int indexReader = -1;
        for(int r=0; r<readers.length; r++){
            if(readers[r].averageNumBooks() > maxAvg){
                maxAvg = readers[r].averageNumBooks();
                indexReader = r;
            }
        }
        return readers[indexReader].getNom();
    }
    
    // Determina si el llibre està en alguna llista de tots els lectors
    public boolean isBookInAllReadersList(Book b, Reader[] readers){
        for(int r=0; r<readers.length; r++){
            boolean bookReader = false;
            for(int nl=0; nl<readers[r].getNumLists(); nl++){
                if(readers[r].getBookListAt(nl).includesBook(b.getIsbn())){
                    bookReader = true;
                    break;
                }
            }
            if(!bookReader){
                return false;
            }
        }
        return true;
    }


}
