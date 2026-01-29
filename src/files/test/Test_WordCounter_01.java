package files.test;

import files.WordCounter;
import processing.core.PApplet;

import java.io.File;

public class Test_WordCounter_01 extends PApplet {

    WordCounter wc;
    File f;

    public static void main(String[] args) {
        PApplet.main("files.test.Test_WordCounter_01");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){

        f = new File("C:\\Users\\tonim\\IdeaProjects\\JavaExamples\\data\\paraules.txt");
        wc = new WordCounter();
        wc.processDocument( f);
    }

    public void draw(){
        background(255);
        wc.display(this);
        noLoop();
    }
}
