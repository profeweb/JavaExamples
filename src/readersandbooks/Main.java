package readersandbooks;

public class Main {

    public static Reader[] readers;

    public static void main(String[] args) {

        readers = new Reader[10];

        Reader reader = new Reader("Alice");
        reader.createBookList("Favorites");

        Book book1 = new Book("1984", "George Orwell", "123456");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "789012");

        reader.addBookToList("Favorites", book1);
        reader.addBookToList("Favorites", book2);

        System.out.println(reader);
    }

}
