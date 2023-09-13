package marato;

public class Race {

    // Propietats
    private String raceID;
    private Runner[] runners;
    private float[] times;
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    // Constructor(s)
    public Race(String raceID) {
        this.raceID = raceID;
    }

    // Getters
    public String getRaceID() {
        return raceID;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public boolean isFinals() {
        return isFinals;
    }

    public void setFinals(boolean finals) {
        isFinals = finals;
    }

    public int getNumRunners() {
        return numRunners;
    }

    // Setters
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public float getClassificationTime() {
        return classificationTime;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }

    public void addRunner(Runner r){

    }

    public void addTimeToRunner(Runner r, float time){ }

    public float bestTime(){ return 0; }

    public String bestRunner(){ return null; }

    public float averageTimes(){ return 0; }
}
