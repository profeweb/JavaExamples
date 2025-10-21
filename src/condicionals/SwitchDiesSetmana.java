package condicionals;

public class SwitchDiesSetmana {

    public enum DIES_SETMANA { DL, DM, DC, DJ, DV, DS, DG};

    public static void main(String[] args) {
        DIES_SETMANA d = DIES_SETMANA.DL;
        switch(d){
            case DL : case DM: case DC: case DJ: case DV:
                System.out.println("DIA FANER");
                break;
            case DS: case DG:
                System.out.println("CAP DE SETMANA");
         }
    }
}
