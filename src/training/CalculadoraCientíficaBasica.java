package training;

import java.util.Scanner;

public class CalculadoraCientíficaBasica {

    public static char [ ] operadors = { '+', '-', '*', '/', 'S', 'C', 'T', 'F', 'E', '=' };
    public static int numOperands;
    public static float[] operands;
    public static char operador;
    public static float resultat;
    public static String calculs;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        initCalculadora();

        while(true){

            String entrada = input.next();
            calculs += entrada;

            if(esOperador(entrada)){

                operador = entrada.charAt(0);

                if(esCalculFinal()){
                    mostraCalculsiResultat();
                    initCalculadora();
                }
                else if(esOperadorUnari() && numOperands==1){
                    aplicaOperacioUnaria();
                }

            }
            else {

                numOperands++;
                operands[numOperands - 1] = convertToFloat(entrada);

                if(numOperands == 1 && esSimbol()){
                    aplicaSimbol();
                }
                else if(numOperands == 1 && esOperadorUnari()){
                    aplicaOperacioUnaria();
                }
                else if(numOperands == 2 && esOperadorBinari()){
                    aplicaOperacioBinaria();

                }
            }
        }

    }

    public static void initCalculadora(){
        numOperands = 0;
        operands = new float[2];
        operador = ' ';
        calculs = "";
        resultat = 0;
    }

    public static boolean esOperador(String s) {
        if(s.length() == 1) {
            for(int i=0; i<operadors.length; i++ ){
                if(operadors[i] == s.charAt(0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean esSimbol(){
        return (operador=='+' || operador=='-');
    }

    public static boolean esCalculFinal(){
        return (operador=='=');
    }

    public static boolean esOperadorUnari(){
        return ( operador=='F' || operador=='C' || operador=='S' || operador =='T');
    }

    public static boolean esOperadorBinari(){
        return (operador=='+' || operador=='-' || operador=='*' || operador =='/' || operador=='E');
    }
    public static boolean esReset(){
        return (operador=='R');
    }

    public static void aplicaOperacioUnaria(){

        switch(operador){
            case 'F': resultat = factorial((int)operands[0]); break;
            case 'C': resultat = (float) Math.cos(operands[0]); break;
            case 'S': resultat = (float) Math.sin(operands[0]); break;
            case 'T': resultat = (float) Math.tan(operands[0]); break;
        }
        operands[0] = resultat;
        operador = ' ';
    }

    public static int factorial (int n){
        if(n==1){ return 1; }
        else { return n * factorial(n - 1); }
    }

    public static void aplicaOperacioBinaria(){

        switch(operador){
            case '+': resultat = operands[0] + operands[1]; break;
            case '-': resultat = operands[0] - operands[1]; break;
            case '*': resultat = operands[0] * operands[1]; break;
            case '/': resultat = operands[0] / operands[1]; break;
            case 'E': resultat = (float) Math.pow(operands[0] , operands[1]); break;
        }
        operands[0] = resultat;
        operands[1] = 0;
        numOperands = 1;
    }

    public static void aplicaSimbol(){
        if(operador=='-') {
            operands[0] *= -1;
            operador = ' ';
        }
    }

    public static void mostraCalculsiResultat(){
        System.out.println(calculs + " " +  resultat);
    }

    public static float convertToFloat(String s){
        return Float.valueOf(s);
    }

}
