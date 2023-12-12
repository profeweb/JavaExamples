package access.a;

/*
    Exemple de classe amb propietats i mètodes amb diferent nivell d'accés (públic, privat o protegit)
    * Public: accessible i usable des de qualsvol altre classe.
    * Private: només accessible i usable dins la pròpia classe.
    * Protected (per defecte): accessible i usable per totes les classes del package (carpeta).
 */

public class A {

    // Propietats (atributs) de la classe A
    public int edat;
    private String nom;
    protected  char grup;


    // Mètodes de la classe A

    // Constructor (normalment públic per poder crear objectes de la classe).
    public A(int e, String n, char c){
        this.edat = e;
        this.nom = n;
        this.grup = c;
    }

    // Getters (normalment públic per accedir als valors de les propietats privades
    public String getNom(){
        return this.nom;
    }

    // Exemple de mètode públic (accessible des de qualsevol classe).
    public void print1(){
        System.out.println(edat);  // accés públic
        System.out.println(grup);  // accés protegit
        System.out.println(nom);  // accés privat
    }

    // Exemple de mètode protected (només accessible des de classes del mateix package).
    protected void print2(){
        System.out.println(edat);  // accés públic
        System.out.println(grup);  // accés protegit
        System.out.println(nom);  // accés privat

        print3();  // cridada a mètode privat
    }

    // Exemple de mètode private (només accessible dins aquesta classe).
    private void print3(){
        System.out.println(nom+", "+ edat+", "+ grup);
    }


}
