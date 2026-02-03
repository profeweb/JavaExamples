package poo.generica;

public class MainCotxeria {

    public static void main(String[] args) {
        Cotxeria<String> cs;
        Cotxeria<Cotxe> cc;
        Cotxeria<Bici> cb;

        cs = new Cotxeria<>();
        cc = new Cotxeria<>();
        cb = new Cotxeria<>();

        cc.aparcaPlaça1(new Cotxe("3456XZ"));
        cc.aparcaPlaça2(new Cotxe("7654CZ"));
        boolean estaPle = cc.estaPlena();

    }

    public static class Cotxe {
        String matricula;
        Cotxe(String m){ this.matricula = m; }
    }

    public static class Bici {
        String matricula;
        Bici(String m){ this.matricula = m;}
    }
}
