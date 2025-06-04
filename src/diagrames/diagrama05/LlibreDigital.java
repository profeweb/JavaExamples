package diagrames.diagrama05;

public class LlibreDigital extends Llibre {

    private String enllaçDescarrega;

    public LlibreDigital(String titol, String autor, String enllaçDescarrega) {
        super(titol, autor);
        this.enllaçDescarrega = enllaçDescarrega;
    }

    public String getEnllaçDescarrega() { return enllaçDescarrega; }
}
