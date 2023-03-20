package poo.herencia;

public class Persona {

    String nom;
    int edat;
    float pes;
    char grupSanguini;

    public Persona(String nom, int edat, float pes, char grupSanguini) {
        this.nom = nom;
        this.edat = edat;
        this.pes = pes;
        this.grupSanguini = grupSanguini;
    }

    // Getters i Setters ...

    void print(){
        System.out.printf("Persona: %s, %d anys, %f kg, sang: %c.\n",
                this.nom, this.edat, this.pes, this.grupSanguini);
    }




}
