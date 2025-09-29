package swapping3;

import processing.core.PApplet;

public class Memory {

    int mida;
    Proces[] procesos;
    int numProcesos;

    Hole[] holes;
    int numHoles;

    Memory(int m){
        this.mida = m;
        procesos = new Proces[100];
        numProcesos = 0;

        numHoles = 0;
        holes = new Hole[100];
        addHole(0, m);
    }

    void addHole(int a, int m){
        holes[numHoles] = new Hole(a, m);
        numHoles++;
        System.out.println("New Hole");
    }

    void swapIn(Proces p){
        boolean swapped = false;
        for(int i=0; i<numHoles && !swapped; i++){
            if(holes[i]!=null && holes[i].mida >= p.mida){
                int espaiRestant = holes[i].mida - p.mida;
                procesos[numProcesos] = p;
                procesos[numProcesos].setAddress(holes[i].address);
                numProcesos++;
                swapped = true;
                System.out.println("SWAPPED IN "+ p.nom);

                holes[i].address = holes[i].address + p.mida;
                holes[i].mida = espaiRestant;
                if(holes[i].mida ==0){
                    holes[i] = null;
                    System.out.println("Hole Removed");
                }
            }
        }
        if(!swapped){
            System.out.println("Error SWAP In del procés "+p.nom);
        }
    }

    void swapOut(Proces p){
        for(int i=0; i<numProcesos; i++){
            if(procesos[i]==p){
                addHole(p.address, p.mida);
                procesos[i] = null;
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

        int nf = numForats();
        p5.text("Num Forats: "+nf, 100, 660);


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

    int numForats(){
        int total = 0;
        for(int i=0; i<holes.length; i++){
            if(holes[i]!=null) {
                total ++;
            }
        }
        return total;
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
                    holes[i].address < minAddress){
                minAddress = holes[i].address;
                num = i;
            }
        }
        return num;
    }

    int getProcesMinAddress(int posterior, int midaMinima){
        int minAddress = mida;
        int num = -1;
        for(int i=0; i<numProcesos; i++){
            if(procesos[i]!=null &&
                    procesos[i].address < minAddress &&
                    procesos[i].address>= posterior &&
                    procesos[i].mida <= midaMinima){
                minAddress = procesos[i].address;
                num = i;
            }
        }
        return num;
    }

    void mouProces(Proces p, int nH){
        Hole h = holes[nH];
        System.out.println("Movent procés "+p.nom + "al forat "+h.address);

        int oldAddress = p.address;
        p.address = h.address;

        h.address = p.address + p.mida;
        h.mida = h.mida - p.mida;
        if(h.mida==0){
            holes[nH] = null;
        }
        addHole(oldAddress, p.mida);


    }

    void compacta(){
        System.out.println("Inici de la Compactació de Memòria");

        int minHole;
        int possible;

        do {

            minHole = getHoleMinAddress();
            Hole h = holes[minHole];
            System.out.println(".... Forat amb adreça menor: "+h.address);

            possible = getProcesMinAddress(h.address, h.mida);

            if(possible!=-1){
                Proces p = procesos[possible];
                System.out.println(".... Procés amb possibilitat de moure's:"+p.nom);
                mouProces(p, minHole);
            }

        } while(possible!=-1);

        System.out.println("...Compactant els forats");
        boolean compactable;
        int nh1=-1, nh2=-1;
        do {
            compactable = false;
            for(int i=0; i<numHoles; i++){
                for(int j=0; j<numHoles; j++){
                    if(i!=j && holes[i]!=null && holes[j]!=null){
                        Hole h1 = holes[i];
                        Hole h2 = holes[2];
                        if ((h1.address+h1.mida == h2.address) ||
                                (h2.address+h2.mida == h1.address)){
                            compactable =true;
                            nh1 = i; nh2 = j;
                        }
                    }
                }
            }
            if(compactable){
                compactaForats(nh1, nh2);
            }
        } while(compactable);

        System.out.println("Final de la Compactació");
    }



}
