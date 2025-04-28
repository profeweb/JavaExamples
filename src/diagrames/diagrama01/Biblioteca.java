package diagrames.diagrama01;

public class Biblioteca {

    // Atributos
    private String nombre;
    private String direccion;
    private Material[] materiales;
    private Usuario[] usuarios;

    //Constructor

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.materiales = new Material[1000];
        this.usuarios = new Usuario[1000];
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Material[] getMaterials() {
        return materiales;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }


    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Altres
    public void agregarMaterial(Material material){ }

    public void registrarUsuario(Usuario usuario){ }

}
