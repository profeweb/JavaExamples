package diagrames.diagrama05;

public class Llibre {

    private String titol;
    private String autor;
    private boolean estaDisponible;

    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.estaDisponible = true;
    }

    public String getTitol() { return titol; }

    public boolean estaDisponible() { return estaDisponible; }

    public void setDisponible(boolean disponible) {
        this.estaDisponible = disponible;
    }

}
