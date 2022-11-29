package strings;

public class FuncionsString {

    public static void main(String[] args){
        String nom = "Paquitai";
        System.out.printf("%s té %d lletres.\n", nom, nom.length());
        System.out.printf("La lletra %d és %c.\n", 3, nom.charAt(3));
        System.out.printf("La darrera lletra és %c.\n", nom.charAt(nom.length()-1));
        System.out.println(nom.toUpperCase());
        System.out.println(nom.toLowerCase());
        System.out.println(nom.substring(0, 3));
        System.out.printf("La lletra i està a %d.\n", nom.indexOf('i'));
        System.out.printf("La lletra x està a %d.\n", nom.indexOf('x'));
        System.out.printf("La darrera lletra i està a %d.\n", nom.lastIndexOf('i'));
        System.out.printf("Comença per Pa? %b.\n", nom.startsWith("Pa"));
        System.out.printf("Acaba en to? %b.\n", nom.endsWith("to"));
        System.out.println(nom.concat(", com estas?"));
        System.out.println(nom.replace('a', 'u'));
    }
}
