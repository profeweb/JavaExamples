package papers.paper2.maig25;

public class Painting extends Artwork {

    private String typeOfPaint;

    public Painting(String title, int price, String typeOfPaint) {
        super(title, price);
        this.typeOfPaint = typeOfPaint;
    }
}

