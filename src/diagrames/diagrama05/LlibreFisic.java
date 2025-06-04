package diagrames.diagrama05;

public class LlibreFisic extends Llibre {

    private String ubicacioPrestatgeria;

    public LlibreFisic(String titol, String autor, String ubicacioPrestatgeria) {
        super(titol, autor);
        this.ubicacioPrestatgeria = ubicacioPrestatgeria;
    }

    public String getUbicacioPrestatgeria() { return ubicacioPrestatgeria; }

}
