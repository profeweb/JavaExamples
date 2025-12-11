package papers.paper2;

public class TempStatic {

    public static int numCoses = 0;
    public String nom;

    public TempStatic(String n){
        this.nom = n;
        this.numCoses++;
    }

    public static void main(String[] args) {

        TempStatic t1 = new TempStatic("Hola");
        TempStatic t2 = new TempStatic("Hello");
        System.out.print(TempStatic.numCoses);
    }
}
