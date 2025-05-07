package papers.paper2.maig25;

public class Performance extends Artwork {

    private boolean needForSound;

    public Performance(String title, int price, boolean needForSound) {
        super(title, price);
        this.needForSound = needForSound;
    }
}

