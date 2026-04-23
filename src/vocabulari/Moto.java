package vocabulari;

public class Moto extends Vehicle {

    private int cilindrada;   //Atributs privats (Encapsulament)

    public Moto(String matricula, int nr, int cilindrada) {
        super(matricula, nr);
        this.cilindrada = cilindrada;
    }

    // Setters i Getters públics (Encapsulament)

    public int getCilindrada() { return cilindrada; }

    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada;}
}
