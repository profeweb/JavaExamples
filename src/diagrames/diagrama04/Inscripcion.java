package diagrames.diagrama04;

import java.util.Date;

public class Inscripcion {
    private Estudiante estudiante;
    private Curso curso;
    private Date fecha;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = new Date();
    }

    public Curso getCurso() { return curso; }
    public Date getFecha() { return fecha; }
}

