package papers.paper2.t4.pregunta1b;

public class FoodItem extends Item{

    // Atributs
    private int quantity;

    // Constructor
    public FoodItem(String c, String n, double p, int q){
        super(c, n, q);
        quantity = q;
    }

    // Getters
    public int getQuantity(){
        return this.quantity;
    }

    // Setters
    public void setQuantity(int q){
        this.quantity = q;
    }

}

