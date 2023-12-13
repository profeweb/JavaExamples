package papers.paper2.t4.pregunta1;

public class Item {

    // Atributs
    private String code; // código de producto
    private String name; // nombre de producto
    private double price; // precio por unidad antes de impuestos

    // se incluyen todos los métodos accesor, mutador y constructor
    // ...

    // Constructor
    public Item(String c, String n, double p){
        this.code = c;
        this.name = n;
        this.price = p;
    }

    // Getters

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    // Setters

    public void setCode(String c){
        this.code = c;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setPrice(double p){
        this.price = p;
    }

}

