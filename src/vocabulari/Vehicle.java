package vocabulari;

public abstract class Vehicle {

    //Propietats, atributs o variables de classe
    String matricula;
    int numRodes;

    //Mètodes o funcions de classe

    // Constructor(s): mètode per instanciar / crear objectes de la classe
    public Vehicle(String matricula, int nr){
        this.matricula = matricula;
        numRodes = nr;
    }

    public Vehicle(String matricula){
        this.matricula = matricula;
        this.numRodes = 4;
    }

    // Exemple de sobre-càrrega (overload): funcions amb el mateix nom i diferents paràmetres

    // Setters (Mutadores): permeten modificar el valor d'un o més atributs de la classe
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    // Getter (Accesores): permeten accedir al valor d'un atribut de la classe
    public String getMatricula(){
        return this.matricula;
    }

    // Sobre-escritura (override) dels mètodes heretats de la classe Object
    public boolean equals(Object object){
        Vehicle altre = (Vehicle) object;  // Casting descendent (de superclasse a subclasse)
        return this.matricula.equalsIgnoreCase(altre.matricula);
    }

    //Sobre-escritura (override) del mètode toString heretat de la classe Object
    public String toString(){
        return "VEHICLE: "+matricula+" ("+numRodes+")";
    }

}
