package diagrames.diagrama04;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private Instructor instructor;
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public Curso(String nombre, Instructor instructor) {
        this.nombre = nombre;
        this.instructor = instructor;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public ArrayList<Tarea> listarTareas() {
        return tareas;
    }
}

