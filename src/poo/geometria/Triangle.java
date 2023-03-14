package poo.geometria;

public class Triangle {

    Punt a, b, c;

    public Triangle(Punt a, Punt b, Punt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Punt getA() {
        return a;
    }

    public void setA(Punt a) {
        this.a = a;
    }

    public Punt getB() {
        return b;
    }

    public void setB(Punt b) {
        this.b = b;
    }

    public Punt getC() {
        return c;
    }

    public void setC(Punt c) {
        this.c = c;
    }

    public void print(){
        System.out.println("Triangle format per: ");
        this.a.print();
        this.b.print();
        this.c.print();
    }
}
