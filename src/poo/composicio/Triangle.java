package poo.composicio;

public class Triangle {

    // Atributs
    Punt3D[] vertexs;

    // Constructor
    public Triangle(Punt3D p1, Punt3D p2, Punt3D p3){
        this.vertexs = new Punt3D[3];
        this.vertexs[0] = p1;
        this.vertexs[1] = p2;
        this.vertexs[2] = p3;
    }

    // Getters
    public Punt3D getVertexAt(int i){
        return this.vertexs[i];
    }

    // Setters
    public void setVertexAt(int i, Punt3D p){
        this.vertexs[i] = p;
    }

    // Altres
    public void imprimir(){
        System.out.println("Triangle format pels punts: ");
        for(int i=0; i<this.vertexs.length; i++){
            this.vertexs[i].imprimir();
        }
    }
}
