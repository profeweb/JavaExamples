package classeobject;

public class ExempleObject {

    public static void main(String[] args) {
        // Creació de Persones amb el mateix nom
        Persona p1 = new Persona("Paco");
        Persona p2 = new Persona("Paco");

        // Imprimeix el codi hash dels objectes
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        // Comparació amb hashCode (==)
        if(p1 == p2){ System.out.println("Són iguals!!!"); }
        else { System.out.println("Són diferents!!!");}

        // Comparació amb equals
        if(p1.equals(p2)){ System.out.println("Són iguals!!!"); }
        else { System.out.println("Són diferents!!!");}

        // Imprimeix emprant toString
        System.out.println(p1);
        System.out.println(p2);
    }

    static class Persona {
        String nom;
        Persona(String n){ this.nom = n;}

        // Sobre-escritura del mètode equals heretat d'Object
        public boolean equals(Object o){
            Persona altre = (Persona)o;  // Casting d'objecte a Persona
            return nom.equals(altre.nom);
        }

        // Sobre-escritura del mètode toString heretat d'Object
        public String toString(){
            return "Persona : " + this.nom.toUpperCase() + ".";
        }

    }
}
