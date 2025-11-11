package strings;

public class StringMethods {

    public static void main(String[] args) {

        String x = "Hello";

        // Llargada de l'string
        int n = x.length();
        System.out.printf("La llargada de %s és %d.\n", x, n);

        // Caràcter a una posició
        int p = 0;
        char c = x.charAt(p);
        System.out.printf("La lletra %d de %s és %c.\n", p, x, c);

        // Imprimir String lletra per lletra
        for(int i=0; i<x.length(); i++){
            System.out.printf("%d : %c.\n", i, x.charAt(i));
        }

        // Imprimir String lletra per lletra a l'inrevés
        int j = x.length()-1;
        while(j>=0){
            System.out.printf("%d : %c.\n", j, x.charAt(j));
            j--;
        }

        // Comptar el número d'As que hi ha a l'String
        int numAs = 0;
        for(int i=0; i<x.length(); i++) {
            if(x.charAt(i)=='a' || x.charAt(i)=='A'){
                numAs++;
            }
        }
        System.out.printf("%s té %d As.\n", x, numAs);

        // Comença amb vocal?
        boolean vocal = x.startsWith("a") ||
                        x.startsWith("e")  ||
                        x.startsWith("i")  ||
                        x.startsWith("o")  ||
                        x.startsWith("u") ;
        System.out.printf("%s comença amb vocal: %b.\n", x, vocal);

        // Paraula capicua
        String z = "dabalearrozalazorraelabad";
        boolean capicua = true;
        for(int i=0; i<z.length()/2; i++){
            if(z.charAt(i)!=z.charAt(z.length()-i-1)){
                capicua = false;
                break;
            }
        }
        System.out.printf("%s és capicua: %b.\n", z, capicua);

        // Canvi de As per Es
        String s1 = "AMAYA", s2="";
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)=='A'){
                s2 += 'E';
            }
            else {
                s2 += s1.charAt(i);
            }
        }
        System.out.printf("%s sense As és %s.\n", s1, s2);

        //Passar a majúscules un String
        String xMaj = x.toUpperCase();
        System.out.printf("%s en majúscules és %s.\n", x, xMaj);

        //Passar a minúscules un String
        String xMin = x.toLowerCase();
        System.out.printf("%s en minúscules és %s.\n", x, xMin);

        // Primera ocurrència d'un text (char o String)
        String m = "analfabet";
        int p1 = m.indexOf("fa");
        System.out.printf("fa es troba a %d de %s.\n", p1, m);

        // Primera ocurrència d'un text (char o String)
        int p2 = m.lastIndexOf("a");
        System.out.printf("La darrera a es troba a %d de %s.\n", p2, m);

        // Tros de l'String a partir de posició
        String tros1 = m.substring(2);
        System.out.printf("El tros de %s és %s.\n", m, tros1);

        // Tros de l'String entre dues posicions (la darrera no inclosa)
        String tros2 = m.substring(2, 6);
        System.out.printf("El tros de %s és %s.\n", m, tros2);

        // Agafar trossos entre espais en blanc
        String nomComplet = "Paco Perez Muñoz";
        int espai1 = nomComplet.indexOf(" ");
        int espai2 = nomComplet.lastIndexOf(" ");
        String nom = nomComplet.substring(0, espai1);
        String llinatge1 = nomComplet.substring(espai1+1, espai2);
        String llinatge2 = nomComplet.substring(espai2+1);
        System.out.printf("%s, %s, %s.\n", nom, llinatge1, llinatge2);

        // Comptar el número de paraules
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris commodo bibendum vulputate. Nunc sollicitudin, erat a mollis euismod, justo nisi cursus tortor, eget vulputate justo sapien semper tellus. Sed eget nibh finibus, vulputate elit in, sollicitudin justo. Aenean interdum urna arcu, id sollicitudin enim porta ac. Suspendisse potenti. Donec at.";
        int numP = 1;
        while(text.indexOf(" ")!=-1){
            numP++;
            text = text.substring(text.indexOf(" ")+1);
        }
        System.out.printf("Número de paraules: %d.\n", numP);

        // Reemplaçar les ocurrències d'un text (char o String) per un altre
        String q = "ANACARDO";
        String q2 = q.replace('A', 'E');
        System.out.printf("%s sense As és %s.\n", q, q2);

        // Concatenar dos Strings
        String a = "Hola", b = "Adeu";
        String ab = a.concat(b);
        System.out.printf("%s i %s junts és %s.\n", a, b, ab);

    }
}
