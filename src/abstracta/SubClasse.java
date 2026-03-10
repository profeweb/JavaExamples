package abstracta;

public class SubClasse extends ClasseAbstracta{

    int y;

    SubClasse(int x, int y) {
        super(x);
        this.y = y;
    }

    void print(){
        System.out.println(x +", "+ y);
    }


}
