package files;

import java.io.*;
import java.util.HashMap;


public class DiccionariLema {

    HashMap<String, String> lemaDic;
    boolean fet;

    public DiccionariLema(String file){

        lemaDic = new HashMap<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] parts = line.split("\t");
                String lema = parts[0];
                String terme = parts[1];
                lemaDic.put(terme, lema);
            }
            fet = true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isFet(){ return  this.fet; }

    public int getNumTerms(){ return lemaDic.size(); }

    public boolean containsLemma(String term){ return lemaDic.containsKey(term.toLowerCase()); }

    public String getLemma(String term){
        return lemaDic.get(term);
    }

}
