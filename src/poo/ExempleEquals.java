package poo;

public class ExempleEquals {

    public static void main(String[] args) {

        Cotxe c1 = new Cotxe("PM12345CL");
        Cotxe c2 = new Cotxe("PM12345CL");

        System.out.println(c1);

        if(c1.equals(c2)){
            System.out.println("IGUALS");
        }
        else {
            System.out.println("DIFERENTS");
        }
    }

    public static class Cotxe {
        String matricula;
        int numPortes;
        enum COLOR { VERMELL, VERD, BLAU};
        COLOR color;

        public Cotxe(String m){
            this.matricula = m;
            this.numPortes = 5;
            this.color = COLOR.VERD;
        }

        // Setter i getters ...

        public boolean equals(Object c){
            Cotxe cc = (Cotxe) c;
            return this.matricula.equals(cc.matricula) &&
                    this.numPortes==cc.numPortes;
        }

    }
}
