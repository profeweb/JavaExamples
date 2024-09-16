package marato2;

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

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    // Altres
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
        float sumTimes = 0;
        for(int i=0; i<numRunners; i++){
            sumTimes += runners[i].averageTimes();
        }
        return  sumTimes / numRunners;
    }
}
