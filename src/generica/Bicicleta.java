package generica;

public class Bicicleta {

    String matricula;
    String marca;

    Bicicleta(String matricula, String marca){
        this.matricula = matricula;
        this.marca = marca;
    }

    public String toString(){
        return "Bici: "+matricula+"("+marca+").";
    }
}
