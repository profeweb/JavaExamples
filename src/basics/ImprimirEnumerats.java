package basics;

class ImprimirEnumerats {
    public static void main(String[] args) {

        // Definició dels valors del tipus enumerat DIA
        enum DIA {DILLUNS, DIMARTS, DIMECRES, DIJOUS, DIVENDRES, DISSABTE, DIUMENGE };

        // Variable del tipus DIA
        DIA d = DIA.DIJOUS;
        
        // Imprimeix el valor de la variable d
        System.out.println(d);
    }
}