package basics;

class ImprimirEnumerats {

    // Definició dels tipus enumerats
     enum Sexe {HOME, DONA};
     enum EstatCivil {SOLTER, CASAT, DIVORCIAT};
     enum EstatLaboral {ESTUDIA, TREBALLA, ATUR, JUBILAT};
     enum Estudis {CAP, ESO, BATXILLER, FP, UNIVERSITAT};

    public static void main(String[] args) {

        // Variables de diferets tipus enumerats
        Sexe a = Sexe.HOME;
        Sexe b = Sexe.DONA;
        EstatCivil c = EstatCivil.SOLTER;
        EstatLaboral d = EstatLaboral.ATUR;
        Estudis e = Estudis.FP;

        // Impressió dels valors de les variable
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}