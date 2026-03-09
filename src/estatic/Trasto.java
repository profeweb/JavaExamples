package estatic;

public class Trasto {

    // propietat de la classe (no estàtic)
    String nom;

    // propietat de la classe (estàtic)
    static String nomEstatic;
    static int numTrastos =  0;

    public Trasto(String n){
        this.nom = n;
        Trasto.nomEstatic = n;
        Trasto.numTrastos++;
    }

    // mètode de la classe (no estàtic)
    public void print(){
        System.out.println(this.nom);
    }

    // mètode de la classe (no estàtic)
    public static void printEstatic(){
        System.out.println("TRASTO ESTÀTIC");
    }
}
