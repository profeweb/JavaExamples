package abstracte;

public class MainAbstracta {

    public static void main(String[] args) {

        // La seguent línia no és possible (error). Perquè no podem instanciar objectes d'una classe Abstracta
        //CosaAbstracta ca = new CosaAbstracta();

        // Si podem instanciar objectes de classe FillaAbstracta que hereta d'una classe abstracta CosaAbstracta.
        FillaAbstracta fa = new FillaAbstracta();

        // La subclasse FillaAbstracta hereta les propietats i mètodes de la superclasse asbtracta CosaAbstracta
        fa.print();
    }
}
