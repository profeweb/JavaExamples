package poo.composicio;

public class Punt3D {

    // Atributs
    float x, y, z;
    String nom;

    // Constructor
    Punt3D(String n, float x, float y, float z){
        this.nom = n;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Punt3D(float x, float y, float z){
        this.nom = "A";
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void imprimir(){
        System.out.printf("Punt %s(%f, %f, %f).%n", nom, x, y, z);
    }
}
