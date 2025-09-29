package swapping2;

import processing.core.PApplet;

public class Memory {

    int mida;
    Proces[] procesos;
    int numProcesos;
    int freeAddress;

    Memory(int m){
        this.mida = m;
        procesos = new Proces[100];
        numProcesos = 0;
        freeAddress = 0;
    }

    void swapIn(Proces p){
        if(freeAddress + p.mida < mida) {
            procesos[numProcesos] = p;
            numProcesos++;
            p.setAddress(freeAddress);
            freeAddress += p.mida;
        }
        else {
            System.out.println("Error SWAP In del procés "+p.nom+"!");
        }
    }

    void swapOut(Proces p){
        for(int i=0; i<numProcesos; i++){
            if(procesos[i]==p){
                procesos[i] = null;
                numProcesos--;
                System.out.println("SWAPPED OUT "+ p.nom);
            }
        }
    }


    void display(PApplet p5){

        p5.stroke(0); p5.strokeWeight(3); p5.fill(220);
        p5.rect(100, 100, mida, 300);

        p5.fill(0); p5.textSize(20); p5.textAlign(p5.LEFT);
        p5.text("Memòria RAM", 100, 60);
        p5.text("Total: "+mida, 100, 400);

        int mo = calculaMemoriaOcupada();
        p5.text("Ocupada: "+mo, 100, 540);

        int ml = mida - mo;
        p5.text("Lliure: "+ml, 100, 500);

        int np = numProcessos();
        p5.text("Num Procesos Actius: "+np, 100, 620);


        for(int i=0; i<procesos.length; i++){
            if(procesos[i]!=null) {
                procesos[i].display(p5, 100, 100, 300);
            }
        }

    }

    int calculaMemoriaOcupada(){
        int total = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i]!=null) {
                total += procesos[i].mida;
            }
        }
        return total;
    }

    int numProcessos(){
        int total = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i]!=null) {
                total ++;
            }
        }
        return total;
    }


}
