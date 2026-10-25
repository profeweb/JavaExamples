package swappin123;

import processing.core.PApplet;

public class Memory {

    int mida;
    Proces[] procesos;
    int numProcesos;

    Hole[] holes;
    int numHoles;

    public Memory(int m){
        this.mida = m;
        this.procesos = new Proces[100];
        this.numProcesos =0;
        this.holes = new Hole[100];
        this.numHoles = 0;

        addHole(0, m);
    }

    public void addHole(int a, int m){
        this.holes[numHoles] = new Hole(a, m);
        this.numHoles++;
    }

    public void swapIn(Proces p){
        boolean swapped = false;
        for(int i=0; i<numHoles; i++){
            if(holes[i]!=null &&
                    holes[i].mida>=p.mida){
                int espaiRestant = holes[i].mida - p.mida;

                procesos[numProcesos] = p;
                p.setAddress(holes[i].address);
                numProcesos++;
                swapped = true;
                System.out.println("SWAP IN del Procés " + p.nom);

                holes[i].address += p.mida;
                holes[i].mida = espaiRestant;
                if(espaiRestant==0){
                    holes[i] = null;
                    System.out.println("Hole removed!!!");
                }
            }
        }
        if(!swapped){
            System.out.println("Error de SWAP IN del procés "+ p.nom);
        }
    }

    public void swapOut(Proces p){
        for(int i=0; i<this.numProcesos; i++){
            if(this.procesos[i].equals(p)){
                this.procesos[i] = null;
                addHole(p.address, p.mida);
                System.out.println("Swap out "+ p.nom);
            }
        }
    }

    public void display(PApplet p5){

        p5.stroke(0); p5.strokeWeight(3); p5.fill(220);
        p5.rect(100, 100, mida, 300);

        p5.fill(0); p5.textSize(20); p5.textAlign(p5.LEFT);
        p5.textAlign(p5.LEFT);
        p5.text("Memòria RAM", 100, 60);
        p5.text("Total: "+mida, 100, 400);

        int mo = calculaMemoriaOcupada();
        p5.text("Ocupada: "+mo, 100, 540);

        int ml = mida - mo;
        p5.text("Lliure: "+ml, 100, 500);

        int np = getNumProcesos();
        p5.text("Num Procesos Actius: "+np, 100, 620);

        int nf = numForats();
        p5.text("Num Forats: "+ nf, 100, 660);

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

    int numForats(){
        int total = 0;
        for(int i=0; i<numHoles; i++){
            if(holes[i]!=null){
                total++;
            }
        }
        return total;
    }

    int getNumProcesos(){
        int total = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i]!=null) {
                total ++;
            }
        }
        return total;
    }

    int[] getNumProcesosMmeoriaOccupada(){
        int total = 0;
        int n = 0;
        for(int i=0; i<procesos.length; i++){
            if(procesos[i]!=null) {
                total += procesos[i].mida;
                n++;
            }
        }

        int[] dades = new int[2];
        dades[0] = total;
        dades[1] = n;
        return dades;
    }


    public void compactaForats(int n1, int n2){
        if(holes[n1].address<holes[n2].address){
            holes[n1].mida += holes[n2].mida;
            holes[n2] = null;
        }
        else {
            holes[n2].mida += holes[n1].mida;
            holes[n1] = null;
        }
    }

    int getHoleMinAddress(){
        int minAddress = mida;
        int num = -1;
        for(int i=0; i<numHoles; i++){
            if(holes[i]!=null &&
            holes[i].address<minAddress){
                minAddress = holes[i].address;
                num = i;
            }
        }
        return num;
    }




}
