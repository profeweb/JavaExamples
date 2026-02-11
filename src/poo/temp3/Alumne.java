package poo.temp3;

public class Alumne extends Persona{

    int curs;
    char grup;

    public Alumne(String nom, int edat, SEXE sexe, int curs, char grup){
        super(nom, edat, sexe);
        this.curs = curs;
        this.grup = grup;
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

    public void print(){
        String titol = sexe == SEXE.DONA ? "Alumna" : "Alumne";
        System.out.printf("%s %s va a %d - %c.\n", titol, nom, curs, grup);
    }

    public void printOverride(boolean b){
        if(b){
            this.print();
        }
        else {
            super.print();
        }
    }
}
