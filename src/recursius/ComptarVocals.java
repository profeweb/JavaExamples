package recursius;

public class ComptarVocals {

    public static void main(String[] args) {
        String s = "murciElagOs";
        System.out.println("Num Vocals: "+ comptarVocalsRec(s));
    }

    public static int comptarVocalsRec(String s){
        if(s.length()==1){
            //String c = new String(s.charAt(0));
            //return esVocal(c) ? 1 : 0;
            return 0;
        }
        else {
            String left = s.substring(0, s.length()/2);
            String dreta = s.substring(s.length()/2, s.length());
            return comptarVocalsRec(left) + comptarVocalsRec(dreta);
        }
    }


    public static boolean esVocal(String s){
        return  s.toUpperCase().charAt(0)=='A' ||
                s.toUpperCase().charAt(0)=='E' ||
                s.toUpperCase().charAt(0)=='I' ||
                s.toUpperCase().charAt(0)=='O' ||
                s.toUpperCase().charAt(0)=='U';
    }
}
