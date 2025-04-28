package diagrames.diagrama01;

import java.util.Date;

public class Prestamo {

    // Atributs
    private Date fechaInicio;
    private Date fechaFin;
    private Usuario usuario;
    private Material[] materiales;


    // Constructor

    public Prestamo(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Altres
    public void registrarDevolucion(){ }
}
