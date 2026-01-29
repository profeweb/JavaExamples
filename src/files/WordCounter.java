package files;

import processing.core.PApplet;

import java.io.File;
import java.util.HashMap;

import static processing.core.PApplet.*;

public class WordCounter {

    HashMap<String, Integer> count;

    public WordCounter(){
        this.count = new HashMap<>() ;
    }

    public void processDocument(File file){

        String[] lines = loadStrings(file);
        String allwords = join(lines, "\n");
        String[] tokens = splitTokens(allwords, "\n\" ,;.?!");

        for (int i = 0; i <tokens.length; i++) {
            String word = tokens[i].toLowerCase();
            println(word);
            if (count.containsKey(word)) {
                int newValue = count.get(word) + 1;
                count.replace(word, newValue);
            } else {
                count.put(word, 1);
            }
        }
    }

    public int getCount(String term){
        return count.get(term);
    }

    public String[] getKeys(){
        String[] words = new String[count.size()];
        int i=0;
        for (String word : count.keySet()) {
            words[i] = word;
            i++;
        }
        return words;
    }

    public void display(PApplet p5){
        String[] keys = getKeys();
        for (String k : keys) {
            int value = count.get(k);
            p5.textSize(10 + value*5);
            float x = p5.random(p5.width);
            float y = p5.random(p5.height);
            p5.fill(0);
            p5.text(k + "("+value+")", x, y);
        }
    }


}
