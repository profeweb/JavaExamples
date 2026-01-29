package files;

import processing.core.PApplet;

import java.io.File;

// term frequency–inverse document frequency
public class TF_IDF {
    public static float termFreq(String term, File document){
        WordCounter wc = new WordCounter();
        wc.processDocument(document);
        return wc.getCount(term);
    }

    public static float inverseDocFreq(String term, File document){
        return 0f;
    }


}
