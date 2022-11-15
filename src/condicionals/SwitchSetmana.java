package condicionals;

import basics.EnumeratDia;

import java.util.Scanner;

public class SwitchSetmana {

    public enum DIASETMANA { DILLUNS, DIMARTS, DIMECRES, DIJOUS, DIVENDRES, DISSABTE, DIUMENGE};

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Dia Setmana?");
        String s = input.next();
        DIASETMANA dia = DIASETMANA.valueOf(s);

        switch(dia){
            case DILLUNS:
            case DIMARTS:
            case DIMECRES:
            case DIJOUS:
            case DIVENDRES: System.out.println("DIA FANER!!!"); break;
            case DISSABTE:
            case DIUMENGE: System.out.println("CAP DE SETMANA!!!"); break;
            default: System.out.println("VALOR NO VÀLID");
        }
    }
}
