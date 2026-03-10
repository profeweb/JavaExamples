package generica;

public class Cotxe {

    String matricula;
    int numPortes;

    Cotxe(String matricula){
        this.matricula = matricula;
        this.numPortes = 5;
    }

    Cotxe(String matricula, int numPortes){
        this.matricula = matricula;
        this.numPortes = numPortes;
    }

    public String toString(){
        return "Cotxe: "+matricula+"("+numPortes+").";
    }
}
