package papers.paper2.maig25;

public class Artist {

    private String artistName;           // nombre del artista
    private String artistLocation;       // ubicación actual del artista
    private Artwork[] theArtworks;       // obras del artista
    private int noOfArtworks;           // número de obras del artista almacenadas en la matriz theArtworks

    public Artist(String artistName, String artistLocation){
        this.artistName = artistName;
        this.artistLocation = artistLocation;
        theArtworks = new Artwork[100];  // Un artista tiene como máximo 100 obras de arte
    }

    public String getName(){
        return artistName;
    }

    public String getLocation(){
        return artistLocation;
    }

    public int getNoOfArtworks(){
        return noOfArtworks;
    }

    public Artwork getArtwork(int x){
        return theArtworks[x];
    }

    public void addArtwork(Artwork x){
        theArtworks[noOfArtworks] = x;
        noOfArtworks = noOfArtworks + 1;
    }

    public double comissionToPay(){
        double total = 0.0;
        for (int i = 0; i < noOfArtworks; i++) {
            if (getArtwork(i).getIsSold()) {
                total += theArtworks[i].getArtWorkPrice() * 0.15;
            }
        }
        return total;

    }

    public Artwork[] sortArt(){

        // Hacemos una copia de las obras actuales
        Artwork[] sorted = new Artwork[noOfArtworks];
        for (int i = 0; i < noOfArtworks; i++) {
            sorted[i] = theArtworks[i];
        }

        // Ordenación por selección (de mayor a menor)
        for (int i = 0; i < noOfArtworks - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < noOfArtworks; j++) {
                if (sorted[j].getArtWorkPrice() > sorted[maxIdx].getArtWorkPrice()) {
                    maxIdx = j;
                }
            }

            // Intercambiar
            Artwork temp = sorted[i];
            sorted[i] = sorted[maxIdx];
            sorted[maxIdx] = temp;
        }

        // Crear attay con las 5 obras más caras
        int size = Math.min(5, noOfArtworks);
        Artwork[] topFive = new Artwork[size];
        for (int i = 0; i < size; i++) {
            topFive[i] = sorted[i];
        }
        return topFive;

    }


}
