package strings;

public class ProvaSubtring03 {

    public static void main(String[] args) {

        String email = "treballador@empresa.com";
        boolean emailOk = false;

        // Regla 1: nom (abans de '@') amb llargada >= 2
        // Regla 2: domini (entre '@' i '.') amb llargada >= 2
        // Regla 3: extensió amb llargada 2 o 3 (.es, .com)
        // Regla 4: només hi ha un símbol '@' en tot l'email
        // Regla 5: només hi ha un símbol '.' entre el domini i l'extensió.
        // Regla 6: no hi pot haver espais en blanc

        int posAt = email.indexOf('@');
        int posDot = email.lastIndexOf('.');
        int posBlank = email.indexOf(' ');

        if(posBlank==-1 && posAt!=-1 && posDot!=-1 && posAt<posDot) {

            String nom = email.substring(0, posAt);
            String domini = email.substring(posAt + 1, posDot);
            String extensio = email.substring(posDot + 1);

            if(nom.length()>=2 && domini.length()>=2 &&
                    (extensio.length()==2 || extensio.length()==3)){
                emailOk = true;
            }
        }
        System.out.printf("L'email %s és vàlid: %b.", email, emailOk);
    }
}
