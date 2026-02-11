package notesalumnes;

public class Alumne {

    private String id;                  // identificador de l'alumne/a
    private Nota[ ] historialNotes;       // dades de les notes
    private int numNotes = 0;           // número de notes


    //constructor per a un nou alumne/a
    public Alumne( String id ) {
        this.id = id;
        this.historialNotes = new Nota[100];
    }


    // constructor per a un alumne/a transferit d’una altra classe
    public Alumne( String id, Nota[ ] notes, int n ){
        this.id = id;
        this.historialNotes = notes;
        this.numNotes = n;
    }

    public int getNumNotes( ){
        return numNotes;
    }

    public String getId( ) {
        return id;
    }

    public Nota getHistorialNotes(int n){
        return this.historialNotes[n];
    }

    public void setHistorialNotes( Nota n ){
        historialNotes[numNotes] = n;
        numNotes = numNotes + 1;
    }

    // calcula la mitjana ponderada de les notes de l’alumne/a
    public double calcMitjanaPonderadaNotes( ){
        double nota = 0.0;
        for(int i=0; i<numNotes; i++){
            nota = nota + historialNotes[i].getValor() *
                    historialNotes[i].getPes();
        }
        return nota;
    }

    // calcula la millor nota
    public String millorNota( ) {
        float notaMax = 0.0f;
        String assignatura="";
        for (int i=0; i<numNotes; i++) {
            if (historialNotes[i].getValor() > notaMax) {
                notaMax = historialNotes[i].getValor();
                assignatura = historialNotes[i].getAssignatura();
            }
        }
        return assignatura;
    }

}
