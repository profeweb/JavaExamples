package poo.abstracte;

public class MainAbstracte {

    public static void main(String[] args) {

        ClasseAbstracte ca;
        ClasseAbstracte.SubClasse1 sb1;

        //ca = new ClasseAbstracte("dfghj");  // Error ABSTRACTE
        sb1 = new ClasseAbstracte.SubClasse1("aa", 3);
    }

}
