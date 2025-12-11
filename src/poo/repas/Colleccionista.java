package poo.repas;

public class Colleccionista {

    private String nom;
    private int anys;

    private Segell[] segells;
    private int numSegells;

    private Xapa[] xapes;
    private int numXapes;

    public Colleccionista(String nom, int anys){
        segells = new Segell[100];
        numSegells = 0;

        xapes = new Xapa[100];
        numXapes = 0;
    }

    // Getters i Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnys() {
        return anys;
    }

    public void setAnys(int anys) {
        this.anys = anys;
    }

    public Segell getSegellAt(int i) {
        return segells[i];
    }

    public int getNumSegells() {
        return numSegells;
    }

    public Xapa getXapaAt(int i) {
        return xapes[i];
    }

    public int getNumXapes() {
        return numXapes;
    }

    // Mètodes d'Agregació

    public void addSegell(Segell s){
        segells[numSegells] = s;
        numSegells++;
    }

    public void addXapa(Xapa x){
        xapes[numXapes] = x;
        numXapes++;
    }

    // Altres
    public Segell segellMesActual(){
        int maximAnys = 0;
        Segell maxSegell = null;
        for(int i=0; i<numSegells; i++){
            if(segells[i].getAnys()>maximAnys){
                maximAnys = segells[i].getAnys();
                maxSegell = segells[i];
            }
        }
        return maxSegell;
    }

    public Xapa xapaMesAntiga(){
        int minimAnys = Integer.MAX_VALUE;
        Xapa minXapa = null;
        for(int i=0; i<numXapes; i++){
            if(xapes[i].getAnys()<minimAnys){
                minimAnys = xapes[i].getAnys();
                minXapa = xapes[i];
            }
        }
        return minXapa;
    }

    public double preuTotalColleccio(){
        double total = 0.0;
        for(int i=0; i<numSegells; i++){
            total += segells[i].getPreu();
        }
        for(int i=0; i<numXapes; i++){
            total += xapes[i].getPreu();
        }
        return total;
    }


    public static String getPaisXapa(Xapa x, Element[] elements){
        for(int i=0; i<elements.length; i++){
            String nomElement = elements[i].getNom();
            if(x.getNom().equals(nomElement)){
                return elements[i].getPais();
            }
        }
        return null;
    }
}
