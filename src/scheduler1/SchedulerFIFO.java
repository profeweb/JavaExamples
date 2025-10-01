package scheduler1;

public class SchedulerFIFO extends Scheduler{

    public SchedulerFIFO(){
        super();
        setPolitica(POLITICA.FIFO);
    }

    public Proces getCurrentProces(){
        return procesos[0];
    }
}
