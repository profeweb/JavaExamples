package marato3;

public class Team {

    // Propietats
    private String name;
    private Runner[] runners;
    private int numRunners;
    private boolean international;

    // Constructor

    public Team(String name, boolean international) {
        this.name = name;
        this.international = international;
        this.runners = new Runner[5];
        this.numRunners = 0;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public Runner[] getRunners(){ return runners; }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    // Altres Mètodes

    public void addRunner(Runner r){
        if(numRunners<5) {
            runners[numRunners] = r;
            numRunners++;
        }
        else {
            System.out.println("Màxim esgotat de runners en un equip.");
        }
    }

    public float averageTimes(){
        if(numRunners == 0){
            return 0;
        }
        else {
            float sumTimes = 0;
            for (int i = 0; i < numRunners; i++) {
                sumTimes += runners[i].averageTimes();
            }
            return sumTimes / numRunners;
        }
    }


    public int getNumProfessionals(){
        int np = 0;
        for(int i=0; i<numRunners; i++){
            Runner ri = runners[i];
            if(ri.isProfessional()){
                np++;
            }
        }
        return np;
    }


    public boolean areAllProfessional(){
        for(int i=0; i<getNumRunners(); i++){
            Runner ri = getRunners()[i];
            if(!ri.isProfessional()){
                return false;
            }
        }
        return true;
    }

    public boolean areAllProfessional2(){
        return getNumRunners() == getNumProfessionals();
    }
}
