package classeobject;

public class Cosa {

    String nom;
    int num;

    public Cosa(String n, int i){
        this.nom = n;
        this.num =i;
    }

    public boolean equals(Object o){
        Cosa altre = (Cosa)o;
        if(this.nom.equals(altre.nom) && this.num==altre.num){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString(){
        return "COSA: "+ this.nom + ", "+ this.num;
    }

    public static void main(String[] args) {

        Cosa c1 = new Cosa("PATATA", 4);
        Cosa c2 = new Cosa("PATATA", 7);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());


        System.out.println(c1);

        if(c1.equals(c2)){
            System.out.println("IGUALS");
        }
        else {
            System.out.println("DIFERENTS");
        }

    }
}
