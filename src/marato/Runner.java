package marato;

public class Runner {

    // Propietats
    private String name;
    private String team;
    private String[] raceIDs;
    private float[] times;
    private int numRaces;
    private boolean professional;

    public Runner(String name) {
        this.name = name;
    }

    public Runner(String name, String team, boolean professional) {
        this.name = name;
        this.team = team;
        this.professional = professional;
    }

    // Getters (Accesor)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    // Setters (mutador)

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    // Altres mètodes

    public void addRace(String idRace){

    }

    public void addTime(float time){

    }

    public float bestTime(){
        return 0;
    }

    public float averageTimes(){
        return 0;
    }

    public String bestRace(){
        return null;
    }


}
