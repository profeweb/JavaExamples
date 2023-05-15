package planetari;

public class Planetari {

    public static void main(String[] args){

        CosAstronomic[] cossos = new CosAstronomic[12];

        // 1 Estrella
        cossos[0] = new Estrella ( "Sol", "2609", 'G', -26.8f );

        // 2 Planetes
        cossos[1] = new Planeta( "Terra" , "2641" , Planeta.TipusPlaneta.ROCOS, (Estrella)cossos[0]);
        cossos[2] = new Planeta( "Mart" , "2642" , Planeta.TipusPlaneta.ROCOS, (Estrella)cossos[0]);

        // 2 Satèlits
        cossos[3] = new Satellit("Lluna", "2600", Satellit.TipusSatelit.NATURAL, (Planeta)cossos[1]);
        cossos[4] = new Satellit("Deimos", "0000", Satellit.TipusSatelit.NATURAL, (Planeta)cossos[2]);

        // Imprimir els planetes creats
        for(int i=0; i<cossos.length; i++) {
            if(cossos[i]!=null && cossos[i].tipus== CosAstronomic.Tipus.PLANETA) {
                cossos[i].print();
            }
        }

        // Imprimir els satèl·lits creats
        for(int i=0; i<cossos.length; i++) {
            if(cossos[i]!=null && cossos[i] instanceof Satellit) {
                cossos[i].print();
            }
        }


    }
}
