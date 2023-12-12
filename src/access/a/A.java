package access.a;

public class A {

    // Propietats de la classe A
    public int edat;
    private String nom;
    protected  char grup;

    // Mètode de la classe A

    public A(int e, String n, char c){
        this.edat = e;
        this.nom = n;
        this.grup = c;
    }

    public String getNom(){
        return this.nom;
    }

    private void print(){
        System.out.println(edat);  // accés públic
        System.out.println(grup);  // accés protegit
        System.out.println(nom);  // accés privat
    }

    protected void print2(){
        System.out.println(edat);  // accés públic
        System.out.println(grup);  // accés protegit
        System.out.println(nom);  // accés privat
    }
}
