package files.test;

import files.DiccionariLema;
import processing.core.PApplet;

public class Test_LemmaDic_01 extends PApplet {

    static final String filePath = "C:\\Users\\tonim\\IdeaProjects\\JavaExamples\\data\\lemmatization-ca.txt";
    DiccionariLema lemaDic;
    String lemma, terme;

    public static void main(String[] args) {
        PApplet.main("files.test.Test_LemmaDic_01");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){

        // Fil d'execució per a crear el diccionari de lemes
        Thread filCreaDiccionari = new Thread() {
            public void run() {
                lemaDic = new DiccionariLema(filePath);
            }
        };
        filCreaDiccionari.start();

        // Terme del qual cercar el lema
        terme = "bandolejaria";
    }

    public void draw(){

        background(255);
        if(lemaDic!=null && lemaDic.isFet()) {
            // Consuta el lema del terme en el diccionari
            lemma = lemaDic.getLemma(terme);
            fill(0); textSize(18);
            text("Terme: " + terme, 100, 100);
            if (lemaDic.containsLemma(terme)) {
                text("Lema: " + lemma, 100, 150);
            } else {
                text("Sense lema en el diccionari.", 100, 150);
            }
            noLoop();
        }
        else {
            fill(255, 0, 0); textSize(24);
            text("Processant diccionari...", 100, 100);
        }
    }
}
