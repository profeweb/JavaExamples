package diagrames.diagrama04;

import java.util.ArrayList;

public class Instructor extends Usuario {

    private ArrayList<Curso> cursos = new ArrayList<>();

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void calificarEntrega(Entrega entrega, double nota) {
        entrega.setCalificacion(nota);
    }
}

