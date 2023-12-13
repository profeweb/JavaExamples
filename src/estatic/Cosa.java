package estatic;

public class Cosa {

    // Propietat estàtica (comuna a tots els objectes de la classe)
    public static int numCoses = 0;

    // Propietats no estàtiques
    int id;
    String nom;

    // Constructor
    public Cosa(String s){

        // Actualitza les propietats no estàtiques
        this.nom = s;
        this.id = numCoses;

        // Actualitza la propietat estàtica
        numCoses++;
    }

    // Mètode
    public void print(){
        System.out.println(this.id + ": " + this.nom);
    }
}
