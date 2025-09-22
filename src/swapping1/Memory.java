package swapping1;

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


}
