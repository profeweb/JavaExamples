package notesalumnes;

public class Nota {

    private String assignatura;       // identificador de l’assignatura
    private float valor;              // valor de la nota (0.0-10.0)
    private float pes;               // pes a la nota final (0.0-1.0)

    // Constructor
    public Nota(String a, float v, float p ){
        this.assignatura = a;
        this.valor = v;
        this.pes = p;
    }

    // Getters

    public String getAssignatura( ) {
        return assignatura;
    }

    public float getValor( ) {
        return valor;
    }

    public float getPes () {
        return pes;
    }
}
