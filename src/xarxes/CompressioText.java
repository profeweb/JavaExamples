package xarxes;

public class CompressioText {

    public static void main(String[] args) {
        String original = "ABCCCCCCC DEF GGGGGG ZUQ.";
        String zipped = zipText(original);
        System.out.println("Zipped Message: " + zipped);
    }

    public static String zipText(String original){
        String  zipped = "";
        int count =  0, index = 0;
        while(index < original.length()-1) {
            char currentChar = original.charAt(index);
            char nextChar = original.charAt(index + 1);
            if (currentChar != nextChar) {
                zipped += currentChar;
                index++;
            } else {
                while (nextChar == currentChar) {
                    count++;
                    nextChar = original.charAt(index + count);
                }
                zipped += currentChar + String.valueOf(count);
                index += count;
                count = 0;
            }
        }

        return zipped;
    }

    public static String unzipText(String zipped){
        String unzipped = "";
        
        return unzipped;
    }
}
