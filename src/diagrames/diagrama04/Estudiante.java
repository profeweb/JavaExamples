package diagrames.diagrama04;

import java.util.ArrayList;

public class Estudiante extends Usuario {
    private ArrayList<Inscripcion> inscripciones = new ArrayList<>();

    public void inscribirse(Curso curso) {
        inscripciones.add(new Inscripcion(this, curso));
    }

    public void enviarEntrega(Tarea tarea, Archivo archivo) {
        Entrega entrega = new Entrega(tarea, this);
        entrega.agregarArchivo(archivo);
    }
}
