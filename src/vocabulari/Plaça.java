package vocabulari;

public class Plaça<E> {
    E m;

    public Plaça(){
        m = null;
    }

    public void aparcar(E m){
        this.m = m;
    }

    public void desAparcar(){
        this.m = null;
    }

    public boolean isFree(){
        return this.m == null;
    }
}
