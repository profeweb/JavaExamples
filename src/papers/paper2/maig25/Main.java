package papers.paper2.maig25;

import java.util.LinkedList;

public class Main {

    public static Artist[] theArtists = new Artist[10];

    public static void main(String[] args) {

        theArtists[0] = new Artist("Nishan Nathan", "Italia");
        theArtists[1] = new Artist("Saskia Anna", "Egipto");
        theArtists[2] = new Artist("Kate Matherson", "Estados Unidos");

    }

    public static void Sold(String artistName, String artworkTitle, Artist[] theArtists) {
        for (Artist artist : theArtists) {
            if (artist != null && artist.getName().equals(artistName)) {
                for (int i=0; i<artist.getNoOfArtworks(); i++) {
                    Artwork a = artist.getArtwork(i);
                    if (a != null && a.getArtworkTitle().equals(artworkTitle)) {
                        a.isSold(); // Método para marcar como vendido
                        break; // Se encontró y marcó la obra, se puede salir del método
                    }
                }
            }
        }
    }

    public int countRecursive(LinkedList<Customer> customerList, int max, int n) {

        if (n >= customerList.size()) {
            return 0; // caso base
        }

        Customer current = customerList.get(n);
        if (current.getMaximumBudget() > max) {
            return 1 + countRecursive(customerList, max, n + 1);
            // contar y continuar
        } else {
            return countRecursive(customerList, max, n + 1); // solo continuar
        }
    }



}
