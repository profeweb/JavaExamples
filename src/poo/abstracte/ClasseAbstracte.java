package poo.abstracte;

public abstract class ClasseAbstracte {

    String nom;
    ClasseAbstracte(String nom){ this.nom = nom; }

    public static class SubClasse1 extends ClasseAbstracte {
        int x;
        SubClasse1(String n, int x){
            super(n);
            this.x = x;
        }
    }
}
