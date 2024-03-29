package poo.cotxes;

public class Cotxe {

    // Atributs
    String matricula;
    String marca;
    float velocitat;
    int numPortes;

    // Constructors

    Cotxe(String mat, String mar, float v, int np){
        matricula = mat;
        marca = mar;
        velocitat = v;
        numPortes = np;
    }

    Cotxe(String mat, String mar){
        matricula = mat;
        marca = mar;
        numPortes = 5;
        velocitat = 0;
    }

    // Getters i Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(float velocitat) {
        this.velocitat = velocitat;
    }

    public int getNumPortes() {
        return numPortes;
    }

    public void setNumPortes(int numPortes) {
        this.numPortes = numPortes;
    }

    // Altres

    void accelerar(){
        velocitat += 0.1;
    }

    void accelerar(float inc){
        velocitat += inc;
    }

    void print(){
        System.out.printf("Cotxe matricula %s i marca %s amb %d portes va a %f Km/h.\n",
                matricula, marca, numPortes, velocitat);
    }
}
