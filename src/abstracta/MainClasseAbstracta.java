package abstracta;

public class MainClasseAbstracta {
    public static void main(String[] args) {
        // No podem crear instàncies de classes abstractes
        //ClasseAbstracta c = new ClasseAbstracta(10);
        //c.print();

        // Sí que podem crear objectes de subclasses de la classe asbtracte
        SubClasse sb = new SubClasse(10, 20);
        sb.print();
    }
}
