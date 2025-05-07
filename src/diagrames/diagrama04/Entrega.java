package diagrames.diagrama04;

import java.util.ArrayList;

public class Entrega {
    private Tarea tarea;
    private Estudiante estudiante;
    private ArrayList<Archivo> archivos = new ArrayList<>();
    private double calificacion;

    public Entrega(Tarea tarea, Estudiante estudiante) {
        this.tarea = tarea;
        this.estudiante = estudiante;
    }

    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }
}

