package diagrames.diagrama01;

// Classe que hereta de Usuario

public class Profesor extends Usuario {

    // Atributs
    private String numeroEmpleado;
    private String departamento;


    // Constructor
    public Profesor(int id, String nombre, String numeroEmpleado, String departamento) {
        super(id, nombre);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
    }

    // Getters

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }


    // Setters

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
