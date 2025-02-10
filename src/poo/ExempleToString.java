package poo;

public class ExempleToString {

    public static void main(String[] args) {

        Persona p1 = new Persona("Paco", "45678761K", Persona.SEXE.HOME);
        System.out.println(p1);

    }

    public static class Persona {

        String nom, dni;
        enum SEXE {HOME, DONA, ALTRES};
        SEXE sexe;

        public Persona(String n, String dni, SEXE s){
            this.nom = n; this.dni = dni; this.sexe = s;
        }

        // Setters i getters ...

        public String toString(){
            return this.nom +", " + this.dni +" ("+this.sexe+")";
        }

    }
}
