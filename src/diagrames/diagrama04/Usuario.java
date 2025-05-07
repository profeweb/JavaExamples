package diagrames.diagrama04;

public abstract class Usuario {

    // Atributs
    private int id;
    private String nombre;
    private String email;

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEmail(String email) { this.email = email; }
}

