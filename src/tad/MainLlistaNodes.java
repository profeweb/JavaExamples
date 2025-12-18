package tad;

import processing.core.PApplet;

public class MainLlistaNodes extends PApplet {

    LlistaNodes l;

    public static void main(String[] args) {
        PApplet.main("tad.MainLlistaNodes");
    }

    public void settings(){
        size(1600, 800);
    }

    public void setup(){
        l = new LlistaNodes();
        l.append(23);
        l.append(17);
        l.append(8);
        l.append(5);

        l.removeFirst();
    }

    public void draw(){
        background(200);
        l.display(this, 50, 120, 50);
    }

    public void keyPressed(){
        if(key=='a' || key=='A'){
            int n = (int)random(0, 100);
            l.append(n);
            println("APPEND: "+ n);
        }
        else if(key=='p' || key=='P'){
            int n = (int)random(0, 100);
            l.preppend(n);
            println("PREPPEND: "+ n);
        }
        else if(key=='i' || key=='I'){
            int i = (int)random(0, l.numNodes);
            int n = (int)random(0, 100);
            l.insertAt(i, n);
            println("INSERT : "+ n + " AT : " +i);
        }
    }
}
