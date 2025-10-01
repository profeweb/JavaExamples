package scheduler1;

import processing.core.PApplet;

public class Scheduler {

    enum POLITICA {FIFO, SHORT_JOB_FIRST, SHORT_REMAINING_JOB_FIRST, ROUND_ROBIN};
    POLITICA politica;

    int ciclesQuantum;
    int indexRR;
    int currentQuantum;

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

    public void setCiclesQuantum(int q){
        this.ciclesQuantum = q;
        this.currentQuantum = 0;
        this.indexRR = 0;
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
        if (politica == POLITICA.FIFO) {
            return procesos[0];
        }
        else if (politica == POLITICA.SHORT_JOB_FIRST) {
            return getShortestProces();
        }
        else if (politica == POLITICA.SHORT_REMAINING_JOB_FIRST) {
            return getShortestRemainigProces();
        }
        else if (politica == POLITICA.ROUND_ROBIN) {
            return getNextProces();
        }
        else {
            return null;
        }
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
            if(politica == POLITICA.ROUND_ROBIN){
                updateQuantum(current);
            }
            log += "Cycle "+ numCicles + ": running " + current.nom + "\n";
            if(current.estat == Proces.ESTAT.FINISHED){
                exitProces(current);
            }
        }
        numCicles++;
    }

    void updateQuantum(Proces current){

        currentQuantum++;

        if(current.estat == Proces.ESTAT.FINISHED) {
            currentQuantum = 0;
            nextRoundRobin(true);
        }
        else if(currentQuantum == ciclesQuantum){
            procesos[indexRR].estat = Proces.ESTAT.WAITING;
            nextRoundRobin(false);
        }
    }

    public void nextRoundRobin(boolean finished){
        if(!finished) {
            indexRR++;
            if (indexRR == numProcesos) {
                indexRR = 0;
            }
        }
        else {
            System.out.println("FINISHED " + indexRR);
            if(indexRR >= numProcesos-1){
                indexRR = 0;
            }
            System.out.println("FINISHED " + indexRR);
        }
        currentQuantum = 0;
    }

    public void display(PApplet p5, float x, float y, float s){
        p5.pushStyle();

        p5.fill(0); p5.textSize(24); p5.textAlign(p5.LEFT);
        p5.text("Scheduler " + this.politica, x, y);

        p5.textSize(18);
        p5.text("Num Procesos: "+ numProcesos, x, y + 40);
        p5.text("Num Cicles: "+ numCicles, x, y + 60);

        p5.text("Quantum: "+ currentQuantum + "/" + ciclesQuantum, x, y + 80);
        p5.text("Index Round Robin: "+ indexRR, x, y + 100);

        for(int i=0; i<numProcesos; i++){
            procesos[i].display(p5, x + 200 + i*(s+5), y + 40, s, s);
        }

        p5.fill(0);
        p5.text(log, x, y + 140);
        p5.popStyle();
    }


    public Proces getShortestProces(){
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i=0; i<numProcesos; i++){
            if(procesos[i].numCiclesCPU< minCicles){
                minCicles = procesos[i].numCiclesCPU;
                shortest = procesos[i];
            }
        }
        return shortest;
    }

    public Proces getShortestRemainigProces(){
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i=0; i<numProcesos; i++){
            if(procesos[i].numPendingCicles< minCicles){
                minCicles = procesos[i].numPendingCicles;
                shortest = procesos[i];
            }
        }
        return shortest;
    }

    public Proces getNextProces(){
        return procesos[indexRR];
    }

}
