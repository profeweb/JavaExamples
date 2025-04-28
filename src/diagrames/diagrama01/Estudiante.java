package diagrames.diagrama01;

// Classe que hereta de Usuario

public class Estudiante extends Usuario {

    // Atributs
    private String matricula;
    private String carrera;

    // Constructor
    public Estudiante(int id, String nombre, String matricula, String carrera) {
        super(id, nombre);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Getters

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }


    // Setters

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
