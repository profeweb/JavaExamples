package papers.paper2.t4.pregunta1;

public class FoodItem {

    // Atributs
    private String itemCode;
    private int quantity;

    // Constructor
    public FoodItem(String x , int y ){
        itemCode = x;
        quantity = y;
    }

    // están incluidos todos los métodos accesor (getters) y mutador (setters)
    // ...

    // Getters
    public String getItemCode(){
        return this.itemCode;
    }

    public int getQuantity(){
        return this.quantity;
    }

    // Setters
    public void setItemCode(String s){
        this.itemCode = s;
    }

    public void setQuantity(int q){
        this.quantity = q;
    }

}

