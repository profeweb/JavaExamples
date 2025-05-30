package xarxes;

public class CompressioText {

    public static void main(String[] args) {

        // Text Original
        String original = "ABCCCCCCC DEF GGGGGG ZUQ.";
        System.out.println("Original Message: " + original);

        // Compressió del Text
        String zipped = zipText(original);
        System.out.println("Zipped Message: " + zipped);

        // Descompressió del Text
        String unzipped = unzipText(zipped);
        System.out.println("Unzipped Message: " + unzipped);
    }

    public static String zipText(String original){
        String  zipped = "";

        int count =  0, index = 0;

        // Mentre no arribem al final del text
        while(index < original.length()) {

            char currentChar = original.charAt(index);

            // Si és el darrer caràcter del text, no hi ha següent (nextChar)
            if(index== original.length()-1){
                zipped += currentChar;
                index++;
            }
            // Si no és el darrer caràcter del text, hi ha següent (nextChar)
            else {

                char nextChar = original.charAt(index + 1);

                // Si caràcter actual i següent són diferents
                if (currentChar != nextChar) {
                    zipped += currentChar;
                    index++;
                }
                // Si caràcter actual i següent són iguals
                else {
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

        // Mentre no arribem al final del text
        while(index<zipped.length()){

            char currentChar = zipped.charAt(index);

            // Si és el darrer caràcter del text, no hi ha següent (nextChar)
            if(index == zipped.length()-1){
                unzipped += currentChar;
                index++;
            }
            // Si no és el darrer caràcter del text, hi ha següent (nextChar)
            else {
                char nextChar = zipped.charAt(index + 1);

                // Si és un número
                if (Character.isDigit(nextChar)) {
                    int times = Character.getNumericValue(nextChar);
                    for (int t = 0; t < times; t++) {
                        unzipped += currentChar;
                    }
                    index += 2;
                }
                // Si no és un número
                else {
                    unzipped += currentChar;
                    index++;
                }
            }
        }
        return unzipped;
    }
}
