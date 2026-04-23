package vocabulari;

public abstract class Vehicle {

    //Propietats, atributs o variables de classe
    String matricula;
    int numRodes;

    // Propietat estàtica: comuna i única a tots els objetes de la classe
    public static int comptador = 0;

    //Mètodes o funcions de classe

    // Constructor(s): mètode per instanciar / crear objectes de la classe
    public Vehicle(String matricula, int nr){
        this.matricula = matricula;
        numRodes = nr;
        comptador++;
    }

    public Vehicle(String matricula){
        this.matricula = matricula;
        this.numRodes = 4;
        comptador++;
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

    // Mètode estàtic de la classe Vehicle
    public static int sumaRodes(){
        return comptador * 4;
    }

    public void print(){

    }

}
