package poo.parking;

public class Moto extends Vehicle {

    // Propietats
    private int cilindrada;

    // Constructor
    public Moto(String matricula, int cilindrada) {
        super(matricula, 2, 0);
        this.cilindrada = cilindrada;
    }

    // Setters & Getters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Altres

    public void rodar(){
        float kms = this.getNumKms() + 5;
        setNumKms(kms);
    }
}
