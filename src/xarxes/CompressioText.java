package xarxes;

public class CompressioText {

    public static void main(String[] args) {
        String original = "ABCCCCCCC DEF GGGGGG ZUQ.";
        String zipped = zipText(original);
        System.out.println("Zipped Message: " + zipped);
        String unzipped = unzipText(zipped);
        System.out.println("Unzipped Message: " + unzipped);
    }

    public static String zipText(String original){
        String  zipped = "";
        int count =  0, index = 0;
        while(index < original.length()) {
            char currentChar = original.charAt(index);
            if(index== original.length()-1){
                zipped += currentChar;
                index++;
            }
            else {
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
        }

        return zipped;
    }

    public static String unzipText(String zipped){
        String unzipped = "";
        int index = 0;
        while(index<zipped.length()){
            char currentChar = zipped.charAt(index);
            if(index == zipped.length()-1){
                unzipped += currentChar;
                index++;
            }
            else {
                char nextChar = zipped.charAt(index + 1);
                if (Character.isDigit(nextChar)) {
                    int times = Character.getNumericValue(nextChar);
                    for (int t = 0; t < times; t++) {
                        unzipped += currentChar;
                    }
                    index += 2;
                } else {
                    unzipped += currentChar;
                    index++;
                }
            }
        }
        return unzipped;
    }
}
