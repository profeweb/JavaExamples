package papers.paper2.maig25;

import java.util.LinkedList;

public class Main {

    public static Artist[] theArtists = new Artist[10];
    public static LinkedList<Customer> customers;

    public static void main(String[] args) {

        // Creació dels artistes
        theArtists[0] = new Artist("Nishan Nathan", "Italia");
        theArtists[1] = new Artist("Saskia Anna", "Egipto");
        theArtists[2] = new Artist("Kate Matherson", "Estados Unidos");

        // Afegim obres a un artista (per defecte no venudes)
        theArtists[2].addArtwork(new Artwork("Still Life Winter", 18000));
        theArtists[2].addArtwork(new Artwork("Still Life Summer", 15000));

        // Comprovam el valor de isSold abans
        System.out.println("Before: "+ theArtists[2].getArtwork(1).getIsSold());

        // Actualitzam el valor de isSold
        Sold("Kate Matherson", "Still Life Summer", theArtists);

        // Comprovam el valor de isSold després
        System.out.println("After: "+ theArtists[2].getArtwork(1).getIsSold());

        // Llista Enllaçada d'objectes Customer
        customers = new LinkedList<>();
        customers.add(new Customer("John", "London", 12000));
        customers.add(new Customer("Mario", "Madrid", 18000));
        customers.add(new Customer("Peter", "New York", 52000));
        customers.add(new Customer("Pietro", "Rome", 47000));

        // Comprova el mètode recursiu (quants clients amb pressupost > 40.000)
        int n = countRecursive(customers, 40000, 0);
        System.out.printf("%d customers with budget bigger than 40.000. \n", n);

    }

    public static void Sold(String artistName, String artworkTitle, Artist[] theArtists) {
        // Recorrem tot l'array d'artistes
        for (Artist artist : theArtists) {
            // En cas de ser l'artista que cercam
            if (artist != null && artist.getName().equals(artistName)) {
                // Recorrem tot l'array de les seves obres
                for (int i=0; i<artist.getNoOfArtworks(); i++) {
                    Artwork artwork = artist.getArtwork(i);
                    // En cas de ser l'obra que cercam
                    if (artwork != null && artwork.getArtworkTitle().equals(artworkTitle)) {
                        artwork.isSold(); // Marcam l'obra com a venuda
                        break; // S'ha trobat i marcat l'obra, no cal seguir, podem sortir del mètode
                    }
                }
            }
        }
    }

    public static int countRecursive(LinkedList<Customer> customerList, int max, int n) {

        if (n >= customerList.size()) {
            return 0; // Cas base (no queden clients per comptar)
        }

        // Cas recursiu
        Customer current = customerList.get(n);
        if (current.getMaximumBudget() > max) {
            return 1 + countRecursive(customerList, max, n + 1);
            // augmentar en 1 i continuar
        } else {
            return 0 + countRecursive(customerList, max, n + 1);
            // només continuar
        }
    }



}
