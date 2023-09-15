package marato;

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
    }

    public float averageTimes(){
        return 0;
    }
}
