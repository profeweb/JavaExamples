package poo.geometria;

public class Quadrat extends PoligonOK{

    Quadrat(){
        super(4);
    }

    Quadrat(Punt[] punts){
        super(punts);
    }

    public void print(){
        System.out.println("Quadrat format per: ");
        for(int i=0; i<punts.length; i++){
            this.punts[i].print();
        }
    }
}
