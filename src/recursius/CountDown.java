package recursius;

public class CountDown {

    public static void main(String[] args){
        cd(10);
    }

    public static void cd(int n){
        if(n==0){
            System.out.print("Boooooom!!");
        }
        else {
            System.out.print(n+", ");
            cd(n-1);
        }
    }
}
