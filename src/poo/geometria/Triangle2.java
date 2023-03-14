package poo.geometria;

public class Triangle2 {

    Punt[] punts;

    Triangle2(Punt a, Punt b, Punt c){
        punts = new Punt[3];
        punts[0] = a;
        punts[1] = b;
        punts[2] = c;
    }

    public void print(){
        System.out.println("Triangle format per: ");
        for(int i=0; i< punts.length; i++) {
            punts[i].print();
        }
    }

}
