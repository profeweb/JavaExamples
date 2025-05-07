package diagrames.diagrama04;

import java.util.Date;

public class Tarea {
    private String titulo;
    private Date fechaLimite;

    public Tarea(String titulo, Date fechaLimite) {
        this.titulo = titulo;
        this.fechaLimite = fechaLimite;
    }

    public String getTitulo() { return titulo; }
    public Date getFechaLimite() { return fechaLimite; }
}
