package notesalumnes;

public class MainNotesAlumnes {

    public static Alumne[] alumnes;

    public static void main(String[] args) {

        alumnes = new Alumne[100];

        alumnes [0] = new Alumne( "Maria" );
        alumnes [1] = new Alumne( "Jaume" );
        alumnes [2] = new Alumne( "Pep" );

        alumnes [0].setHistorialNotes( new Nota("Anglès", 6.0f, 0.5f) );
        alumnes [0].setHistorialNotes( new Nota("Mates", 10.0f, 0.5f) );
        alumnes [1].setHistorialNotes( new Nota("Català", 9.0f, 0.75f) );

        System.out.println( alumnes [2].getId() );
        System.out.println( alumnes [0].getNumNotes() );
        System.out.println( alumnes [1].getHistorialNotes(0).getValor() );
        System.out.println( alumnes [0].calcMitjanaPonderadaNotes() );

    }

    public static void agregarNota(Nota n, String id){
        for(int i=0; i<alumnes.length; i++){
            if(alumnes[i].getId().equals(id)){
                alumnes[i].setHistorialNotes(n);
                break;
            }
        }

    }

    public static String alumneAssignatura(String assignatura){

        float notaMax = 0.0f;
        String idAlumne = null;

        for(int i=0; i<alumnes.length; i++){
            Alumne a = alumnes[i];
            for(int j=0; j<a.getNumNotes(); j++){
                Nota n = a.getHistorialNotes(j);
                if(n.getAssignatura().equals(assignatura)){
                    float np = n.getValor()* n.getPes();
                    if(np > notaMax){
                        notaMax = np;
                        idAlumne = a.getId();
                    }
                }
            }
        }
        return idAlumne;

    }

    public static int quantesNotes(String assignatura){

        int quantes = 0;

        for(int i=0; i<alumnes.length; i++){
            Alumne a = alumnes[i];
            for(int j=0; j<a.getNumNotes(); j++){
                Nota n = a.getHistorialNotes(j);
                if(n.getAssignatura().equals(assignatura) &&
                        n.getValor()>= 5){
                    quantes ++;
                }
            }
        }
        return quantes;
    }

}
