package poo.generica;

public class Cotxeria<E> {

    E plaça1, plaça2;
    int num = 5;
    String adreça = "";

    Cotxeria(){ plaça1 = null;plaça2 = null; }

    public void aparcaPlaça1(E x){ this.plaça1 = x; }
    public void aparcaPlaça2(E x){ this.plaça2 = x; }
    public boolean estaPlena(){ return plaça1!=null && plaça2!=null; }

}
