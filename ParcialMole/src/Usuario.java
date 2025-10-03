public class Usuario extends Persona {
    private String email;
    private int telefono;

    public Usuario(int dni, String nombre, String email, int telefono) {
        super(dni, nombre);
        this.email = email;
        this.telefono = telefono;
    }
}
