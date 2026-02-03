package poo.object;

public class MainToString1 {

    public static void main(String[] args) {
        Persona p1, p2;
        p1 = new Persona("Paco", 33);
        p2 = new Persona("Pep", 33);
        String txtP1 = p1.toString();
        System.out.println(p1);
        System.out.println(p2);

        if(p1.equals(p2)){
            System.out.println("Iguals P1 o P2");
        }
        else {
            System.out.println("Diferents P1 i P2");
        }
    }

    public static class Persona {
        String nom;
        int edat;

        public Persona(String nom, int edat){
            this.nom = nom; this.edat = edat;
        }

        public String toString(){
            return nom.toUpperCase()+" : "+ edat;
        }

        public boolean equals(Object o){
            Persona po = ((Persona)o);
            if( this.nom.equals(po.nom) && this.edat== po.edat){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
