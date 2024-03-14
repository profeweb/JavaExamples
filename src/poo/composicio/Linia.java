package poo.composicio;

public class Linia {

    Punt3D a, b;

    public Linia(Punt3D a, Punt3D b) {
        this.a = a;
        this.b = b;
    }

    public Punt3D getA() {
        return a;
    }

    public void setA(Punt3D a) {
        this.a = a;
    }

    public Punt3D getB() {
        return b;
    }

    public void setB(Punt3D b) {
        this.b = b;
    }

    void imprimir(){
        System.out.println("Linia: ");
        a.imprimir();
        b.imprimir();
    }
}
