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

                // Si és un número ('0'-'9')
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

    public static boolean esNumero(char c){
        return c=='0' || c=='1' || c=='2' || c=='3' ||
                c=='4' || c=='5' || c=='6' ||
                c=='7' || c=='8' || c=='9';
    }

    public int convertCharToInt(char c){
        if(c=='0'){ return 0; }
        else if(c=='1'){ return 1; }
        else if(c=='2'){ return 2; }
        else if(c=='3'){ return 3; }
        else if(c=='4'){ return 4; }
        else if(c=='5'){ return 5; }
        else if(c=='6'){ return 6; }
        else if(c=='7'){ return 7; }
        else if(c=='8'){ return 8; }
        else if(c=='9'){ return 9; }
        else { return '0'; }
    }
}
