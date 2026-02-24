package casting;

public class ArraySuperClasse {

    public static void main(String[] args) {
        Persona[] persones = new Persona[3];
        persones[0] = new Alumne("Pep", 4);
        persones[1] = new Professor("Jaume", "Mates");
        persones[2] = new Alumne("Bel", 3);

        // Imprimeix amb el mètode print de cada subclasse
        for(int i=0; i<persones.length; i++){
            persones[i].print();
        }

        // Imprimeix només els objectes d'una subclasse
        for(int i=0; i<persones.length; i++){
            if(persones[i] instanceof Alumne) {
                persones[i].print();
            }
        }

        // Comptabilitzar els objectes de cada subclasse
        int numAlumnes = 0, numProfes = 0;
        for(int i=0; i<persones.length; i++){
            if(persones[i] instanceof Alumne) {
                numAlumnes++;
            }
            else if(persones[i] instanceof Professor) {
                numProfes++;
            }
        }
        System.out.printf("Num. Alumnes: %d, Num. Profes: %d.\n", numAlumnes, numProfes);
    }

    static class Persona {
        String nom;
        Persona(String nom){ this.nom = nom; }
        void print(){ System.out.println("Persona: "+ this.nom); }
    }
    static class Alumne extends Persona {
        int curs;
        Alumne(String nom, int curs){ super(nom); this.curs = curs; }
        void print(){ System.out.println("Alumne: "+ this.nom+", "+this.curs); }
    }
    static class Professor extends Persona {
        String departament;
        Professor(String nom, String dep){ super(nom); this.departament = dep; }
        void print(){ System.out.println("Profe: "+ this.nom+", "+this.departament); }
    }
}
