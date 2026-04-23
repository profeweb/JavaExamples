package vocabulari;

public class Cotxe extends Vehicle{

    public enum COMBUSTIBLE {BENZINA, DIESEL, ELECTRIC};
    COMBUSTIBLE combustible;

    public Cotxe(String matricula, COMBUSTIBLE c) {
        super(matricula);
        this.combustible = c;
    }

    public void print(){
        System.out.println("COTXE: "+ matricula);
    }

    public void printCotxe(){
        System.out.println("COTXE: "+ matricula);
    }
}
