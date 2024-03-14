package poo.composicio;

public class Cercle {

    // Atributs
    Punt3D centre;
    float radi;

    // Constructor(s)

    public Cercle(Punt3D centre, float radi) {
        this.centre = centre;
        this.radi = radi;
    }

    public Cercle(float radi) {
        this.centre = new Punt3D(0, 0, 0);
        this.radi = radi;
    }

    // Getters

    public Punt3D getCentre() {
        return centre;
    }

    public float getRadi() {
        return radi;
    }


    // Setters

    public void setCentre(Punt3D centre) {
        this.centre = centre;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }


    // Altres
    public  void imprimir(){
        System.out.print("El cercle té centre a ");
        this.centre.imprimir();
        System.out.println(" i té radi "+this.radi);
    }
}
