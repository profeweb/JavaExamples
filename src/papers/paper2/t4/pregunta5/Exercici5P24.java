package papers.paper2.t4.pregunta5;

public class Exercici5P24 {

    public static void main(String[] args) {

        String s = "sometamosomatemos";
        boolean b = esCapicua(s);

        if(b==true){
            System.out.printf("%s és capicua.", s);
        }
        else {
            System.out.printf("%s no és capicua.", s);
        }
    }


    public static boolean esCapicua(String s){
        if(s.length()==1){
            return true;
        }
        else if(s.length()==2){
            return s.charAt(0)==s.charAt(1);
        }
        else {
            int n = s.length() - 1;
            char cFirst = s.charAt(0);
            char cLast = s.charAt(n);
            String sPart = s.substring(1, n);
            return (cFirst == cLast) && esCapicua(sPart);
        }
    }
}
