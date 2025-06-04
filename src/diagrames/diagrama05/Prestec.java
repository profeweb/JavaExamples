package diagrames.diagrama05;

import java.util.Date;

public class Prestec {

    private Usuari usuari;
    private Llibre llibre;
    private Date dataPrestec;

    public Prestec(Usuari usuari, Llibre llibre, Date dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
    }

    public Llibre getLlibre() { return llibre; }

    public Usuari getUsuari() { return usuari; }
}
