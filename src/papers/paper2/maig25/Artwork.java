package papers.paper2.maig25;

public class Artwork {

    private String artworkTitle;     // título de la obra de arte
    private int artworkPrice;        // precio de la obra de arte
    private boolean isSold;        // si la obra se ha vendido o no

    public Artwork(String artworkTitle, int artworkPrice){
        this.artworkTitle = artworkTitle;
        this.artworkPrice = artworkPrice;
        isSold = false; // el valor por defecto es no vendido
    }

    public String getArtworkTitle(){
        return artworkTitle;
    }

    public int getArtWorkPrice(){
        return artworkPrice;
    }

    public boolean getIsSold(){
        return isSold;
    }

    public void isSold(){
        isSold = true;
    }


}
