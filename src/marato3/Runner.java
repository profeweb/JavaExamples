package marato3;

public class Runner {

    // Atributs o propietats
    private String name;
    private String team;
    private String[] raceIDs;
    private float[] times;
    private int numRaces;
    private boolean professional;

    // Constructor(s)

    public Runner(String name){
        this.name = name;
        this.team = "Sense equip";
        this.raceIDs = new String[5];
        this.times = new float[5];
        this.numRaces = 0;
        this.professional = false;
    }

    public Runner(String name, String team, boolean professional){
        this.name = name;
        this.team = team;
        this.raceIDs = new String[5];
        this.times = new float[5];
        this.numRaces = 0;
        this.professional = professional;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String[] getRaceIDs() {
        return raceIDs;
    }

    public float[] getTimes() {
        return times;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public boolean isProfessional() {
        return professional;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    // Altres
    public void addRace(String raceID){
        if(numRaces<5){
            this.raceIDs[numRaces] = raceID;
            numRaces++;
        }
        else {
            System.out.println("Màxim esgotat de carreres.");
        }
    }

    public void addTime(float time){
        if(numRaces<=5){
            this.times[numRaces-1] = time;
        }
        else {
            System.out.println("Màxim esgotat de carreres.");
        }
    }

    public float bestTime(){
        float minTime = Float.MAX_VALUE;
        for(int i=0; i<numRaces; i++){
            if(times[i]<minTime){
                minTime = times[i];
            }
        }
        return minTime;
    }

    public float averageTimes(){
        if(numRaces==0){
            return 0;
        }
        else {
            float sumTimes = 0;
            for (int i = 0; i < numRaces; i++) {
                sumTimes += times[i];
            }
            return sumTimes / numRaces;
        }
    }

    public String bestRace(){
        float minTime = Float.MAX_VALUE;
        int index = -1;
        for(int i=0; i<numRaces; i++){
            if(times[i]<minTime){
                minTime = times[i];
                index = i;
            }
        }
        return raceIDs[index];
    }


}
