package scheduler1;

public class SchedulerSJF extends Scheduler{

    public SchedulerSJF(){
        super();
        setPolitica(POLITICA.SHORT_JOB_FIRST);
    }

    public Proces getCurrentProces(){
        return getShortestProces();
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

}
