package poo.parking;

public class Vehicle {

    // Propietats

    private String matricula;
    private int numRodes;
    private float numKms;

    // Constructor(s)

    public Vehicle(String matricula){
        this.matricula = matricula;
        this.numRodes = 4;
        this.numKms = 0;
    }

    public Vehicle(String matricula, int numRodes, float numKms){
        this.matricula = matricula;
        this.numRodes = numRodes;
        this.numKms = numKms;
    }

    // Setters & Getters


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumRodes() {
        return numRodes;
    }

    public void setNumRodes(int numRodes) {
        this.numRodes = numRodes;
    }

    public float getNumKms() {
        return numKms;
    }

    public void setNumKms(float numKms) {
        this.numKms = numKms;
    }

    // Altres

    public void rodar(){
        this.numKms ++;
    }

    public boolean mesKmsQue(Vehicle altre){
        return this.numKms > altre.numKms;
    }
}
