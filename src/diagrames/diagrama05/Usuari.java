package diagrames.diagrama05;

import java.util.Arrays;
import java.util.Date;

public class Usuari {

    private String nom;
    private Prestec[] prestecs;
    private int numPrestecs;

    public Usuari(String nom) {
        this.nom = nom;
        this.prestecs = new Prestec[100]; // capacitat màxima de 100 préstecs
        this.numPrestecs = 0;
    }

    public String getNom() {
        return nom;
    }

    public void prestarLlibre(Llibre l) {
        if (numPrestecs < prestecs.length) {
            Prestec p = new Prestec(this, l, new Date());
            prestecs[numPrestecs] = p;
            numPrestecs++;
            l.setDisponible(false);
        } else {
            System.out.println("S'ha arribat al límit de préstecs per aquest usuari.");
        }
    }

    public Prestec[] getPrestecs() {
        return Arrays.copyOf(prestecs, numPrestecs); // retorna només els préstecs ocupats
    }
}
