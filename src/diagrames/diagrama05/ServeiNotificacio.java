package diagrames.diagrama05;

public class ServeiNotificacio {

    public void enviarRecordatori(Usuari u, String missatge) {
        System.out.println("Enviant recordatori a " + u.getNom() + ": " + missatge);
    }

}
