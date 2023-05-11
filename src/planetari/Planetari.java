package planetari;

public class Planetari {

    public static void main(String[] args){

        // 1 Estrella
        Estrella sol = new Estrella ( "Sol", "2609", 'G', -26.8f );

        // 2 Planetes
        Planeta terra, mart;

        terra = new Planeta( "Terra" , "2641" , Planeta.TipusPlaneta.ROCOS, sol);
        mart = new Planeta( "Mart" , "2642" , Planeta.TipusPlaneta.ROCOS, sol);

        // 2 variables Satèlits
        Satellit lluna, deimos;

        // Instanciar els 2 objectes Satèlit
        lluna = new Satellit("Lluna", "2600", Satellit.TipusSatelit.NATURAL, terra);
        deimos = new Satellit("Deimos", "0000", Satellit.TipusSatelit.NATURAL, mart);

        // Imprimir dades dels 5 cossos astronòmics creats
        sol.print();
        terra.print();
        mart.print();
        lluna.print();
        deimos.print();
    }
}
