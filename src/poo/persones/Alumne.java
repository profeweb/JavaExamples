package poo.persones;

public class Alumne extends Persona{

    int curs;
    char grup;

    Alumne(String n, int e, SEXE s, int c, char g){
        super(n, e, s);  // Crida al constructor de la super-classe
        this.curs = c;
        this.grup = g;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public char getGrup() {
        return grup;
    }

    public void setGrup(char grup) {
        this.grup = grup;
    }

    @Override
    public void imprimir() {
        System.out.printf("%s va a %d - %c.%n", nom, curs, grup);
    }
}
