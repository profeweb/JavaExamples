package basics;

public class ExempleStatic {

    public static void main(String[] args) {
        Cosa c1 = new Cosa( "Cosa 1", 5.75f);
        System.out.println(c1.nom);
        Cosa c2 = new Cosa( "Cosa 2", 2.5f);
        System.out.println(Cosa.n);
        System.out.println(Cosa.total);

        // Cridades a mètodes no estàtics
        c1.metode2();
        c2.metode2();

        // Cridada a mètode estàtic
        Cosa.metode1();
    }


    public static class Cosa {

        static int n = 0;
        static float total = 0;
        String nom;
        float preu;

        public Cosa(String nom, float preu){
            this.n++; this.total += preu;
            this.nom = nom; this.preu = preu;
        }

        public static void metode1(){}
        public void metode2(){}
    }
}
