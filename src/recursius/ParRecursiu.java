package recursius;

public class ParRecursiu {

    public static void main(String[] args){
        System.out.printf("%d és parell? %b.\n", 6, esParell(6));
        System.out.printf("%d és parell? %b.\n", 11, esParell(11));
    }

    public static boolean  esParell(int n){
        if(n==0){
            return true;
        }
        else {
            return !esParell(n-1);
        }
    }
}
