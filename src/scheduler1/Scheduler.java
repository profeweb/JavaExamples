package scheduler1;

import processing.core.PApplet;

public class Scheduler {

    enum POLITICA {FIFO, SHORT_JOB_FIRST, SHORT_REMAINING_JOB_FIRST, ROUND_ROBIN};
    POLITICA politica;

    Proces[] procesos;
    int numProcesos;

    int numCicles = 0;
    String log;

    public Scheduler(){
        this.procesos = new Proces[10];
        this.numProcesos = 0;
        this.politica = POLITICA.FIFO;
        log = "";
    }

    public void setPolitica(POLITICA politica){
        this.politica = politica;
    }


    public void enterProces(Proces p){
        if(numProcesos<procesos.length-1) {
            procesos[numProcesos] = p;
            numProcesos++;
        }
    }

    public void exitProces(Proces p){
        int indexCurrent = getIndexProces(p);
        for(int i= indexCurrent; i<numProcesos; i++){
            procesos[i] = procesos[i+1];
        }
        numProcesos--;
    }

    public Proces getCurrentProces(){
        return null;
    }

    public int getIndexProces(Proces p){
        for(int i=0; i<numProcesos; i++){
            if(procesos[i]==p){
                return  i;
            }
        }
        return  -1;
    }

    public void run(){
        Proces current = getCurrentProces();
        if(current!=null) {
            current.run();
            log += "Cycle "+ numCicles + ": running " + current.nom + "\n";
            if(current.estat == Proces.ESTAT.FINISHED){
                exitProces(current);
            }
        }
        numCicles++;
    }



    public void display(PApplet p5, float x, float y, float s){
        p5.pushStyle();

        p5.fill(0); p5.textSize(24); p5.textAlign(p5.LEFT);
        p5.text("Scheduler " + this.politica, x, y);

        p5.textSize(18);
        p5.text("Num Procesos: "+ numProcesos, x, y + 40);
        p5.text("Num Cicles: "+ numCicles, x, y + 60);

        for(int i=0; i<numProcesos; i++){
            procesos[i].display(p5, x + 200 + i*(s+5), y + 40, s, s);
        }

        p5.fill(0);
        p5.text(log, x, y + 140);
        p5.popStyle();
    }

}
