package recursius;

public class ComptarVocals {

    public static void main(String[] args) {
        String s = "murciElagOsA";
        System.out.println("Num Vocals: "+ comptarVocalsRec(s));
    }

    public static int comptarVocalsRec(String s){
        if(s.length()==1){
            return esVocal(s) ? 1 : 0;
        }
        else {
            String left = s.substring(0, s.length()/2);
            String dreta = s.substring(s.length()/2);
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
