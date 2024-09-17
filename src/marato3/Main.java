package marato3;

public class Main {

    public static void main(String[] args) {

        // Objectes de classe Runner
        Runner r1, r2;

        // Constructor(s) de la classe Runner
        r1 = new Runner("Paco");
        r1.setTeam("Equip A");
        r1.setProfessional(true);

        r2 = new Runner("Bel", "Maravillas", true);
        r2.setTeam("Equip B");

        // Mètodes de la classe Runner
        r1.addRace("Palma");
        r1.addTime(12.5f);

        r1.addRace("Inca");
        r1.addTime(12.24f);

        r2.addRace("Palma");
        r2.addTime(14.75f);

        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f. \n",
                r1.getName(), r1.bestRace(), r1.bestTime());


        // Objectes de la classe Team
        Team t1, t2;

        // Constructor(s) de la classe Team
        t1 = new Team("Equip A", true);
        t2 = new Team("Equip B", false);

        // Mètodes de la classe Team
        t1.addRunner(r1);
        t2.addRunner(r2);

        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t1.getName(), t1.averageTimes());

        // Objectes de la classe Race
        Race c1, c2;

        // Constructor(s) de la classe Race
        c1 = new Race("Carrera 1", false, 13);

        // Mètodes de la classe Race
        c1.addRunner(r1);
        c1.addTimeToRunner(r1, 12.5f);

        c1.addRunner(r2);
        c1.addTimeToRunner(r2, 14.3f);

        System.out.printf("Millor corredor/a de la carrera %s és %s amb temps %.2f. \n", c1.getRaceID(), c1.bestRunner(), c1.bestTime());

        // Mètodes Generals

        // Millor corredor/a professional d'un determinat equip
        System.out.printf("%s és el millor corredor/a de l'equip %s.\n", bestProfessionalRunnerOfTeam(t1), t1.getName());

        // Corredors classificats d'una determinad carrera
        // Versió 1) void
        printClassifiedRunners(c1, t1.getName());

        // Versió 2) Array
        Runner[] classified = getClassifiedRunners(c1, t1.getName());
        System.out.printf("Classificats de la carrera %s:\n", c1.getRaceID());
        for(int i=0; i<classified.length; i++){
            if(classified[i]!=null){
                System.out.printf("\t%s.\n", classified[i].getName());
            }
        }

        // Millor equip
        Team[] teams = {t1, t2};
        System.out.printf("%s és el millor equip.\n", bestTeam(teams));

    }

    public static String bestProfessionalRunnerOfTeam (Team t){
        float minTime = Float.MAX_VALUE;
        String name = "";                           // int index = -1;
        for(int i=0; i<t.getNumRunners();  i++){
            Runner r = t.getRunners()[i];
            if(r.isProfessional()){
                float time = r.bestTime();
                if(time < minTime){
                    minTime = time;
                    name = r.getName();             // index = i;
                }
            }
        }
        return name;                                // return t.getRunners[index].getName();
    }

    public static String bestTeam(Team[] teams){
        float minTime = Float.MAX_VALUE;
        int index = -1;
        for(int i=0; i<teams.length; i++){
            float time = teams[i].averageTimes();
            if(time < minTime){
                minTime = time;
                index = i;
            }
        }
        return teams[index].getName();
    }

    public static void printClassifiedRunners(Race r, String nameTeam){
        System.out.printf("Corredors classificats a la carrera %s: \n", r.getRaceID());
        for(int i=0; i<r.getNumRunners(); i++){
            Runner runner = r.getRunners()[i];
            float time = r.getTimes()[i];
            if(time < r.getClassificationTime() && runner.getTeam()== nameTeam){
                System.out.printf("\t%s amb temps %.2f.\n", runner.getName(), time);
            }
        }
    }

    public static Runner[] getClassifiedRunners(Race r, String nameTeam){
        Runner[] classified = new Runner[r.getNumRunners()];
        int numClassified = 0;
        for(int i=0; i<r.getNumRunners(); i++){
            Runner runner = r.getRunners()[i];
            float time = r.getTimes()[i];
            if(time < r.getClassificationTime() && runner.getTeam()== nameTeam){
                classified[numClassified] = runner;
                numClassified++;
            }
        }
        return classified;
    }
}
