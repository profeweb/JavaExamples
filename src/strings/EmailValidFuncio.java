package strings;

import java.util.Scanner;

public class EmailValidFuncio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = input.next();

        System.out.printf("%s és vàlid? %b.\n", email, emailValid(email));
    }

    public static boolean emailValid(String email){
        int posAt = email.indexOf('@');
        int posAt2 = email.lastIndexOf('@');
        boolean oneAt = (posAt == posAt2);
        int posDot = email.lastIndexOf('.');
        int distAtDot = posDot - posAt;
        int numChars = email.length();
        int numCharsDomini = numChars - posDot - 1;

        if(posAt==-1 || posAt<3 || !oneAt){
            return false;
        }
        else if(posDot==-1 || distAtDot<3){
            return false;
        }
        else if( !(numCharsDomini == 2 || numCharsDomini == 3)){
            return false;
        }
        else {
            return true;
        }
    }
}
