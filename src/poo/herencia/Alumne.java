package poo.herencia;

public class Alumne extends Persona {

    int curs;
    char grup;

    Alumne(String n, int e, float p, char g, int c, char grup){
        super(n, e, p, g);
        this.curs = c;
        this.grup = grup;
    }

    @Override
    void print(){
        System.out.printf("Alumne/a: %s, %d anys, %d-%c.\n",
                this.nom, this.edat, this.curs, this.grup);
    }


}
