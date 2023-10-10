package files;

import java.io.*;

public class PgnReader {

    public String event;

    public static String PATH = "C:\\Users\\tonim\\IdeaProjects\\JavaExamples\\src\\files\\";
    public static String fileName = "Bobby Fischer Game.pgn";
    public static String[] moves;
    public static int numMoves = 0;
    public static boolean continueMove = false;

    public static String[] ATTRIBUTES = {"Event", "Site", "Date", "Round", "White", "Black", "Result", "ECO", "PlyCount", "EventDate", "EventType", "EventRounds", "Source", "SourceDate"};

    public static void main(String[] args){
        //readPgnFile(PATH + fileName);

        moves = new String[100];
        parsePGN(PATH + fileName);
    }

    public static void readPgnFile(String fileName){
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println(fileName + " does not exist.");
            return;
        }
        if (!(file.isFile() && file.canRead())) {
            System.out.println(file.getName() + " cannot be read from.");
            return;
        }

        readPgnMoves(file);
        /*
        try {
            FileInputStream fis = new FileInputStream(file);
            char current;
            while (fis.available() > 0) {
                current = (char) fis.read();
                System.out.print(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
    }


    public static void readPgnMoves(File file)  {
        try{

            FileInputStream fis = new FileInputStream(file);

            char current;
            boolean firstPoint = true;
            String move = "";
            int numMoves = 1;
            while (fis.available() > 0) {

                current = (char) fis.read();

                if(current=='.' && firstPoint){
                    //System.out.println("Ajuntant 1st :" +current);
                    move += current;
                    firstPoint = false;
                }
                else if(current=='.' && !firstPoint){
                    int n = move.length();
                    //System.out.println(numMoves + ") " + move.substring(0, n-2));
                    move = "";
                    numMoves++;
                }
                else {
                    move += current;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parsePGN(String fileName){
        BufferedReader reader;

        boolean movesArea = false;

        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();

            while (line != null) {
                //System.out.println(line);
                getAttributes(line);
                if(movesArea) {
                    getMoves(line);
                }
                // read next line
                line = reader.readLine();
                if(line!=null && line.length()==0){
                    movesArea= true;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0; i<moves.length; i++){
            if(moves[i]!=null) {
                System.out.println((i + 1) + ") " + moves[i]);
            }
        }
    }


    public static void getAttributes(String line){
        for(String s : ATTRIBUTES) {
            if (line.indexOf("["+s+" ") != -1) {
                int index1 = line.indexOf("\"") + 1;
                int index2 = line.lastIndexOf("\"");
                String attributeInfo = line.substring(index1, index2);
                System.out.println(s + ":" + attributeInfo);
            }
        }
    }

    public static void getMoves(String line){

        String[] parts = line.split("\\.");

        for(int i=0; i<parts.length; i++){

            if(parts[i].length()>0) {

                int l = parts[i].length();
                if(l>=0) {

                    int firstSpace = parts[i].indexOf(" ");
                    int lastSpace  = parts[i].lastIndexOf(" ");

                    if(firstSpace == lastSpace && firstSpace==-1 ){
                    }
                    else if(firstSpace == lastSpace && i>0 ){
                        moves[numMoves] = parts[i].trim();
                    }
                    else if(firstSpace == lastSpace && i==0 && firstSpace>=0 && lastSpace>0 && l>3){
                        moves[numMoves] += " " + parts[i].substring(0, lastSpace);
                        numMoves++;
                    }
                    else {
                        int midSpace = parts[i].substring(firstSpace+1, lastSpace).indexOf(" ");
                        if(midSpace != -1) {
                            moves[numMoves] = parts[i].substring(firstSpace, lastSpace).trim();
                        }
                        else {
                            moves[numMoves] = parts[i].trim();
                        }
                        numMoves++;
                    }
                }
            }
        }



    }
}
