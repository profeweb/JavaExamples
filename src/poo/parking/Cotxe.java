package poo.parking;

public class Cotxe extends Vehicle{

    // Propietats

    public enum TIPUS { GASOLINA, DIESEL, ELECTRIC };
    private TIPUS tipus;

   // Constructor

    public Cotxe(String matricula, TIPUS tipus) {
        super(matricula, 2, 0);
        this.tipus = tipus;
    }

    // Setters & Getters

    public TIPUS getTipus() {
        return tipus;
    }

    public void setTipus(TIPUS tipus) {
        this.tipus = tipus;
    }

    // Altres

    public void rodar(){
        float kms = this.getNumKms() + 10;
        setNumKms(kms);
    }
}
